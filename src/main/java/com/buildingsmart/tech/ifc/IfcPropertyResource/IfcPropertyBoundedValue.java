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
import com.buildingsmart.tech.ifc.IfcMeasureResource.*;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcSimpleProperty;

@Guid("8e5675b7-1eab-4355-967e-bd85ba01ab9d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertyBoundedValue extends IfcSimpleProperty
{
	@Description("Upper bound value for the interval defining the property value. If the value is not given, it indicates an open bound (all values to be greater than or equal to <em>LowerBoundValue</em>).")
	@Guid("28c3b4b3-6d57-4edb-be6d-3ab7531478c1")
	@JacksonXmlProperty(isAttribute=true, localName = "UpperBoundValue")
	private IfcValue upperBoundValue;

	@Description("Lower bound value for the interval defining the property value. If the value is not given, it indicates an open bound (all values to be lower than or equal to <em>UpperBoundValue</em>).")
	@Guid("8511d45b-6a0b-497c-ba87-ff8eb107d34f")
	@JacksonXmlProperty(isAttribute=true, localName = "LowerBoundValue")
	private IfcValue lowerBoundValue;

	@Description("Unit for the upper and lower bound values, if not given, the default value for the measure type is used as defined by the global unit assignment at <em>IfcProject.UnitInContext</em>. The applicable unit is then selected by the underlying TYPE of the <em>UpperBoundValue</em>, <em>LowerBoundValue</em>, and <em>SetPointValue</em>)")
	@Guid("efcd98c4-2c73-40ff-a47a-51ee91f65800")
	@JacksonXmlProperty(isAttribute=true, localName = "Unit")
	private IfcUnit unit;

	@Description("Set point value as typically used for operational value setting.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been added at the end of the attribute list.</blockquote>")
	@Guid("618fe876-362a-4c92-a92c-7dd103266ac3")
	@JacksonXmlProperty(isAttribute=true, localName = "SetPointValue")
	private IfcValue setPointValue;


	public IfcPropertyBoundedValue()
	{
	}

	public IfcPropertyBoundedValue(String name)
	{
		super(name);
	}

	public IfcValue getUpperBoundValue() {
		return this.upperBoundValue;
	}

	public void setUpperBoundValue(IfcValue upperBoundValue) {
		this.upperBoundValue = upperBoundValue;
	}

	public IfcValue getLowerBoundValue() {
		return this.lowerBoundValue;
	}

	public void setLowerBoundValue(IfcValue lowerBoundValue) {
		this.lowerBoundValue = lowerBoundValue;
	}

	public IfcUnit getUnit() {
		return this.unit;
	}

	public void setUnit(IfcUnit unit) {
		this.unit = unit;
	}

	public IfcValue getSetPointValue() {
		return this.setPointValue;
	}

	public void setSetPointValue(IfcValue setPointValue) {
		this.setPointValue = setPointValue;
	}


}

