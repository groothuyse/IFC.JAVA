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
import com.buildingsmart.tech.ifc.IfcKernel.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelDefines;
import com.buildingsmart.tech.ifc.IfcKernel.IfcObjectDefinition;
import com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinitionSelect;

@Guid("349d602e-d775-4785-ac74-0632e4fdd015")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelDefinesByProperties extends IfcRelDefines
{
	@Description("Reference to the objects (or single object) to which the property definition applies.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Data type promoted from subtype <em>IfcObject</em>.  </blockquote>")
	@Required()
	@Guid("bdb132c9-664c-4197-bf3d-a2f2c81af4cb")
	@MinLength(1)
	@JsonIgnore
	private Set<IfcObjectDefinition> relatedObjects;

	@Description("Reference to the property set definition for that object or set of objects.")
	@Required()
	@Guid("b4e540ff-8ce0-4a5c-a495-3452883ceea7")
	@JacksonXmlProperty(isAttribute=true, localName = "RelatingPropertyDefinition")
	private IfcPropertySetDefinitionSelect relatingPropertyDefinition;


	public IfcRelDefinesByProperties()
	{
	}

	public IfcRelDefinesByProperties(String globalId, IfcObjectDefinition[] relatedObjects, IfcPropertySetDefinitionSelect relatingPropertyDefinition)
	{
		super(globalId);
		this.relatedObjects = new HashSet<>(Arrays.asList(relatedObjects));
		this.relatingPropertyDefinition = relatingPropertyDefinition;
	}

	public Set<IfcObjectDefinition> getRelatedObjects() {
		return this.relatedObjects;
	}

	public IfcPropertySetDefinitionSelect getRelatingPropertyDefinition() {
		return this.relatingPropertyDefinition;
	}

	public void setRelatingPropertyDefinition(IfcPropertySetDefinitionSelect relatingPropertyDefinition) {
		this.relatingPropertyDefinition = relatingPropertyDefinition;
	}


}

