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
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.*;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsElements;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcConnectionTypeEnum;

@Guid("801d751c-7dbf-4a3c-a799-223323377272")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelConnectsPathElements extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelConnectsElements
{
	@Description("Overriding priorities at this connection. It overrides the standard priority given at the wall layer provided by <em>IfcMaterialLayer</em>.<em>Priority</em>. The list of <em>RelatingProperties</em> corresponds to the list of <em>IfcMaterialLayerSet</em>.<em>MaterialLayers</em> of the element referenced by <em>RelatingObject</em>.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; Data type changed to NUMBER and usage to hold a normalized ratio measure [0..1].  </blockquote>")
	@Required()
	@Guid("875ef649-a65e-40cd-970a-b99ead08ca9f")
	@JacksonXmlProperty(isAttribute = false, localName = "Integer")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "RelatingPriorities")
	private List<Integer> relatingPriorities;

	@Description("Overriding priorities at this connection. It overrides the standard priority given at the wall layer provided by <em>IfcMaterialLayer</em>.<em>Priority</em>. The list of <em>RelatedProperties</em> corresponds to the list of <em>IfcMaterialLayerSet</em>.<em>MaterialLayers</em> of the element referenced by <em>RelatedObject</em>.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; Data type changed to NUMBER and usage to hold a normalized ratio measure [0..1].  </blockquote>")
	@Required()
	@Guid("7362235e-2a0d-4f5e-af69-482fd8dacac7")
	@JacksonXmlProperty(isAttribute = false, localName = "Integer")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "RelatedPriorities")
	private List<Integer> relatedPriorities;

	@Description("Indication of the connection type in relation to the path of the <em>RelatingObject</em>.")
	@Required()
	@Guid("add30ef4-48b3-4bba-9732-f682f23c1293")
	@JacksonXmlProperty(isAttribute=true, localName = "RelatedConnectionType")
	private IfcConnectionTypeEnum relatedConnectionType;

	@Description("Indication of the connection type in relation to the path of the <em>RelatingObject</em>.")
	@Required()
	@Guid("f9db190a-4cfc-4840-9fda-0fbdb3adda53")
	@JacksonXmlProperty(isAttribute=true, localName = "RelatingConnectionType")
	private IfcConnectionTypeEnum relatingConnectionType;


	public IfcRelConnectsPathElements()
	{
	}

	public IfcRelConnectsPathElements(String globalId, IfcElement relatingElement, IfcElement relatedElement, Integer[] relatingPriorities, Integer[] relatedPriorities, IfcConnectionTypeEnum relatedConnectionType, IfcConnectionTypeEnum relatingConnectionType)
	{
		super(globalId, relatingElement, relatedElement);
		this.relatingPriorities = new ArrayList<>(Arrays.asList(relatingPriorities));
		this.relatedPriorities = new ArrayList<>(Arrays.asList(relatedPriorities));
		this.relatedConnectionType = relatedConnectionType;
		this.relatingConnectionType = relatingConnectionType;
	}

	public List<Integer> getRelatingPriorities() {
		return this.relatingPriorities;
	}

	public List<Integer> getRelatedPriorities() {
		return this.relatedPriorities;
	}

	public IfcConnectionTypeEnum getRelatedConnectionType() {
		return this.relatedConnectionType;
	}

	public void setRelatedConnectionType(IfcConnectionTypeEnum relatedConnectionType) {
		this.relatedConnectionType = relatedConnectionType;
	}

	public IfcConnectionTypeEnum getRelatingConnectionType() {
		return this.relatingConnectionType;
	}

	public void setRelatingConnectionType(IfcConnectionTypeEnum relatingConnectionType) {
		this.relatingConnectionType = relatingConnectionType;
	}


}

