// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedSurface;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcPlane;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;

@Guid("49f23ea3-63e5-4868-bb6d-dc7fe2e9d879")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCurveBoundedPlane extends IfcBoundedSurface
{
	@Description("The surface to be bound.")
	@Required()
	@Guid("e3507105-8eae-42eb-9122-b8f9474b2507")
	@JacksonXmlProperty(isAttribute=false, localName = "BasisSurface")
	private IfcPlane basisSurface;

	@Description("The outer boundary of the surface.")
	@Required()
	@Guid("d59dedb7-409b-40f2-b7f6-780fbf45198e")
	@JacksonXmlProperty(isAttribute=false, localName = "OuterBoundary")
	private IfcCurve outerBoundary;

	@Description("An optional set of inner boundaries. They shall not intersect each other or the outer boundary.")
	@Required()
	@Guid("33e2f437-e02b-4345-af76-39640de58ff3")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCurve")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "InnerBoundaries")
	private Set<IfcCurve> innerBoundaries;


	public IfcCurveBoundedPlane()
	{
	}

	public IfcCurveBoundedPlane(IfcPlane basisSurface, IfcCurve outerBoundary, IfcCurve[] innerBoundaries)
	{
		this.basisSurface = basisSurface;
		this.outerBoundary = outerBoundary;
		this.innerBoundaries = new HashSet<>(Arrays.asList(innerBoundaries));
	}

	public IfcPlane getBasisSurface() {
		return this.basisSurface;
	}

	public void setBasisSurface(IfcPlane basisSurface) {
		this.basisSurface = basisSurface;
	}

	public IfcCurve getOuterBoundary() {
		return this.outerBoundary;
	}

	public void setOuterBoundary(IfcCurve outerBoundary) {
		this.outerBoundary = outerBoundary;
	}

	public Set<IfcCurve> getInnerBoundaries() {
		return this.innerBoundaries;
	}


}

