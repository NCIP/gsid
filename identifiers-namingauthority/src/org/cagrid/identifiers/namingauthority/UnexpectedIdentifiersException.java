/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority;

public class UnexpectedIdentifiersException extends Exception {

    private static final long serialVersionUID = 1L;


    public UnexpectedIdentifiersException() {
    }


    public UnexpectedIdentifiersException(String message) {
        super(message);
    }


    public UnexpectedIdentifiersException(Throwable cause) {
        super(cause);
    }


    public UnexpectedIdentifiersException(String message, Throwable cause) {
        super(message, cause);
    }

}
