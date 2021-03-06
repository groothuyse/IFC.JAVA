// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcHvacDomain;

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
import com.buildingsmart.tech.ifc.IfcHvacDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDeviceType;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcDuctSilencerTypeEnum;

@Guid("b6e2b5f0-ba5e-4c1d-8134-0a940db3ccec")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcDuctSilencerType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTreatmentDeviceType
{
	@Description("The type of duct silencer.")
	@Required()
	@Guid("14607837-c791-4913-a67c-4c23862018c8")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcDuctSilencerTypeEnum predefinedType;


	public IfcDuctSilencerType()
	{
	}

	public IfcDuctSilencerType(String globalId, IfcDuctSilencerTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcDuctSilencerTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcDuctSilencerTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

