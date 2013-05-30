/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority;

public class NamingAuthoritySecurityException extends Exception {

    private static final long serialVersionUID = 1L;


    public NamingAuthoritySecurityException() {
    }


    public NamingAuthoritySecurityException(String message) {
        super(message);
    }


    public NamingAuthoritySecurityException(Throwable cause) {
        super(cause);
    }


    public NamingAuthoritySecurityException(String message, Throwable cause) {
        super(message, cause);
    }

}
