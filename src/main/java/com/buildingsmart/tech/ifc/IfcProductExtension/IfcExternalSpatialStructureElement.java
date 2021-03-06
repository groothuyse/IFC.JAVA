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
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcExternalSpatialElement;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSpatialElement;

@Guid("5b7db4a0-6145-4e7b-b0a4-ad1956d47316")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcExternalSpatialElement.class, name = "IfcExternalSpatialElement"))
public abstract class IfcExternalSpatialStructureElement extends IfcSpatialElement
{

	public IfcExternalSpatialStructureElement()
	{
	}

	public IfcExternalSpatialStructureElement(String globalId)
	{
		super(globalId);
	}


}

