package org.cagrid.identifiers.namingauthority.hibernate;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity
@GenericGenerator(name = "id-generator", strategy = "native")
@Table(name = "identifier_keys")
public class IdentifierValueKey {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, name = "value_key", length = 1024)
    private String key;

    @CollectionOfElements(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    @JoinTable(name = "identifier_key_values")
    @Column(name = "value", length = 16777215)
    private List<String> values;

    @Column(nullable = true, unique = false)
    @Type(type = "org.cagrid.identifiers.namingauthority.hibernate.URIUserType")
    private URI policyIdentifier;

    public IdentifierValueKey() {}
    
    public IdentifierValueKey(IdentifierValueKey ivk) {
    	setPolicyIdentifier(ivk.getPolicyIdentifier());
    	setKey(ivk.getKey());
    	setValues(ivk.getValues());
    }
    
    public IdentifierValueKey(String key, List<String> values, URI rwIdentifier) {
    	setPolicyIdentifier(rwIdentifier);
    	setKey(key);
    	setValues(values);
    }
    
    public IdentifierValueKey(String key, String[] values, URI rwIdentifier) {
    	this(key, Arrays.asList(values), rwIdentifier);
    }
    
    public URI getPolicyIdentifier() {
    	return this.policyIdentifier;
    }
    
    public void setPolicyIdentifier(URI identifier) {
    	this.policyIdentifier = identifier;
    }
    
    public List<String> getValues() {
        return this.values;
    }


    public void setValues(List<String> values) {
        this.values = values;
    }


    public void setKey(String key) {
        this.key = key;
    }


    public String getKey() {
        return this.key;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((values == null) ? 0 : values.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
    	// DEFINITION, DEFINITION, READ THIS BEFORE YOU MAKE
    	// A CHANGE HERE. Two IdentifierValueKey objects are
    	// considered equal if the keys match. Nothing else
    	// matters. Lots of code depends on this. Do not
    	// change unless you know what you are doing.
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IdentifierValueKey other = (IdentifierValueKey) obj;
        if (this.key == null) {
            if (other.key != null)
                return false;
        } else if (!this.key.equals(other.key))
            return false;
        
        return true;
    }


    private void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return this.id;
    }

}
