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
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurveOnSurface;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcBoundedCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCompositeCurveSegment;

@Guid("ebd15e62-e09c-44c3-8e9c-7f8840bebed8")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcCompositeCurveOnSurface.class, name = "IfcCompositeCurveOnSurface"))
public class IfcCompositeCurve extends IfcBoundedCurve
{
	@Description("The component bounded curves, their transitions and senses. The transition attribute for the last segment defines the transition between the end of the last segment and the start of the first; this transition attribute may take the value discontinuous, which indicates an open curve.")
	@Required()
	@Guid("b32453c8-8375-4bc7-8758-86e6097c7709")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcCompositeCurveSegment")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "Segments")
	private List<IfcCompositeCurveSegment> segments;

	@Description("Indication of whether the curve intersects itself or not; this is for information only.")
	@Required()
	@Guid("8e53369e-bae8-4a7e-81e4-370b1cb785b8")
	@JacksonXmlProperty(isAttribute=true, localName = "SelfIntersect")
	private Boolean selfIntersect;


	public IfcCompositeCurve()
	{
	}

	public IfcCompositeCurve(IfcCompositeCurveSegment[] segments, Boolean selfIntersect)
	{
		this.segments = new ArrayList<>(Arrays.asList(segments));
		this.selfIntersect = selfIntersect;
	}

	public List<IfcCompositeCurveSegment> getSegments() {
		return this.segments;
	}

	public Boolean getSelfIntersect() {
		return this.selfIntersect;
	}

	public void setSelfIntersect(Boolean selfIntersect) {
		this.selfIntersect = selfIntersect;
	}

	public int getNSegments() {
		return 0;
	}

	public Boolean getClosedCurve() {
		return null;
	}


}

