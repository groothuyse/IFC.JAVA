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
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcBuildingSystem;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionSystem;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralAnalysisModel;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcZone;
import com.buildingsmart.tech.ifc.IfcKernel.IfcGroup;

@Guid("dffb2f7f-2ba0-4b5f-88e4-bde0fa72fa1d")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBuildingSystem.class, name = "IfcBuildingSystem"), @JsonSubTypes.Type(value = IfcDistributionSystem.class, name = "IfcDistributionSystem"), @JsonSubTypes.Type(value = IfcStructuralAnalysisModel.class, name = "IfcStructuralAnalysisModel"), @JsonSubTypes.Type(value = IfcZone.class, name = "IfcZone")})
public class IfcSystem extends com.buildingsmart.tech.ifc.IfcKernel.IfcGroup
{
	@Description("Reference to the <strike>building</strike> spatial structure via the objectified relationship <em>IfcRelServicesBuildings</em>, which is serviced by the system.")
	@Guid("9aebcdcb-6859-4a94-9ebc-9143ff0fcde4")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelServicesBuildings")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ServicesBuildings")
	private Set<IfcRelServicesBuildings> servicesBuildings;


	public IfcSystem()
	{
	}

	public IfcSystem(String globalId)
	{
		super(globalId);
	}

	public Set<IfcRelServicesBuildings> getServicesBuildings() {
		return this.servicesBuildings;
	}


}

