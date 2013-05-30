/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority;

public class InvalidIdentifierException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;


    public InvalidIdentifierException() {
        super();
    }


    public InvalidIdentifierException(String message, Throwable cause) {
        super(message, cause);
    }


    public InvalidIdentifierException(String message) {
        super(message);
    }


    public InvalidIdentifierException(Throwable cause) {
        super(cause);
    }

}
