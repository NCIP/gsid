/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority.impl;

import org.cagrid.identifiers.namingauthority.SecurityInfo;

public class SecurityInfoImpl implements SecurityInfo {

	private String user;
	
	public SecurityInfoImpl( String user ) {
		this.user = user;
	}
	
	public String getUser() {
		return this.user;
	}
}
