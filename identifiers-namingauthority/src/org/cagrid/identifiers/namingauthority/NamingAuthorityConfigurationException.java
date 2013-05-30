/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority;

public class NamingAuthorityConfigurationException extends Exception {

    private static final long serialVersionUID = 1L;


    public NamingAuthorityConfigurationException() {
    }


    public NamingAuthorityConfigurationException(String message) {
        super(message);
    }


    public NamingAuthorityConfigurationException(Throwable cause) {
        super(cause);
    }


    public NamingAuthorityConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }

}
