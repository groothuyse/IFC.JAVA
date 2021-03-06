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

@Guid("4e958bba-84fa-45d3-bf26-9b6b72632919")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcQuantityLength extends IfcPhysicalSimpleQuantity
{
	@Description("Length measure value of this quantity.")
	@Required()
	@Guid("7f243ac1-2a97-4752-b2e2-8f8b9d39d18a")
	@JacksonXmlProperty(isAttribute=true, localName = "LengthValue")
	private double lengthValue;

	@Description("A formula by which the quantity has been calculated. It can be assigned in addition to the actual value of the quantity. Formulas could be mathematic calculations (like width x height), database links, or a combination. The formula is for informational purposes only.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added to the end of the attribute list.</blockquote>")
	@Guid("d6cebea3-47f2-41f9-a065-db12dc729cd4")
	@JacksonXmlProperty(isAttribute=true, localName = "Formula")
	private String formula;


	public IfcQuantityLength()
	{
	}

	public IfcQuantityLength(String name, double lengthValue)
	{
		super(name);
		this.lengthValue = lengthValue;
	}

	public double getLengthValue() {
		return this.lengthValue;
	}

	public void setLengthValue(double lengthValue) {
		this.lengthValue = lengthValue;
	}

	public String getFormula() {
		return this.formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}


}

