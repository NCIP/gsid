package org.cagrid.identifiers.namingauthority.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Index;

@Entity
@GenericGenerator(name = "id-generator", strategy = "native")
@Table(name = "identifier_key_values")
public class IdentifierValueKeyValues
{
	@Id
	@GeneratedValue	
	private Long id;
	
	@Column(name = "value", length = 500)
	@Index(name="identifier_key_values_value")
	private String value;

	public IdentifierValueKeyValues()
	{	
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	} 	

}
