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
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcBoxedHalfSpace;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcPolygonalBoundedHalfSpace;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcSurface;

@Guid("c9679787-14e8-44ff-b62a-a511bb58005d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBoxedHalfSpace.class, name = "IfcBoxedHalfSpace"), @JsonSubTypes.Type(value = IfcPolygonalBoundedHalfSpace.class, name = "IfcPolygonalBoundedHalfSpace")})
public class IfcHalfSpaceSolid extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcBooleanOperand
{
	@Description("Surface defining side of half space.")
	@Required()
	@Guid("110e5354-e95f-42b1-81d2-f4de74eb9085")
	@JacksonXmlProperty(isAttribute=false, localName = "BaseSurface")
	private IfcSurface baseSurface;

	@Description("The agreement flag is TRUE if the normal to the BaseSurface points away from the material of the IfcHalfSpaceSolid. Otherwise it is FALSE.")
	@Required()
	@Guid("689e63ba-3c13-477c-810a-69a5acc44e82")
	@JacksonXmlProperty(isAttribute=true, localName = "AgreementFlag")
	private Boolean agreementFlag;


	public IfcHalfSpaceSolid()
	{
	}

	public IfcHalfSpaceSolid(IfcSurface baseSurface, Boolean agreementFlag)
	{
		this.baseSurface = baseSurface;
		this.agreementFlag = agreementFlag;
	}

	public IfcSurface getBaseSurface() {
		return this.baseSurface;
	}

	public void setBaseSurface(IfcSurface baseSurface) {
		this.baseSurface = baseSurface;
	}

	public Boolean getAgreementFlag() {
		return this.agreementFlag;
	}

	public void setAgreementFlag(Boolean agreementFlag) {
		this.agreementFlag = agreementFlag;
	}

	public int getDim() {
		return 0;
	}


}

