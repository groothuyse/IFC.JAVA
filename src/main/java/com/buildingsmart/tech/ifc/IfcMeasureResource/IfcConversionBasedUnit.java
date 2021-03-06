// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMeasureResource;

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
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcConversionBasedUnitWithOffset;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcNamedUnit;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcDimensionalExponents;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnitEnum;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcMeasureWithUnit;

@Guid("7d4b1cf1-345c-456d-9199-c2fc2e7e94f0")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcConversionBasedUnitWithOffset.class, name = "IfcConversionBasedUnitWithOffset"))
public class IfcConversionBasedUnit extends IfcNamedUnit implements com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect
{
	@Description("The word, or group of words, by which the conversion based unit is referred to.")
	@Required()
	@Guid("8f0badf9-2c68-49b2-9365-0e66adb20d4d")
	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	private String name;

	@Description("The physical quantity from which the converted unit is derived.")
	@Required()
	@Guid("91e5e04e-74ab-456a-9cb8-77cbbdf2cdf7")
	@JacksonXmlProperty(isAttribute=false, localName = "ConversionFactor")
	private IfcMeasureWithUnit conversionFactor;

	@Description("Reference to external information, e.g. library, classification, or document information, which is associated with the conversion-based unit.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE New inverse attribute.</blockquote>")
	@Guid("d6118974-bfed-426c-b479-6ecff30b88a2")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcExternalReferenceRelationship")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasExternalReference")
	private Set<IfcExternalReferenceRelationship> hasExternalReference;


	public IfcConversionBasedUnit()
	{
	}

	public IfcConversionBasedUnit(IfcDimensionalExponents dimensions, IfcUnitEnum unitType, String name, IfcMeasureWithUnit conversionFactor)
	{
		super(dimensions, unitType);
		this.name = name;
		this.conversionFactor = conversionFactor;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public IfcMeasureWithUnit getConversionFactor() {
		return this.conversionFactor;
	}

	public void setConversionFactor(IfcMeasureWithUnit conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public Set<IfcExternalReferenceRelationship> getHasExternalReference() {
		return this.hasExternalReference;
	}


}

