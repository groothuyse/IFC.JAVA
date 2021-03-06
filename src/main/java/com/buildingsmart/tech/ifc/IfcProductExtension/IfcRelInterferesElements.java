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
import com.buildingsmart.tech.ifc.IfcProductExtension.*;
import com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement;

@Guid("61792a4b-dbd0-4dd6-9d1d-5af75a4780a8")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelInterferesElements extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Reference to a subtype of <em>IfcElement</> that is the <em>RelatingElement</em> in the interference relationship. Depending on the value of <em>ImpliedOrder</em> the <em>RelatingElement</em> may carry the notion to be the element from which the interference geometry should be subtracted.")
	@Required()
	@Guid("6cd188d3-336d-4017-8875-cca7cac2aaf6")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingElement")
	private IfcElement relatingElement;

	@Description("Reference to a subtype of <em>IfcElement</> that is the <em>RelatedElement</em> in the interference relationship. Depending on the value of <em>ImpliedOrder</em> the <em>RelatedElement</em> may carry the notion to be the element from which the interference geometry should not be subtracted.")
	@Required()
	@Guid("5f1f2c4f-4785-4ffe-ba1d-da6e119fb94b")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatedElement")
	private IfcElement relatedElement;

	@Description("The geometric shape representation of the interference geometry that is provided in the object coordinate system of the <em>RelatingElement</em> (mandatory) and in the object coordinate system of the <em>RelatedElement</em> (optionally).")
	@Guid("434aa7d7-1bd7-4773-a678-7ab1055f88f0")
	@JacksonXmlProperty(isAttribute=false, localName = "InterferenceGeometry")
	private IfcConnectionGeometry interferenceGeometry;

	@Description("Optional identifier that describes the nature of the interference. Examples could include 'Clash', 'ProvisionForVoid', etc.")
	@Guid("a92075e8-181d-4233-bd6a-e3efed6da830")
	@JacksonXmlProperty(isAttribute=true, localName = "InterferenceType")
	private String interferenceType;

	@Description("Logical value indicating whether the interference geometry should be subtracted from the <em>RelatingElement</em> (if TRUE), or whether it should be either subtracted from the <em>RelatingElement</em> or the <em>RelatedElement</em> (if FALSE), or whether no indication can be provided (if UNKNOWN).")
	@Required()
	@Guid("57512488-73cf-44cc-995d-d5e84df6ae44")
	@JacksonXmlProperty(isAttribute=true, localName = "ImpliedOrder")
	private Boolean impliedOrder;


	public IfcRelInterferesElements()
	{
	}

	public IfcRelInterferesElements(String globalId, IfcElement relatingElement, IfcElement relatedElement, Boolean impliedOrder)
	{
		super(globalId);
		this.relatingElement = relatingElement;
		this.relatedElement = relatedElement;
		this.impliedOrder = impliedOrder;
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

	public IfcConnectionGeometry getInterferenceGeometry() {
		return this.interferenceGeometry;
	}

	public void setInterferenceGeometry(IfcConnectionGeometry interferenceGeometry) {
		this.interferenceGeometry = interferenceGeometry;
	}

	public String getInterferenceType() {
		return this.interferenceType;
	}

	public void setInterferenceType(String interferenceType) {
		this.interferenceType = interferenceType;
	}

	public Boolean getImpliedOrder() {
		return this.impliedOrder;
	}

	public void setImpliedOrder(Boolean impliedOrder) {
		this.impliedOrder = impliedOrder;
	}


}

