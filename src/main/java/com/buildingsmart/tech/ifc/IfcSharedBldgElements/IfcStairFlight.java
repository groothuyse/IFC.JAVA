// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

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
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement;

@Guid("c9b965ff-02c6-41a5-937f-4788c8513e6c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStairFlight extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Number of the risers included in the stair flight  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been deprecated it shall only be exposed with a NIL value. Use <em>Pset_StairFlightCommon.NumberOfRisers</em> instead.</blockquote>")
	@Guid("ee984ef4-cde1-44a3-b301-c62a10108bea")
	@JacksonXmlProperty(isAttribute=true, localName = "NumberOfRisers")
	private int numberOfRisers;

	@Description("Number of treads included in the stair flight.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been deprecated it shall only be exposed with a NIL value. Use <em>Pset_StairFlightCommon.NumberOfTreads</em> instead.</blockquote>")
	@Guid("8b933521-d0a8-4793-9290-c694bfdf4941")
	@JacksonXmlProperty(isAttribute=true, localName = "NumberOfTreads")
	private int numberOfTreads;

	@Description("Vertical distance from tread to tread. The riser height is supposed to be equal for all stairs in a stair flight.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been deprecated it shall only be exposed with a NIL value. Use <em>Pset_StairFlightCommon.RiserHeight</em> instead.</blockquote>")
	@Guid("221e43e9-f43c-47d3-b02e-20a0a86fbab6")
	@JacksonXmlProperty(isAttribute=false, localName = "RiserHeight")
	private IfcPositiveLengthMeasure riserHeight;

	@Description("Horizontal distance from the front to the back of the tread. The tread length is supposed to be equal for all steps of the stair flight.    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been deprecated it shall only be exposed with a NIL value. Use <em>Pset_StairFlightCommon.TreadLength</em> instead.</blockquote>")
	@Guid("bf014ecd-1bc8-4fee-bf42-f86df0c5cca6")
	@JacksonXmlProperty(isAttribute=false, localName = "TreadLength")
	private IfcPositiveLengthMeasure treadLength;

	@Description("Predefined generic type for a stair flight that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcStairFlightType</em> is assigned, providing its own <em>IfcStairFlightType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@Guid("42c2789a-ba85-449f-8a3c-e9920ec67ef4")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcStairFlightTypeEnum predefinedType;


	public IfcStairFlight()
	{
	}

	public IfcStairFlight(String globalId)
	{
		super(globalId);
	}

	public int getNumberOfRisers() {
		return this.numberOfRisers;
	}

	public void setNumberOfRisers(int numberOfRisers) {
		this.numberOfRisers = numberOfRisers;
	}

	public int getNumberOfTreads() {
		return this.numberOfTreads;
	}

	public void setNumberOfTreads(int numberOfTreads) {
		this.numberOfTreads = numberOfTreads;
	}

	public IfcPositiveLengthMeasure getRiserHeight() {
		return this.riserHeight;
	}

	public void setRiserHeight(IfcPositiveLengthMeasure riserHeight) {
		this.riserHeight = riserHeight;
	}

	public IfcPositiveLengthMeasure getTreadLength() {
		return this.treadLength;
	}

	public void setTreadLength(IfcPositiveLengthMeasure treadLength) {
		this.treadLength = treadLength;
	}

	public IfcStairFlightTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcStairFlightTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

