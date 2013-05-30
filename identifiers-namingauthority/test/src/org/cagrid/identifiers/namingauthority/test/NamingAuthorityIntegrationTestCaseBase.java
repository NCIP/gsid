/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority.test;

import org.springframework.test.annotation.AbstractAnnotationAwareTransactionalTests;


public abstract class NamingAuthorityIntegrationTestCaseBase extends AbstractAnnotationAwareTransactionalTests {

    public NamingAuthorityIntegrationTestCaseBase() {
        setPopulateProtectedVariables(true);
    }


    @Override
    protected String[] getConfigLocations() {
        return new String[]{SpringTestApplicationContextConstants.NA_BASE_LOCATION,
                SpringTestApplicationContextConstants.TEST_BASE_LOCATION};
    }
}
