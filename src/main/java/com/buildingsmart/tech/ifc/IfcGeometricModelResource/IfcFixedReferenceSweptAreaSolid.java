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
import com.buildingsmart.tech.ifc.IfcGeometryResource.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcSweptAreaSolid;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCurve;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcDirection;

@Guid("0268be1b-f0c0-4033-a02d-f252e497efa2")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFixedReferenceSweptAreaSolid extends IfcSweptAreaSolid
{
	@Description("The curve used to define the sweeping operation. The solid is generated by sweeping the <em>SELF\\IfcSweptAreaSolid.SweptArea</em> along the <em>Directrix</em>.")
	@Required()
	@Guid("db7054ca-de80-4d7f-b603-febfc759c1a4")
	@JacksonXmlProperty(isAttribute=false, localName = "Directrix")
	private IfcCurve directrix;

	@Description("The parameter value on the <em>Directrix</em> at which the sweeping operation commences. <span style=\"color:blue\">If no value is provided the start of the sweeping operation is at the start of the <em>Directrix</em>.</span>")
	@Guid("505d97de-ef74-40e9-8470-168d470a5099")
	@JacksonXmlProperty(isAttribute=true, localName = "StartParam")
	private double startParam;

	@Description("The parameter value on the <em>Directrix</em> at which the sweeping operation ends. < style=\"color:blue\">If no value is provided the end of the sweeping operation is at the end of the <em>Directrix</em>.</span>")
	@Guid("48b15c7c-f26c-4ea6-a724-94c0520636fe")
	@JacksonXmlProperty(isAttribute=true, localName = "EndParam")
	private double endParam;

	@Description("The direction providing the fixed axis1 (x-axis) direction for orienting the swept area during the sweeping operation along the <em>Directrix</em>.")
	@Required()
	@Guid("e3977d79-3a6b-4e5e-9b0f-4583adfc4373")
	@JacksonXmlProperty(isAttribute=false, localName = "FixedReference")
	private IfcDirection fixedReference;


	public IfcFixedReferenceSweptAreaSolid()
	{
	}

	public IfcFixedReferenceSweptAreaSolid(IfcProfileDef sweptArea, IfcCurve directrix, IfcDirection fixedReference)
	{
		super(sweptArea);
		this.directrix = directrix;
		this.fixedReference = fixedReference;
	}

	public IfcCurve getDirectrix() {
		return this.directrix;
	}

	public void setDirectrix(IfcCurve directrix) {
		this.directrix = directrix;
	}

	public double getStartParam() {
		return this.startParam;
	}

	public void setStartParam(double startParam) {
		this.startParam = startParam;
	}

	public double getEndParam() {
		return this.endParam;
	}

	public void setEndParam(double endParam) {
		this.endParam = endParam;
	}

	public IfcDirection getFixedReference() {
		return this.fixedReference;
	}

	public void setFixedReference(IfcDirection fixedReference) {
		this.fixedReference = fixedReference;
	}


}

