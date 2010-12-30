package gov.nih.nci.cagrid.identifiers.test;

import gov.nih.nci.cagrid.identifiers.client.IdentifiersNAServiceClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class StressTestUtil
{
	private static Log log = LogFactory.getLog(StressTestUtil.class);
	private static Random rand = new Random();
	private static String fileName="temp.txt";	
	private static int size=500;
	private static int randomIdentifierSize=500;
	private static final int MAX_NUM_FOR_BATCH=100; 
	
	
	public static void testOnlyRegisterGSID(IdentifiersNAServiceClient client, long numberOfTests)
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
				String identifier = TestUtil.registerGSID(client, suggestedIdentifier, parentIdentifiers);
				System.out.println(i+" "+identifier);
				addElement2List(identifiers, identifier);
				writeToFile(identifier);
			}
			catch (Exception e)
			{
				System.out.println("exception occured "+e.getMessage());
				log.debug("exception occured \n" + e.getMessage());
			}
		}
	}

	public static void testOnlyGetParentHierarchy(IdentifiersNAServiceClient client, long numberOfTests)
	{
		List<String> identifiers=readIdentifiers();
		if(identifiers.size()==0)
		{
			log.error("Cannot perform this test as there are not identifiers in the file "+fileName);
			return;
		}
		int randomNumber;
		String identifier;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(identifiers.size());
			identifier=identifiers.get(randomNumber);
			try
			{
				TestUtil.getParentHierarch(client, identifier);				
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}		
	}
	
	public static void testOnlyGetChildHierarchy(IdentifiersNAServiceClient client, long numberOfTests)
	{
		List<String> identifiers=readIdentifiers();
		if(identifiers.size()==0)
		{
			log.error("Cannot perform this test as there are not identifiers in the file "+fileName);
			return;
		}
		int randomNumber;
		String identifier;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(identifiers.size());
			identifier=identifiers.get(randomNumber);
			try
			{
				TestUtil.getChildHierarch(client, identifier);				
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}		
	}
	
	public static void testOnlyResolveIdentifier(IdentifiersNAServiceClient client, long numberOfTests)
	{
		List<String> identifiers=readIdentifiers();
		if(identifiers.size()==0)
		{
			log.error("Cannot perform this test as there are not identifiers in the file "+fileName);
			return;
		}
		int randomNumber;
		String identifier;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(identifiers.size());
			identifier=identifiers.get(randomNumber);
			try
			{
				TestUtil.resolveIdentifier(client, identifier);				
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}		
	}
	
	public static void testOnlyValidateIdentifier(IdentifiersNAServiceClient client, long numberOfTests)
	{
		List<String> identifiers=readIdentifiers();
		if(identifiers.size()==0)
		{
			log.error("Cannot perform this test as there are not identifiers in the file "+fileName);
			return;
		}
		addSomeRandomIdentifiers(identifiers);
		int randomNumber;
		String identifier;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(identifiers.size());
			identifier=identifiers.get(randomNumber);
			try
			{
				TestUtil.validateIdentifier(client, identifier);				
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}		
	}
	
	public static void testOnlyBatchIdentifiers(IdentifiersNAServiceClient client, long numberOfTests)
	{
		int randomNumber;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(MAX_NUM_FOR_BATCH);			
			try
			{
				TestUtil.createBatchIdentifiers(client, randomNumber);				
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}	
	}
	
	public static void testOnlyAddSite(IdentifiersNAServiceClient client, long numberOfTests)
	{
		List<String> identifiers=readIdentifiers();
		if(identifiers.size()==0)
		{
			log.error("Cannot perform this test as there are not identifiers in the file "+fileName);
			return;
		}
		int randomNumber;
		String identifier;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(identifiers.size());
			identifier=identifiers.get(randomNumber);
			try
			{
				TestUtil.addSite(client, identifier);				
			}
			catch (Exception e)
			{
				log.debug("exception occured \n" + e.getMessage());
			}
		}	
	}
	
	public static void testAll(IdentifiersNAServiceClient client, long numberOfTests)
	{
		int randomNumber;
		String identifier;
		int onlyOne=1;
		for (long i = 0l; i < numberOfTests; i++)
		{
			randomNumber = rand.nextInt(7);
			switch(randomNumber)
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
		for(int i=0;i<randomIdentifierSize;i++)
		{
			UUID temp=UUID.randomUUID();
			list.add(rand.nextInt(list.size()), temp.toString());
		}		
	}

	private static void addElement2List(List<String> list, String value)
	{
		
		if (list.size() < size)
			list.add(value);
		else
		{
			int num=rand.nextInt(1000);
			if(num<size)
			{
				list.remove(num);
				list.add(value);
			}
		}
	}
	
	private static void writeToFile(String line)
	{
		FileOutputStream fout=null;
		try
		{
			fout = new FileOutputStream(fileName,true);
		}
		catch (FileNotFoundException e)
		{			
			e.printStackTrace();
		}
		if(fout!=null)
		{
			PrintStream p = new PrintStream(fout);
			p.println(line);
			p.close();
		}		
	}
	
	
	private static List<String> readIdentifiers()
	{
		BufferedReader br=null;
		FileInputStream file=null;
		List<String> identifiers=new ArrayList<String>();
		try
		{
			file = new FileInputStream(fileName);
		}
		catch (FileNotFoundException e)
		{			
			e.printStackTrace();
		}		
		if(file!=null)
		br = new BufferedReader(new InputStreamReader(new DataInputStream(file)));
		if(br!=null)
		{
			String line=null;
			try
			{
				while((line=br.readLine())!=null)
				{
					addElement2List(identifiers,line);
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
