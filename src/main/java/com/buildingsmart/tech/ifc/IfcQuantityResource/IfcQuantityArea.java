// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcQuantityResource;

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
import com.buildingsmart.tech.ifc.IfcQuantityResource.IfcPhysicalSimpleQuantity;

@Guid("bb60eefd-5d19-4646-9795-6bda10980402")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcQuantityArea extends IfcPhysicalSimpleQuantity
{
	@Description("Area measure value of this quantity.")
	@Required()
	@Guid("01ac60b8-6a0e-4713-b657-70c3f0bb6c39")
	@JacksonXmlProperty(isAttribute=true, localName = "AreaValue")
	private double areaValue;

	@Description("A formula by which the quantity has been calculated. It can be assigned in addition to the actual value of the quantity. Formulas could be mathematic calculations (like width x height), database links, or a combination. The formula is for informational purposes only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added to the end of the attribute list.</blockquote>")
	@Guid("52ac3915-b8c7-4adc-8d09-a872b27e4d0e")
	@JacksonXmlProperty(isAttribute=true, localName = "Formula")
	private String formula;


	public IfcQuantityArea()
	{
	}

	public IfcQuantityArea(String name, double areaValue)
	{
		super(name);
		this.areaValue = areaValue;
	}

	public double getAreaValue() {
		return this.areaValue;
	}

	public void setAreaValue(double areaValue) {
		this.areaValue = areaValue;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}


}

