/*L
 *  Copyright Washington University in St. Louis
 *  Copyright SemanticBits
 *  Copyright Persistent Systems
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/gsid/LICENSE.txt for details.
 */

package org.cagrid.identifiers.namingauthority.serialization;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.cagrid.identifiers.namingauthority.dao.IdentifierMetadataDao;
import org.exolab.castor.mapping.GeneralizedFieldHandler;

public class URIFieldHandler extends GeneralizedFieldHandler {
	protected static Log LOG = LogFactory.getLog(URIFieldHandler.class.getName());
	@Override
	public Object convertUponGet(Object uri) {
		if (uri == null) {
            return null;
        } else {
            return uri.toString();
        }
	}

	@Override
	public Object convertUponSet(Object string) {
		URI result = null;
        try {
            result = new URI((String) string);
        } catch (URISyntaxException e) {
        	LOG.warn("cannot cast URI to String");
        }

        return result;
	}

	@Override
	public Class getFieldType() {
		return URI.class;
	}

}
