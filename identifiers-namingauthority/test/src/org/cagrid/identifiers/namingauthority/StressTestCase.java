package org.cagrid.identifiers.namingauthority;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.cagrid.identifiers.namingauthority.impl.SecurityInfoImpl;
import org.cagrid.identifiers.namingauthority.test.NamingAuthorityTestCaseBase;
import org.junit.Test;

public class StressTestCase
{
	@Test
	public void testStress() throws Exception
	{
		long numberOfTests = StressTestUtil.avgNumOfTests = 100l;
		int[] numberOfThreadz = {  1};
		int threadPool = 50;		
		for (int numberOfThreads : numberOfThreadz )
		{
			System.out.println("\n\n\n*********************************************************************");
			System.out.println("The number of threads "+numberOfThreads);
			double average = 0;
			SecurityInfo client = new SecurityInfoImpl("srikalyan");
			TestName[] tests = { TestName.REGISTER_GSID, TestName.PARENT_HIERARCHY, TestName.CHILD_HIERARCHY,
					TestName.VALIDATE_IDENTIFIER, TestName.RESOLVE_IDENTIFIER, TestName.ADD_SITE,
					TestName.BATCH_IDENTIFIERS, TestName.ALL };
			for (TestName testName : tests)
			{

				// this.NamingAuthority.registerSite(client, "site", "a", "1.0",
				// "srikalyan", "srikalyan@semanticbits.com","443-481-7555",
				// "sb");
				ExecutorService executor = Executors.newFixedThreadPool(threadPool);
				List<Future<StressTestUtil>> futures = new ArrayList<Future<StressTestUtil>>();
				List<StressTestUtil> temp = new ArrayList<StressTestUtil>();
				if (testName == TestName.REGISTER_GSID)
					StressTestUtil.recreateTempFile();
				Thread.sleep(10000);
				long startStress = System.currentTimeMillis();
				for (int i = 0; i < numberOfThreads; i++)
				{
					String threadName = "" + i;
					StressTestUtil thread = new StressTestUtil(threadName, numberOfTests, testName, client);// ,new
																											// TestUtil(this.NamingAuthority));
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
						System.out.println("Interrupted Exception occured " + e.getMessage());
					}
					catch (ExecutionException e)
					{
						System.out.println("Execution Exception occured " + e.getMessage());
					}
				}
				long endStress = System.currentTimeMillis();
				System.out.println("##############################################################");

				System.out.println(" the duration test " + testName.name() + " is " + (endStress - startStress));
				average = ((double) (endStress - startStress))
						/ (((double) numberOfTests) * ((double) numberOfThreads) * 1000.0);
				System.out.println("the avg process is " + average);
				Map<String, Pair<Long>> threadTime = StressTestUtil.getThreadTime();
				// System.out.println("##############################################################");
				// System.out.println("Number of Threads "+numberOfThreads);
				long total = 0;
				for (String key : threadTime.keySet())
				{
					// System.out.println("Thread: "+key);
					Pair<Long> currentThreadPair = threadTime.get(key);
					// System.out.println("Start Time: "+currentThreadPair.start);
					// System.out.println("End Time: "+currentThreadPair.finish);
					long diff = currentThreadPair.finish - currentThreadPair.start;
					// System.out.println("Duration: "+diff);
					total += diff;
				}
				average = (double) total / (((double) numberOfTests) * ((double) numberOfThreads) * 1000.0);
				System.out.println("The average response time is " + average);
				System.out.println("##############################################################");
				executor.shutdown();
				Thread.sleep(10000);
			}
		}
	}
}
