// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcBuildingControlsDomain;

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
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType;
import com.buildingsmart.tech.ifc.IfcBuildingControlsDomain.IfcFlowInstrumentTypeEnum;

@Guid("92253df9-2c74-4a77-9837-72f4f240f459")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFlowInstrumentType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType
{
	@Description("<p>Identifies the predefined types of flow instrument from which the type required may be set.</p>")
	@Required()
	@Guid("cf7b1015-4346-4cfb-96ea-ad21f3becfe7")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcFlowInstrumentTypeEnum predefinedType;


	public IfcFlowInstrumentType()
	{
	}

	public IfcFlowInstrumentType(String globalId, IfcFlowInstrumentTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcFlowInstrumentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFlowInstrumentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

