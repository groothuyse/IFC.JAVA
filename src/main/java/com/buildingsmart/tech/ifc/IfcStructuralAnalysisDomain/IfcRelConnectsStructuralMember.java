// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

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
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.*;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.*;
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcRelConnectsWithEccentricity;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralMember;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralConnection;

@Guid("a3f65142-e263-40a0-a199-116ed79dd647")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcRelConnectsWithEccentricity.class, name = "IfcRelConnectsWithEccentricity"))
public class IfcRelConnectsStructuralMember extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Reference to an instance of IfcStructuralMember (or its subclasses) which is connected to the specified structural connection.")
	@Required()
	@Guid("29dc8e83-1a71-402e-a494-06876f1f1bae")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingStructuralMember")
	private IfcStructuralMember relatingStructuralMember;

	@Description("Reference to an instance of IfcStructuralConnection (or its subclasses) which is connected to the specified structural member.")
	@Required()
	@Guid("1303e4ee-2a6a-4635-899a-6f5f6d8e392c")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatedStructuralConnection")
	private IfcStructuralConnection relatedStructuralConnection;

	@Description("Conditions which define the connections properties.  Connection conditions are often called &quot;release&quot; but are not only used to define mechanisms like hinges but also rigid, elastic, and other conditions.")
	@Guid("3425bba1-6c03-4452-ad27-7f2e007714cd")
	@JacksonXmlProperty(isAttribute=false, localName = "AppliedCondition")
	private IfcBoundaryCondition appliedCondition;

	@Description("Describes additional connection properties.")
	@Guid("ea1f2763-53b0-4484-886d-5941951ce053")
	@JacksonXmlProperty(isAttribute=false, localName = "AdditionalConditions")
	private IfcStructuralConnectionCondition additionalConditions;

	@Description("Defines the 'supported length' of this structural connection. See Fig. for more detail.")
	@Guid("15d0e2e1-462a-4cb4-8425-9aeac6fdd59d")
	@JacksonXmlProperty(isAttribute=true, localName = "SupportedLength")
	private double supportedLength;

	@Description("Defines a coordinate system used for the description of the connection properties in <em>ConnectionCondition</em> relative to the local coordinate system of <em>RelatingStructuralMember</em>.  If left unspecified, the placement <em>IfcAxis2Placement3D</em>((x,y,z), ?, ?) is implied with x,y,z being the local member coordinates where the connection is made and the default axes directions being in parallel with the local axes of <em>RelatingStructuralMember</em>.")
	@Guid("4d84ca74-7ceb-4d98-bea7-c5f06d1b43d1")
	@JacksonXmlProperty(isAttribute=false, localName = "ConditionCoordinateSystem")
	private IfcAxis2Placement3D conditionCoordinateSystem;


	public IfcRelConnectsStructuralMember()
	{
	}

	public IfcRelConnectsStructuralMember(String globalId, IfcStructuralMember relatingStructuralMember, IfcStructuralConnection relatedStructuralConnection)
	{
		super(globalId);
		this.relatingStructuralMember = relatingStructuralMember;
		this.relatedStructuralConnection = relatedStructuralConnection;
	}

	public IfcStructuralMember getRelatingStructuralMember() {
		return this.relatingStructuralMember;
	}

	public void setRelatingStructuralMember(IfcStructuralMember relatingStructuralMember) {
		this.relatingStructuralMember = relatingStructuralMember;
	}

	public IfcStructuralConnection getRelatedStructuralConnection() {
		return this.relatedStructuralConnection;
	}

	public void setRelatedStructuralConnection(IfcStructuralConnection relatedStructuralConnection) {
		this.relatedStructuralConnection = relatedStructuralConnection;
	}

	public IfcBoundaryCondition getAppliedCondition() {
		return this.appliedCondition;
	}

	public void setAppliedCondition(IfcBoundaryCondition appliedCondition) {
		this.appliedCondition = appliedCondition;
	}

	public IfcStructuralConnectionCondition getAdditionalConditions() {
		return this.additionalConditions;
	}

	public void setAdditionalConditions(IfcStructuralConnectionCondition additionalConditions) {
		this.additionalConditions = additionalConditions;
	}

	public double getSupportedLength() {
		return this.supportedLength;
	}

	public void setSupportedLength(double supportedLength) {
		this.supportedLength = supportedLength;
	}

	public IfcAxis2Placement3D getConditionCoordinateSystem() {
		return this.conditionCoordinateSystem;
	}

	public void setConditionCoordinateSystem(IfcAxis2Placement3D conditionCoordinateSystem) {
		this.conditionCoordinateSystem = conditionCoordinateSystem;
	}


}

