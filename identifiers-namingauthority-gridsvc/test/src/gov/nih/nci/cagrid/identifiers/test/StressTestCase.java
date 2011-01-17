package gov.nih.nci.cagrid.identifiers.test;

import gov.nih.nci.cacoresdk.util.GridAuthenticationClient;
import gov.nih.nci.cagrid.identifiers.client.IdentifiersNAServiceClient;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.axis.types.URI.MalformedURIException;
import org.cagrid.identifiers.namingauthority.impl.SecurityInfoImpl;
import org.globus.gsi.GlobusCredential;

public class StressTestCase
{

	private static final String CLIENT_PROPERTIES = "etc/client.properties";
	private static final String SYNC_DESCRIPTION = "sync.description";	

	protected static Properties props = null;
	static
	{
		props = readProperties();
	}

	private static Properties readProperties()
	{
		Properties properties = new Properties();
		try
		{
			properties.load(new FileInputStream(CLIENT_PROPERTIES));
		}
		catch (Exception e)
		{
			// TODO: Display appropriate client error
			System.out.println("Exception while accessing " + CLIENT_PROPERTIES + " : " + e.getMessage());
			System.exit(-1);
		}

		return properties;
	}

	private static String readFromFile(String fileName) throws IOException
	{
		FileReader fileReader = new FileReader(fileName);
		BufferedReader bfReader = new BufferedReader(fileReader);
		String idStr = "";
		String str = "";
		while ((str = bfReader.readLine()) != null)
		{
			idStr += str;
		}
		bfReader.close();
		return idStr;
	}

	private static void run(String gridSvcUrl, int iterations, String eprStr, String cqlStr)
			throws MalformedURIException, RemoteException
	{

		// KeyValues[] keyValues = new KeyValues[2];
		// keyValues[0] = new KeyValues();
		// keyValues[0].setKey("EPR");
		// Values values = new Values();
		// values.setValue(new String[] { eprStr });
		// keyValues[0].setValues(values);
		//
		// keyValues[1] = new KeyValues();
		// keyValues[1].setKey("CQL");
		// values = new Values();
		// values.setValue(new String[] { cqlStr });
		// keyValues[1].setValues(values);
		//
		// KeyValuesMap keyValuesMap = new KeyValuesMap();
		// keyValuesMap.setKeyValues(keyValues);
		//
		// IdentifiersNAServiceClient client = new IdentifiersNAServiceClient(
		// gridSvcUrl );
		//
		// for(int i=0; i < iterations; i++) {
		// org.apache.axis.types.URI identifier =
		// client.createIdentifier(keyValuesMap);
		// System.out.println("["+i+"] " + identifier);
		// }
	}

	public static void main(String[] args)
	{
		
		GlobusCredential creds = null;
		try
		{
			syncTrust();
			String userId = "srikal";
			String password = "123456G00gle12#";
			String authenticationServiceURL = "https://dorian.training.cagrid.org:8443/wsrf/services/cagrid/Dorian";
			String dorianURL = "https://dorian.training.cagrid.org:8443/wsrf/services/cagrid/Dorian";
			creds = GridAuthenticationClient.authenticate(dorianURL, authenticationServiceURL, userId, password);			
			System.out.println("Using proxy with id= " + creds.getIdentity() + " and lifetime " + creds.getTimeLeft());
		}
		catch (Exception e1)
		{
			System.out.println("No proxy file loaded so running with no credentials\n" + e1.getMessage());
			e1.getStackTrace();
		}

		try
		{
			IdentifiersNAServiceClient client = new IdentifiersNAServiceClient(
					"https://localhost:8443/wsrf/services/cagrid/IdentifiersNAService", creds);
			//client.registerSite("site", "a", "1.0", "srikalyan", "srikalyan@semanticbits.com", "443-481-7555", "sb");
			
			long numberOfTests = 1l;
			int numberOfThreads = 5;
			int threadPool = 5;
			double average=0;
			long total=0;			
			TestName testName=TestName.RESOLVE_IDENTIFIER;
			// this.NamingAuthority.registerSite(client, "site", "a", "1.0", "srikalyan", "srikalyan@semanticbits.com","443-481-7555", "sb");
			ExecutorService executor = Executors.newFixedThreadPool(threadPool);
			List<Future<StressTestUtil>> futures = new ArrayList<Future<StressTestUtil>>();			
			for (int i = 0; i < numberOfThreads; i++)
			{
				String threadName = "t" + i;
				StressTestUtil thread = new StressTestUtil(threadName, numberOfTests,testName, client);
				Future<StressTestUtil> future = executor.submit(thread, thread);
				futures.add(future);
			}
			for (Future<StressTestUtil> future : futures)
			{
				try
				{
					StressTestUtil e = future.get();
				}
				catch (InterruptedException e)
				{
					System.out.println("Interrupted Exception occured "+e.getMessage());
				}
				catch (ExecutionException e)
				{
					System.out.println("Execution Exception occured "+e.getMessage());
				}
			}
			Map<String,Pair<Long>> threadTime=StressTestUtil.getThreadTime();	
			System.out.println("##############################################################");
			System.out.println("Number of tests "+numberOfTests);
			for(String key:threadTime.keySet())
			{
				
				System.out.println("Thread: "+key);
				Pair<Long> currentThreadPair=threadTime.get(key);
				System.out.println("Start Time: "+currentThreadPair.start);
				System.out.println("End Time: "+currentThreadPair.finish);
				long diff=currentThreadPair.finish-currentThreadPair.start;
				System.out.println("Duration: "+diff);			
				
				total+=diff;			
			}
			average=(double)total/((double)numberOfTests*(double)numberOfThreads*1000.0);
			System.out.println("The average time is "+average);
			System.out.println("##############################################################");	
			executor.shutdown();
			
			
		}
		catch (MalformedURIException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (RemoteException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void syncTrust()
	{
		System.out.println("Synchronize Once...");
		GridAuthenticationClient.synchronizeOnce(props.getProperty(SYNC_DESCRIPTION));
		System.out.println("Synchronize Complete.");
	}
}
