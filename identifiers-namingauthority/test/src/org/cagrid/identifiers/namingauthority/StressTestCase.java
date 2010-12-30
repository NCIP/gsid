package org.cagrid.identifiers.namingauthority;

import org.cagrid.identifiers.namingauthority.impl.SecurityInfoImpl;
import org.cagrid.identifiers.namingauthority.test.NamingAuthorityTestCaseBase;
import org.springframework.test.annotation.Rollback;

public class StressTestCase extends NamingAuthorityTestCaseBase
{
	@Rollback(false)
	public void testStress() throws Exception
	{
		StressTestUtil.testUtil=new TestUtil(NamingAuthority);
		long numberOfTests = 20l;
		SecurityInfo client = new SecurityInfoImpl("srikalyan");
//		this.NamingAuthority.registerSite(client, "site", "a", "1.0", "srikalyan", "srikalyan@semanticbits.com","443-481-7555", "sb");
		long t1 = System.currentTimeMillis();
		StressTestUtil.testOnlyRegisterGSID(client, numberOfTests);
//		StressTestUtil.testOnlyGetParentHierarchy(client, numberOfTests);
		long t2 = System.currentTimeMillis();
		System.out.println("time taken is " + (t2 - t1));
	}
}
