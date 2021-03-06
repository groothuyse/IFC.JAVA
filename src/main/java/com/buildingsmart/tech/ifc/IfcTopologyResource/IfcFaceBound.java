// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

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
import com.buildingsmart.tech.ifc.IfcTopologyResource.*;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcFaceOuterBound;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcTopologicalRepresentationItem;
import com.buildingsmart.tech.ifc.IfcTopologyResource.IfcLoop;

@Guid("57c11bcb-98a6-432c-af6d-cb98d7020755")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcFaceOuterBound.class, name = "IfcFaceOuterBound"))
public class IfcFaceBound extends IfcTopologicalRepresentationItem
{
	@Description("The loop which will be used as a face boundary.")
	@Required()
	@Guid("851ba2e0-700c-4bb5-b663-1806386b9710")
	@JacksonXmlProperty(isAttribute=false, localName = "Bound")
	private IfcLoop bound;

	@Description("This indicated whether (TRUE) or not (FALSE) the loop has the same sense when used to bound the face as when first defined. If sense is FALSE the senses of all its component oriented edges are implicitly reversed when used in the face.")
	@Required()
	@Guid("8014ce9a-263c-4cf4-84b2-42ab6328c830")
	@JacksonXmlProperty(isAttribute=true, localName = "Orientation")
	private Boolean orientation;


	public IfcFaceBound()
	{
	}

	public IfcFaceBound(IfcLoop bound, Boolean orientation)
	{
		this.bound = bound;
		this.orientation = orientation;
	}

	public IfcLoop getBound() {
		return this.bound;
	}

	public void setBound(IfcLoop bound) {
		this.bound = bound;
	}

	public Boolean getOrientation() {
		return this.orientation;
	}

	public void setOrientation(Boolean orientation) {
		this.orientation = orientation;
	}


}

