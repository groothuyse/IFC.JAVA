// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

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
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSystem;

@Guid("ac862bc5-cee0-4511-a81b-28bd751b24c8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBuildingSystem extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcSystem
{
	@Description("Predefined types of distribution systems.")
	@Guid("ef738e6b-c15f-48e8-922a-a877cda143ee")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcBuildingSystemTypeEnum predefinedType;

	@Description("Long name for a building system, used for informal purposes. It should be used, if available, in conjunction with the inherited <em>Name</em> attribute.  <blockquote class=\"note\">NOTE&nbsp; In many scenarios the <em>Name</em> attribute refers to the short name or number of a building system, and the <em>LongName</em> refers to a descriptive name.  </blockquote>")
	@Guid("4868f395-600e-401a-92aa-b5de855fa577")
	@JacksonXmlProperty(isAttribute=true, localName = "LongName")
	private String longName;


	public IfcBuildingSystem()
	{
	}

	public IfcBuildingSystem(String globalId)
	{
		super(globalId);
	}

	public IfcBuildingSystemTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcBuildingSystemTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public String getLongName() {
		return this.longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}


}

