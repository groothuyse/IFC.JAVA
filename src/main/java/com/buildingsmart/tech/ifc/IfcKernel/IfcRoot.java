// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcUtilityResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcObjectDefinition;
import com.buildingsmart.tech.ifc.IfcKernel.IfcPropertyDefinition;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelationship;

@Guid("f8efd3b8-d3ea-429a-95d6-d19264324999")
@JsonIgnoreProperties(ignoreUnknown=true)
//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
//@JsonSubTypes({@JsonSubTypes.Type(value = IfcObjectDefinition.class, name = "IfcObjectDefinition"), @JsonSubTypes.Type(value = IfcPropertyDefinition.class, name = "IfcPropertyDefinition"), @JsonSubTypes.Type(value = IfcRelationship.class, name = "IfcRelationship")})
public abstract class IfcRoot
{
	@Description("Assignment of a globally unique identifier within the entire software world.")
	@Required()
	@Guid("2ef91ad0-a87b-4049-910a-d9c2aea67739")
	@JacksonXmlProperty(isAttribute=true, localName = "GlobalId")
	private String globalId;

	@Description("Assignment of the information about the current ownership of that object, including owning actor, application, local identification and information captured about the recent changes of the object,     <blockquote class=\"note\">NOTE&nbsp; only the last modification in stored - either as addition, deletion or modification.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to be OPTIONAL.</blockquote>")
	@Guid("3f6c9112-a79d-49a2-a983-4fd08a4cedc3")
	@JacksonXmlProperty(isAttribute=false, localName = "OwnerHistory")
	private IfcOwnerHistory ownerHistory;

	@Description("Optional name for use by the participating software systems or users. For some subtypes of IfcRoot the insertion of the Name attribute may be required. This would be enforced by a where rule.")
	@Guid("03435dd4-ced4-460f-9203-e318d330c219")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("Optional description, provided for exchanging informative comments.")
	@Guid("ae1c2069-cba7-4c56-b652-2ce207a2345f")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;


	public IfcRoot()
	{
	}

	public IfcRoot(String globalId)
	{
		this.globalId = globalId;
	}

	public String getGlobalId() {
		return this.globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public IfcOwnerHistory getOwnerHistory() {
		return this.ownerHistory;
	}

	public void setOwnerHistory(IfcOwnerHistory ownerHistory) {
		this.ownerHistory = ownerHistory;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}

