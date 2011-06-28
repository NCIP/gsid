package gov.nih.nci.cagrid.identifiers.test;

import gov.nih.nci.cagrid.identifiers.client.IdentifiersNAServiceClient;

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
	private static int randomIdentifierSize = 500;
	private static final int MAX_NUM_FOR_BATCH = 100;
	public TestUtil testUtil;
	private String threadName;
	private long currentNumberOfTests;
	private TestName currentTestName;
	private IdentifiersNAServiceClient client;
	private static Map<String, Pair<Long>> threadTime = new HashMap<String, Pair<Long>>();

	public StressTestUtil()
	{

	}

	public StressTestUtil(String threadName, long currentNumberOfTests, TestName currentTestName,
			IdentifiersNAServiceClient client)
	{
		super();
		this.threadName = threadName;
		this.currentNumberOfTests = currentNumberOfTests;
		this.currentTestName = currentTestName;
		this.client = client;
		testUtil = new TestUtil(client);
	}

	public static void deleteTempFile()
	{
		try
		{
			File f = new File(fileName);
			f.delete();
		}
		catch (Exception e)
		{

		}
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
			log.error("Exception occured while executing tests\nMSG: " + e.getMessage());
		}

	}

	public static Map<String, Pair<Long>> getThreadTime()
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
				StressTestUtil.deleteTempFile();
				message = "Time Taken for testOnlyRegisterGSID is ";
				t1 = System.currentTimeMillis();
				testOnlyRegisterGSID(currentNumberOfTests);
				break;
			case PARENT_HIERARCHY:
				message = "Time Taken for testOnlyGetParentHierarchy is ";
				t1 = System.currentTimeMillis();
				testOnlyGetParentHierarchy(currentNumberOfTests);
				break;
			case CHILD_HIERARCHY:
				message = "Time Taken for testOnlyChildHierarchy is ";
				t1 = System.currentTimeMillis();
				testOnlyGetChildHierarchy(currentNumberOfTests);
				break;
			case VALIDATE_IDENTIFIER:
				message = "Time Taken for testOnlyValidateIdentifier is ";
				t1 = System.currentTimeMillis();
				testOnlyValidateIdentifier(currentNumberOfTests);
				break;
			case RESOLVE_IDENTIFIER:
				message = "Time Taken for testOnlyResolveIdentifier is ";
				t1 = System.currentTimeMillis();
				testOnlyResolveIdentifier(currentNumberOfTests);
				break;
			case ADD_SITE:
				message = "Time Taken for testOnlyAddSite is ";
				t1 = System.currentTimeMillis();
				testOnlyAddSite(currentNumberOfTests);
				break;
			case BATCH_IDENTIFIERS:
				message = "Time Taken for testOnlyBatchIdentifiers is ";
				t1 = System.currentTimeMillis();
				testOnlyBatchIdentifiers(currentNumberOfTests);
				break;
			case ALL:
				message = "Time Taken for allInOne is ";
				t1 = System.currentTimeMillis();
				testAll(currentNumberOfTests);
				break;
		}
		long t2 = System.currentTimeMillis();
		threadTime.put(threadName, new Pair(t1, t2));
	}

	public void testOnlyRegisterGSID(long numberOfTests)
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
				String identifier = testUtil.registerGSID(suggestedIdentifier, parentIdentifiers);
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

	public void testOnlyGetParentHierarchy(long numberOfTests)
	{
		List<String> identifiers = readIdentifiers();
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
				testUtil.getParentHierarch(identifier);
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public void testOnlyGetChildHierarchy(long numberOfTests)
	{
		List<String> identifiers = readIdentifiers();
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
				testUtil.getChildHierarch(identifier);
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public void testOnlyResolveIdentifier(long numberOfTests)
	{
		List<String> identifiers = readIdentifiers();
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
				testUtil.resolveIdentifier(identifier);
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public void testOnlyValidateIdentifier(long numberOfTests)
	{
		List<String> identifiers = readIdentifiers();
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
				testUtil.validateIdentifier(identifier);
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public void testOnlyBatchIdentifiers(long numberOfTests)
	{
		int randomNumber;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(MAX_NUM_FOR_BATCH);
			try
			{
				testUtil.createBatchIdentifiers(randomNumber);
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public void testOnlyAddSite(long numberOfTests)
	{
		List<String> identifiers = readIdentifiers();
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
				testUtil.addSite(identifier);
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public void testAll(long numberOfTests)
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
					testOnlyRegisterGSID(onlyOne);
					break;
				case 1:
					testOnlyBatchIdentifiers(onlyOne);
					break;
				case 2:
					testOnlyAddSite(onlyOne);
					break;
				case 3:
					testOnlyResolveIdentifier(onlyOne);
					break;
				case 4:
					testOnlyValidateIdentifier(onlyOne);
					break;
				case 5:
					testOnlyGetParentHierarchy(onlyOne);
					break;
				case 6:
					testOnlyGetChildHierarchy(onlyOne);
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

	private synchronized static void writeToFile(String line)
	{
		FileOutputStream fout = null;
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
			PrintStream p = new PrintStream(fout);
			p.println(line);
			p.close();
		}
	}

	private static List<String> readIdentifiers()
	{
		BufferedReader br = null;
		FileInputStream file = null;
		List<String> identifiers = new ArrayList<String>();
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

}
