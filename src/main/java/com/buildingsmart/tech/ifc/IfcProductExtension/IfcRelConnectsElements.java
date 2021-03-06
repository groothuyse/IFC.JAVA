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
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRelConnectsPathElements;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsWithRealizingElements;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement;

@Guid("2749c418-fb5d-400d-92ce-0c491a55cbd7")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcRelConnectsPathElements.class, name = "IfcRelConnectsPathElements"), @JsonSubTypes.Type(value = IfcRelConnectsWithRealizingElements.class, name = "IfcRelConnectsWithRealizingElements")})
public class IfcRelConnectsElements extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("The geometric shape representation of the connection geometry that is provided in the object coordinate system of the <em>RelatingElement</em> (mandatory) and in the object coordinate system of the <em>RelatedElement</em> (optionally).")
	@Guid("5b2207fa-16ea-4fe2-900a-652e7e2b521e")
	@JacksonXmlProperty(isAttribute=false, localName = "ConnectionGeometry")
	private IfcConnectionGeometry connectionGeometry;

	@Description("Reference to a subtype of <em>IfcElement</em> that is connected by the connection relationship in the role of <em>RelatingElement</em>.")
	@Required()
	@Guid("f875bb4c-3105-4b90-a8d1-25dfc10e0f90")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingElement")
	private IfcElement relatingElement;

	@Description("Reference to a subtype of <em>IfcElement</em> that is connected by the connection relationship in the role of <em>RelatedElement</em>.")
	@Required()
	@Guid("eb56d278-f844-4217-8731-9c4cc688940e")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatedElement")
	private IfcElement relatedElement;


	public IfcRelConnectsElements()
	{
	}

	public IfcRelConnectsElements(String globalId, IfcElement relatingElement, IfcElement relatedElement)
	{
		super(globalId);
		this.relatingElement = relatingElement;
		this.relatedElement = relatedElement;
	}

	public IfcConnectionGeometry getConnectionGeometry() {
		return this.connectionGeometry;
	}

	public void setConnectionGeometry(IfcConnectionGeometry connectionGeometry) {
		this.connectionGeometry = connectionGeometry;
	}

	public IfcElement getRelatingElement() {
		return this.relatingElement;
	}

	public void setRelatingElement(IfcElement relatingElement) {
		this.relatingElement = relatingElement;
	}

	public IfcElement getRelatedElement() {
		return this.relatedElement;
	}

	public void setRelatedElement(IfcElement relatedElement) {
		this.relatedElement = relatedElement;
	}


}

