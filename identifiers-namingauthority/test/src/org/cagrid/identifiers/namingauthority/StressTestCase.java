package org.cagrid.identifiers.namingauthority;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.cagrid.identifiers.namingauthority.impl.SecurityInfoImpl;
import org.cagrid.identifiers.namingauthority.test.NamingAuthorityTestCaseBase;
import org.springframework.test.annotation.Rollback;

public class StressTestCase extends NamingAuthorityTestCaseBase
{
	@Rollback(false)
	public void testStress() throws Exception
	{
		StressTestUtil.testUtil = new TestUtil(NamingAuthority);
		long numberOfTests = 100l;
		int numberOfThreads = 3;
		int threadPool = 3;
		double average=0;
		long total=0;
		SecurityInfo client = new SecurityInfoImpl("srikalyan");
		TestName testName=TestName.REGISTER_GSID;
		// this.NamingAuthority.registerSite(client, "site", "a", "1.0",
		// "srikalyan", "srikalyan@semanticbits.com","443-481-7555", "sb");
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
			StressTestUtil e = future.get();
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
			long diff=currentThreadPair.finish-currentThreadPair.finish;
			System.out.println("Duration: "+diff);			
			
			total+=diff;			
		}
		average=(double)total/((double)numberOfTests*1000.0);
		System.out.println("The average time is "+average);
		System.out.println("##############################################################");		
	}
}
