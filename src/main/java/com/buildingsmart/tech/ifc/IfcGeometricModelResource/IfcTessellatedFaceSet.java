// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.*;
import com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcPolygonalFaceSet;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTriangulatedFaceSet;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcTessellatedItem;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCartesianPointList3D;

@Guid("97c81448-43b9-4f3b-8b09-5da72f6a499a")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcPolygonalFaceSet.class, name = "IfcPolygonalFaceSet"), @JsonSubTypes.Type(value = IfcTriangulatedFaceSet.class, name = "IfcTriangulatedFaceSet")})
public abstract class IfcTessellatedFaceSet extends IfcTessellatedItem implements IfcBooleanOperand
{
	@Description("An ordered list of Cartesian points used by the coordinate index defined at the subtypes of <em>IfcTessellatedFaceSet</em>.")
	@Required()
	@Guid("28b00035-2a37-4bda-aa0e-7845352fa060")
	@JacksonXmlProperty(isAttribute=false, localName = "Coordinates")
	private IfcCartesianPointList3D coordinates;

	@Description("Reference to the indexed colour map providing the corresponding colour RGB values to the faces of the subtypes of <em>IfcTessellatedFaceSet</em>.")
	@Guid("91135fdb-fb22-4f3b-8316-c13c64b911c0")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcIndexedColourMap")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasColours")
	private Set<IfcIndexedColourMap> hasColours;

	@Description("Reference to the indexed texture map providing the corresponding texture coordinates to the vertices bounding the faces of the subtypes of <em>IfcTessellatedFaceSet</em>.")
	@Guid("bc9e2551-f6b9-4d6e-a1ea-83aa87876820")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcIndexedTextureMap")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasTextures")
	private Set<IfcIndexedTextureMap> hasTextures;


	public IfcTessellatedFaceSet()
	{
	}

	public IfcTessellatedFaceSet(IfcCartesianPointList3D coordinates)
	{
		this.coordinates = coordinates;
	}

	public IfcCartesianPointList3D getCoordinates() {
		return this.coordinates;
	}

	public void setCoordinates(IfcCartesianPointList3D coordinates) {
		this.coordinates = coordinates;
	}

	public int getDim() {
		return 0;
	}

	public Set<IfcIndexedColourMap> getHasColours() {
		return this.hasColours;
	}

	public Set<IfcIndexedTextureMap> getHasTextures() {
		return this.hasTextures;
	}


}

