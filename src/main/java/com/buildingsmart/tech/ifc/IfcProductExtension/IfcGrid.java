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
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcProduct;
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcGridAxis;

@Guid("dfb6beda-5c7c-4df8-bbc6-b101ce4006f3")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcGrid extends com.buildingsmart.tech.ifc.IfcKernel.IfcProduct
{
	@Description("List of grid axes defining the first row of grid lines.")
	@Required()
	@Guid("bdb5916c-3554-4cf8-af9f-c8f845cd2167")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcGridAxis")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "UAxes")
	private List<IfcGridAxis> uAxes;

	@Description("List of grid axes defining the second row of grid lines.")
	@Required()
	@Guid("1717252a-3745-4aa4-a034-8dcd37a0d186")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcGridAxis")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "VAxes")
	private List<IfcGridAxis> vAxes;

	@Description("List of grid axes defining the third row of grid lines. It may be given in the case of a triangular grid.")
	@Guid("d9aa56a8-d4cc-43e3-ba44-e2f43708fed0")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcGridAxis")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "WAxes")
	private List<IfcGridAxis> wAxes;

	@Description("Predefined types to define the particular type of the grid.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute.  </blockquote>")
	@Guid("dd530a2a-4234-4800-82ff-77018c7df73e")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcGridTypeEnum predefinedType;

	@Description("Relationship to a spatial structure element, to which the grid is primarily associated.  <blockquote class=\"change-ifc2x\">IFC2x CHANGE&nbsp; The inverse relationship has been added to <em>IfcGrid</em> with upward compatibility</blockquote>")
	@Guid("eab7c659-344b-47a3-82ed-2c7243b71a28")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelContainedInSpatialStructure")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ContainedInStructure")
	private Set<IfcRelContainedInSpatialStructure> containedInStructure;


	public IfcGrid()
	{
	}

	public IfcGrid(String globalId, IfcGridAxis[] uAxes, IfcGridAxis[] vAxes)
	{
		super(globalId);
		this.uAxes = new ArrayList<>(Arrays.asList(uAxes));
		this.vAxes = new ArrayList<>(Arrays.asList(vAxes));
	}

	public List<IfcGridAxis> getUAxes() {
		return this.uAxes;
	}

	public List<IfcGridAxis> getVAxes() {
		return this.vAxes;
	}

	public List<IfcGridAxis> getWAxes() {
		return this.wAxes;
	}

	public IfcGridTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcGridTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public Set<IfcRelContainedInSpatialStructure> getContainedInStructure() {
		return this.containedInStructure;
	}


}

