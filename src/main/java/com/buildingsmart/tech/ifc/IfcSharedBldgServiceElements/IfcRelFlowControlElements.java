// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements;

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
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElement;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionFlowElement;

@Guid("e5a4f246-e6c4-40b9-85b6-af71acb30b68")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelFlowControlElements extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("References control elements which may be used to impart control on the Distribution Element.")
	@Required()
	@Guid("ee7741ae-f207-410e-a37d-fca605de1cfa")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcDistributionControlElement")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "RelatedControlElements")
	private Set<IfcDistributionControlElement> relatedControlElements;

	@Description("Relationship to a distribution flow element")
	@Required()
	@Guid("7dccb4a5-b41e-4572-9f90-7a9b7a5f6f94")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingFlowElement")
	private IfcDistributionFlowElement relatingFlowElement;


	public IfcRelFlowControlElements()
	{
	}

	public IfcRelFlowControlElements(String globalId, IfcDistributionControlElement[] relatedControlElements, IfcDistributionFlowElement relatingFlowElement)
	{
		super(globalId);
		this.relatedControlElements = new HashSet<>(Arrays.asList(relatedControlElements));
		this.relatingFlowElement = relatingFlowElement;
	}

	public Set<IfcDistributionControlElement> getRelatedControlElements() {
		return this.relatedControlElements;
	}

	public IfcDistributionFlowElement getRelatingFlowElement() {
		return this.relatingFlowElement;
	}

	public void setRelatingFlowElement(IfcDistributionFlowElement relatingFlowElement) {
		this.relatingFlowElement = relatingFlowElement;
	}


}

