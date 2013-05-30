/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority.test;

public interface SpringTestApplicationContextConstants {

    public static final String SPRING_CLASSPATH_PREFIX = "classpath*:";
    public static final String SPRING_FILE_PREFIX = "file:";

    public static final String NA_BASE_LOCATION = SPRING_FILE_PREFIX + "WebContent/WEB-INF/applicationContext-na.xml";
    public static final String TEST_BASE_LOCATION = SPRING_CLASSPATH_PREFIX + "test-applicationContext-properties.xml";

}
