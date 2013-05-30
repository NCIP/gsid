/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class StressTestUtil extends Thread
{
	private static Log log = LogFactory.getLog(StressTestUtil.class);
	private static Random rand = new Random();
	private static String fileName = "temp.txt";
	private static int size = 500;
	public static long avgNumOfTests=100l;
	private static int randomIdentifierSize = 500;
	public static final int MAX_NUM_FOR_BATCH = 100;
	public TestUtil testUtil;
	private String threadName;
	private long currentNumberOfTests;
	private TestName currentTestName;
	SecurityInfo currentClient;
	private static Map<String,Pair<Long>> threadTime=new HashMap<String,Pair<Long>>();
	private static FileOutputStream fout = null;
	private static PrintStream p=null;
	
	
	public static void createStream()
	{	
		try
		{
			fout = new FileOutputStream(fileName, true);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		if (fout != null)
		{
			p = new PrintStream(fout);
		}
	}

	public StressTestUtil()
	{
		super();
		testUtil=new TestUtil();
	}

	public StressTestUtil(String threadName, long currentNumberOfTests, TestName currentTestName,
			SecurityInfo currentClient)
	{
		this();
		this.threadName = threadName;
		this.currentNumberOfTests = currentNumberOfTests;
		this.currentTestName = currentTestName;
		this.currentClient = currentClient;		
	}
	
	public StressTestUtil(String threadName, long currentNumberOfTests, TestName currentTestName,
			SecurityInfo currentClient,TestUtil testUtil)
	{
		
		this.threadName = threadName;
		this.currentNumberOfTests = currentNumberOfTests;
		this.currentTestName = currentTestName;
		this.currentClient = currentClient;		
		this.testUtil=testUtil;
	}
	
	public static void recreateTempFile()
	{
		try
		{
			File f=new File(fileName);			
			f.delete();
		}
		catch(Exception e)
		{
			
		}
		createStream();
	}

	public void run()
	{
		try
		{
			testStress();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			log.error("Exception occured while executing tests\nMSG: "+e.getMessage());
		}
		
	}
	
	public static Map<String,Pair<Long>> getThreadTime()
	{
		return threadTime;
	}

	private void testStress() throws Exception
	{
		String message = "";
		long t1 = 0l;
		switch (currentTestName)
		{
			case REGISTER_GSID:				
				sleep(500);
				message = "Time Taken for testOnlyRegisterGSID is ";
				t1 = System.currentTimeMillis();
				testOnlyRegisterGSID(currentClient, currentNumberOfTests);
				break;
			case PARENT_HIERARCHY:
				message = "Time Taken for testOnlyGetParentHierarchy is ";
				t1 = System.currentTimeMillis();
				testOnlyGetParentHierarchy(currentClient, currentNumberOfTests);
				break;
			case CHILD_HIERARCHY:
				message = "Time Taken for testOnlyChildHierarchy is ";
				t1 = System.currentTimeMillis();
				testOnlyGetChildHierarchy(currentClient, currentNumberOfTests);
				break;
			case VALIDATE_IDENTIFIER:
				message = "Time Taken for testOnlyValidateIdentifier is ";
				t1 = System.currentTimeMillis();
				testOnlyValidateIdentifier(currentClient, currentNumberOfTests);
				break;
			case RESOLVE_IDENTIFIER:
				message = "Time Taken for testOnlyResolveIdentifier is ";
				t1 = System.currentTimeMillis();
				testOnlyResolveIdentifier(currentClient, currentNumberOfTests);
				break;
			case ADD_SITE:
				message = "Time Taken for testOnlyAddSite is ";
				t1 = System.currentTimeMillis();
				testOnlyAddSite(currentClient, currentNumberOfTests);
				break;
			case BATCH_IDENTIFIERS:
				message = "Time Taken for testOnlyBatchIdentifiers is ";
				t1 = System.currentTimeMillis();
				testOnlyBatchIdentifiers(currentClient, currentNumberOfTests);
				break;
			case ALL:
				message = "Time Taken for allInOne is ";
				t1 = System.currentTimeMillis();
				testAll(currentClient, currentNumberOfTests);
				break;
		}
		long t2 = System.currentTimeMillis();
		threadTime.put(threadName, new Pair(t1,t2));
	}

	public void testOnlyRegisterGSID(SecurityInfo client, long numberOfTests)
	{
		List<String> identifiers = new ArrayList<String>();

		String suggestedIdentifier = null;
		int randomNumber;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(20);
			String parentIdentifiers[] = null;
			// 2 parents 5%
			if (randomNumber == 0 && identifiers.size() > 2)
			{
				int firstIdIndex = rand.nextInt(identifiers.size());
				int secondIdIndex = rand.nextInt(identifiers.size());
				while (secondIdIndex == firstIdIndex)
					secondIdIndex = rand.nextInt(identifiers.size());
				parentIdentifiers = new String[] { identifiers.get(firstIdIndex), identifiers.get(secondIdIndex) };
			}
			// 1 parent 25 %
			else if (identifiers.size() > 0 && randomNumber % 4 == 1)
			{
				int firstIdIndex = rand.nextInt(identifiers.size());
				parentIdentifiers = new String[] { identifiers.get(firstIdIndex) };
			}

			try
			{
				String identifier = testUtil.registerGSID(client, suggestedIdentifier, parentIdentifiers);
				// if(i%100==0)
				// System.out.println(i);
				addElement2List(identifiers, identifier);
				writeToFile(identifier);
			}
			catch (Exception e)
			{
				System.out.println("exception occured1 " + e.getMessage());
				e.printStackTrace();
				StringBuffer sb = new StringBuffer();
				for (StackTraceElement temp : e.getStackTrace())
					sb.append(temp.getClassName() + "[" + temp.getLineNumber() + "]\n");
				log.debug("exception occured \n" + sb.toString());
			}
		}
	}

	public void testOnlyGetParentHierarchy(SecurityInfo client, long numberOfTests)
	{
		List<String> identifiers = readIdentifiers(numberOfTests);
		if (identifiers.size() == 0)
		{
			log.error("Cannot perform this test as there are not identifiers in the file " + fileName);
			return;
		}
		int randomNumber;
		String identifier;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(identifiers.size());
			identifier = identifiers.get(randomNumber);
			try
			{
				testUtil.getParentHierarch(client, identifier);
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public void testOnlyGetChildHierarchy(SecurityInfo client, long numberOfTests)
	{
		List<String> identifiers = readIdentifiers(numberOfTests);
		if (identifiers.size() == 0)
		{
			log.error("Cannot perform this test as there are not identifiers in the file " + fileName);
			return;
		}
		int randomNumber;
		String identifier;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(identifiers.size());
			identifier = identifiers.get(randomNumber);
			try
			{
				testUtil.getChildHierarch(client, identifier);
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public void testOnlyResolveIdentifier(SecurityInfo client, long numberOfTests)
	{
		List<String> identifiers = readIdentifiers(numberOfTests);
		if (identifiers.size() == 0)
		{
			log.error("Cannot perform this test as there are not identifiers in the file " + fileName);
			return;
		}
		int randomNumber;
		String identifier;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(identifiers.size());
			identifier = identifiers.get(randomNumber);
			try
			{
				testUtil.resolveIdentifier(client, identifier);
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public void testOnlyValidateIdentifier(SecurityInfo client, long numberOfTests)
	{
		List<String> identifiers = readIdentifiers(numberOfTests);
		if (identifiers.size() == 0)
		{
			log.error("Cannot perform this test as there are not identifiers in the file " + fileName);
			return;
		}
		addSomeRandomIdentifiers(identifiers);
		int randomNumber;
		String identifier;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(identifiers.size());
			identifier = identifiers.get(randomNumber);
			try
			{
				testUtil.validateIdentifier(client, identifier);
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public void testOnlyBatchIdentifiers(SecurityInfo client, long numberOfTests)
	{
		int randomNumber;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(MAX_NUM_FOR_BATCH);
			try
			{
				testUtil.createBatchIdentifiers(client, randomNumber);
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public void testOnlyAddSite(SecurityInfo client, long numberOfTests)
	{
		List<String> identifiers = readIdentifiers(numberOfTests);
		if (identifiers.size() == 0)
		{
			log.error("Cannot perform this test as there are not identifiers in the file " + fileName);
			return;
		}
		int randomNumber;
		String identifier;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(identifiers.size());
			identifier = identifiers.get(randomNumber);
			try
			{
				testUtil.addSite(client, identifier);
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public void testAll(SecurityInfo client, long numberOfTests)
	{
		int randomNumber;
		String identifier;
		int onlyOne = 1;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(7);
			switch (randomNumber)
			{
				case 0:
					testOnlyRegisterGSID(client, onlyOne);
					break;
				case 1:
					testOnlyBatchIdentifiers(client, onlyOne);
					break;
				case 2:
					testOnlyAddSite(client, onlyOne);
					break;
				case 3:
					testOnlyResolveIdentifier(client, onlyOne);
					break;
				case 4:
					testOnlyValidateIdentifier(client, onlyOne);
					break;
				case 5:
					testOnlyGetParentHierarchy(client, onlyOne);
					break;
				case 6:
					testOnlyGetChildHierarchy(client, onlyOne);
			}
		}
	}

	private static void addSomeRandomIdentifiers(List<String> list)
	{
		for (int i = 0; i < randomIdentifierSize; i++)
		{
			UUID temp = UUID.randomUUID();
			int tempSize = list.size() - 1;
			list.add(rand.nextInt(tempSize), temp.toString());
		}
	}

	private static void addElement2List(List<String> list, String value)
	{

		if (list.size() < size)
			list.add(value);
		else
		{
			int num = rand.nextInt(1000);
			if (num < size)
			{
				list.remove(num);
				list.add(value);
			}
		}
	}

	private synchronized void writeToFile(String line)
	{	
		p.println(line);		
	}

	private List<String> readIdentifiers(long numberOfTests)
	{
		BufferedReader br = null;
		FileInputStream file = null;
		List<String> identifiers = new ArrayList<String>();
		int threadValue=Integer.parseInt(threadName);
		long min_limit=threadValue*avgNumOfTests;
		numberOfTests=numberOfTests==1?10:numberOfTests;
		long max_limit=min_limit+numberOfTests;
		long counter=0;
		try
		{
			file = new FileInputStream(fileName);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		if (file != null)
			br = new BufferedReader(new InputStreamReader(new DataInputStream(file)));
		if (br != null)
		{
			String line = null;
			try
			{
				while ((line = br.readLine()) != null)
				{
					counter++;
					if(counter<min_limit)
						continue;
					else if(counter>max_limit)
						break;
					else
					addElement2List(identifiers, line);
				}
				br.close();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		return identifiers;
	}
	
	public void finalize() throws Throwable
	{
		p.close();
		super.finalize();
	}

}
