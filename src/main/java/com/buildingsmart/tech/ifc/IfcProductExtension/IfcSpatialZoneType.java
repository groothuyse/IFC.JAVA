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
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialElementType;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialZoneTypeEnum;

@Guid("f9754c40-1414-4a96-a587-2ff0a1c7e969")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSpatialZoneType extends IfcSpatialElementType
{
	@Description("Predefined types to define the particular type of the spatial zone. There may be property set definitions available for each predefined type.")
	@Required()
	@Guid("cffcc7b0-79a5-415e-b0c0-9b23b88d859d")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcSpatialZoneTypeEnum predefinedType;

	@Description("Long name for a spatial zone type, used for informal purposes. It should be used, if available, in conjunction with the inherited <em>Name</em> attribute.  <blockquote class=\"note\">    NOTE&nbsp; In many scenarios the <em>Name</em> attribute refers to the short name or number of a spatial zone, and the <em>LongName</em> refers to the full descriptive name.  </blockquote>")
	@Guid("aeddd5e6-ec3d-4e96-adba-d747e9609667")
	@JacksonXmlProperty(isAttribute=true, localName = "LongName")
	private String longName;


	public IfcSpatialZoneType()
	{
	}

	public IfcSpatialZoneType(String globalId, IfcSpatialZoneTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcSpatialZoneTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcSpatialZoneTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public String getLongName() {
		return this.longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}


}

