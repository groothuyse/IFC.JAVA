// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

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
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcCurveStyleFontPattern;

@Guid("69ad77b0-c3d0-4a22-bdb8-a46a12871aa3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveStyleFont extends com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource.IfcPresentationItem implements IfcCurveStyleFontSelect
{
	@Description("Name that may be assigned with the curve font.")
	@Guid("f3035910-9ab1-4acd-b0f1-6741b0b648b1")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("A list of curve font pattern entities, that contains the simple patterns used for drawing curves. The patterns are applied in the order they occur in the list.")
	@Required()
	@Guid("785fa854-1775-4850-a22b-d63225b3b864")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCurveStyleFontPattern")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "PatternList")
	private List<IfcCurveStyleFontPattern> patternList;


	public IfcCurveStyleFont()
	{
	}

	public IfcCurveStyleFont(IfcCurveStyleFontPattern[] patternList)
	{
		this.patternList = new ArrayList<>(Arrays.asList(patternList));
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<IfcCurveStyleFontPattern> getPatternList() {
		return this.patternList;
	}


}

