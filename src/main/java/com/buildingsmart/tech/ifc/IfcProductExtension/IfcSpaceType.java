// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

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
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialStructureElementType;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpaceTypeEnum;

@Guid("e7fcbf9c-f9a1-43ab-b15f-56f0e33af740")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSpaceType extends IfcSpatialStructureElementType
{
	@Description("Predefined types to define the particular type of space. There may be property set definitions available for each predefined type.")
	@Required()
	@Guid("d5abf58d-e70d-4140-b4e1-4023bd04e61d")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcSpaceTypeEnum predefinedType;

	@Description("Long name for a space type, used for informal purposes. It should be used, if available, in conjunction with the inherited <em>Name</em> attribute.  <blockquote class=\"note\">    NOTE&nbsp; In many scenarios the <em>Name</em> attribute refers to the short name or number of a space type, and the <em>LongName</em> refers to the full descriptive name.  </blockquote>  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New attribute added at the end of entity definition.  </blockquote>")
	@Guid("a280afe4-0acf-4989-8898-22cb92b4b93c")
	@JacksonXmlProperty(isAttribute=true, localName = "LongName")
	private String longName;


	public IfcSpaceType()
	{
	}

	public IfcSpaceType(String globalId, IfcSpaceTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcSpaceTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSpaceTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public String getLongName() {
		return this.longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}


}

