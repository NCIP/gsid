/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority.impl;

import java.net.URI;

import org.cagrid.identifiers.namingauthority.IdentifierGenerator;
import org.cagrid.identifiers.namingauthority.domain.NamingAuthorityConfig;

public class IdentifierGeneratorImpl implements IdentifierGenerator {

	public URI generate(NamingAuthorityConfig config) {
		return URI.create(java.util.UUID.randomUUID().toString());
	}
}
