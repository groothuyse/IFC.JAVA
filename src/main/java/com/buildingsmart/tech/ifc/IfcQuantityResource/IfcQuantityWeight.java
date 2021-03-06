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

@Guid("b2c313f2-5299-4b30-b6d0-a7ea6fbf1b83")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcQuantityWeight extends IfcPhysicalSimpleQuantity
{
	@Description("Mass measure value of this quantity.")
	@Required()
	@Guid("7e543a81-ddf5-4f31-b2dc-5a8af9e5a77d")
	@JacksonXmlProperty(isAttribute=true, localName = "WeightValue")
	private double weightValue;

	@Description("A formula by which the quantity has been calculated. It can be assigned in addition to the actual value of the quantity. Formulas could be mathematic calculations (like width x height), database links, or a combination. The formula is for informational purposes only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added to the end of the attribute list.</blockquote>")
	@Guid("a1fad3f8-8a38-45db-9ab4-754238b3e2ca")
	@JacksonXmlProperty(isAttribute=true, localName = "Formula")
	private String formula;


	public IfcQuantityWeight()
	{
	}

	public IfcQuantityWeight(String name, double weightValue)
	{
		super(name);
		this.weightValue = weightValue;
	}

	public double getWeightValue() {
		return this.weightValue;
	}

	public void setWeightValue(double weightValue) {
		this.weightValue = weightValue;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}


}

