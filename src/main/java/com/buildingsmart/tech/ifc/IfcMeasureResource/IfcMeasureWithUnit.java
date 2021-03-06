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
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcValue;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcUnit;

@Guid("7d000d8f-2938-439d-93a8-c32b17a46db8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMeasureWithUnit implements com.buildingsmart.tech.ifc.IfcCostResource.IfcAppliedValueSelect, com.buildingsmart.tech.ifc.IfcConstraintResource.IfcMetricValueSelect
{
	@Description("The value of the physical quantity when expressed in the specified units.")
	@Required()
	@Guid("479106c8-2fd8-47ea-b8d8-b7c2b4500827")
	@JacksonXmlProperty(isAttribute=true, localName = "ValueComponent")
	private IfcValue valueComponent;

	@Description("The unit in which the physical quantity is expressed.")
	@Required()
	@Guid("0b956010-ecb4-40fe-abb6-f9f75898b3f4")
	@JacksonXmlProperty(isAttribute=true, localName = "UnitComponent")
	private IfcUnit unitComponent;


	public IfcMeasureWithUnit()
	{
	}

	public IfcMeasureWithUnit(IfcValue valueComponent, IfcUnit unitComponent)
	{
		this.valueComponent = valueComponent;
		this.unitComponent = unitComponent;
	}

	public IfcValue getValueComponent() {
		return this.valueComponent;
	}

	public void setValueComponent(IfcValue valueComponent) {
		this.valueComponent = valueComponent;
	}

	public IfcUnit getUnitComponent() {
		return this.unitComponent;
	}

	public void setUnitComponent(IfcUnit unitComponent) {
		this.unitComponent = unitComponent;
	}


}

