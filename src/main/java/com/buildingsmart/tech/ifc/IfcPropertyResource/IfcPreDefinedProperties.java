// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPropertyResource;

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
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcReinforcementBarProperties;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionProperties;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcSectionReinforcementProperties;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcPropertyAbstraction;

@Guid("f7222de3-ebea-4122-b900-08a34b4b8fbc")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcReinforcementBarProperties.class, name = "IfcReinforcementBarProperties"), @JsonSubTypes.Type(value = IfcSectionProperties.class, name = "IfcSectionProperties"), @JsonSubTypes.Type(value = IfcSectionReinforcementProperties.class, name = "IfcSectionReinforcementProperties")})
public abstract class IfcPreDefinedProperties extends IfcPropertyAbstraction
{

	public IfcPreDefinedProperties()
	{
	}


}

