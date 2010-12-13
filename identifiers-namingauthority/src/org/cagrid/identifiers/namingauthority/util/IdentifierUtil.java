package org.cagrid.identifiers.namingauthority.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.cagrid.identifiers.namingauthority.InvalidIdentifierException;
import org.cagrid.identifiers.namingauthority.NamingAuthorityConfigurationException;
import org.cagrid.identifiers.namingauthority.domain.IdentifierData;
import org.cagrid.identifiers.namingauthority.domain.KeyData;
import org.cagrid.identifiers.namingauthority.hibernate.IdentifierMetadata;
import org.cagrid.identifiers.namingauthority.hibernate.IdentifierValueKey;


public class IdentifierUtil {

    public static URI build(URI prefix, URI localName) throws NamingAuthorityConfigurationException {
    	try {
    		verifyPrefix(prefix);
    	} catch(Exception e) {
        	throw new NamingAuthorityConfigurationException(e.getMessage());
        }
    	
        if (localName == null) {
            throw new IllegalArgumentException("Localname must not be null.");
        } else if (localName.isAbsolute()) {
            throw new IllegalArgumentException("Localname must be a relative URI.");

        }
        
        // request.getPathInfo() strips required "/" from identifier URL, replace it
        String scheme = localName.getScheme();
        String path = localName.getPath();
        // trim off any leading / so the URI resolving doesn't treat it as an
        // absolute path
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        String url = path;
        if (scheme != null) {
            url = scheme + ":/" + path;
        }
        localName = URI.create(url);

        return prefix.resolve(localName);
    }

    public static URI getLocalName(URI prefix, URI identifier) throws InvalidIdentifierException, NamingAuthorityConfigurationException {
        try {
        	verifyPrefix(prefix);
        } catch(Exception e) {
        	throw new NamingAuthorityConfigurationException(e.getMessage());
        }
 
        String idStr = identifier.normalize().toString();
        String prefixStr = prefix.normalize().toString();
        if (!idStr.startsWith(prefixStr) || prefixStr.length() >= idStr.length()) {
            throw new InvalidIdentifierException("Identifier (" + identifier + ") is not local to prefix (" + prefix
                + ").");
        }

        return prefix.relativize(identifier);
    }

    public static void verifyPrefix(URI prefix) throws IllegalArgumentException {
        if (prefix == null) {
            throw new IllegalArgumentException("Prefix must not be null.");
        } else if (!prefix.isAbsolute()) {
            throw new IllegalArgumentException("Prefix must be an absolute URI : " + prefix);
        } else if (prefix.getFragment() != null) {
            throw new IllegalArgumentException("Prefix must not contain a fragment: " + prefix);
        } else if (prefix.getQuery() != null) {
            throw new IllegalArgumentException("Prefix must not contain a query: " + prefix);
        } else if (!prefix.getPath().endsWith("/")) {
            throw new IllegalArgumentException("Prefix must have a trailing slash: " + prefix);
        }
    }
	
	// Returns list of values associated with the key
	// Returns null if the key does not exist in values
	// Returns an empty list if they key exists but have no values
	public static List<String> getKeyValues( IdentifierMetadata values, String keyName ) {
		
		if (values == null) {
			return null;
		}
		
		Collection<IdentifierValueKey> cvalues = values.getValues();
		if (cvalues == null) {
			return null;
		}
		
		for(IdentifierValueKey ivk : cvalues) {
			if (ivk.getKey().equals(keyName)) {
				if (ivk.getValues() == null) {
					return new ArrayList<String>();
				}
				return ivk.getValues();
			}
		}
		
		return null;
	}
	
	public static String getStackTrace(Throwable t) {  
		StringWriter stringWritter = new StringWriter();  
		PrintWriter printWritter = new PrintWriter(stringWritter, true);  
		t.printStackTrace(printWritter);  
		printWritter.flush();  
		stringWritter.flush();   

		return stringWritter.toString();  
	}   
	
	public static IdentifierValueKey convert(String key, KeyData kd) {

		IdentifierValueKey ivk = new IdentifierValueKey();
		ivk.setKey(key);

		if (kd != null) {
			ivk.setPolicyIdentifier(kd.getPolicyIdentifier());
			ivk.setValues(kd.getValues());
		}
		
		return ivk;
	}
	
	public static IdentifierMetadata convert(URI localIdentifier, IdentifierData ivalues) {
		
		IdentifierMetadata md = new IdentifierMetadata();
	    md.setLocalIdentifier(localIdentifier);
	    List<IdentifierValueKey> values = new ArrayList<IdentifierValueKey>();
	    md.setValues(values);

	    if (ivalues != null) {
	    	String[] keys = ivalues.getKeys();
	        for (String key : keys) {
	        	values.add(IdentifierUtil.convert(key, ivalues.getValues(key)));
	        }
	    }
	    
	    return md;
	}
	
	public static IdentifierData convert(Collection<IdentifierValueKey> valueCollection) {
		IdentifierData result = null;
   
    	if (valueCollection != null && valueCollection.size() > 0) {
    		result = new IdentifierData();
    		Map<String, KeyData> values = new HashMap<String, KeyData>();
    		result.setValues(values);

    		for (IdentifierValueKey vk : valueCollection) {
     			values.put(vk.getKey(), convert(vk));
    		}
    	}
    	
    	return result;
	}
	
	public static KeyData convert(IdentifierValueKey ivk) {
		return new KeyData(ivk.getPolicyIdentifier(), ivk.getValues());
	}
}
