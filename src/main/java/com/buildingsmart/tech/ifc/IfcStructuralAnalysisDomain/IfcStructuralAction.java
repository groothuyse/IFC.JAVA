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
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralCurveAction;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralPointAction;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceAction;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralActivity;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum;

@Guid("773e5eda-f463-41ec-a0f4-14681750a780")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralCurveAction.class, name = "IfcStructuralCurveAction"), @JsonSubTypes.Type(value = IfcStructuralPointAction.class, name = "IfcStructuralPointAction"), @JsonSubTypes.Type(value = IfcStructuralSurfaceAction.class, name = "IfcStructuralSurfaceAction")})
public abstract class IfcStructuralAction extends IfcStructuralActivity
{
	@Description("Indicates if this action may cause a stability problem. If it is 'FALSE', no further investigations regarding stability problems are necessary.")
	@Guid("7e7162c0-17e9-4165-9c29-294aefb1216b")
	@JacksonXmlProperty(isAttribute=true, localName = "DestabilizingLoad")
	private Boolean destabilizingLoad;


	public IfcStructuralAction()
	{
	}

	public IfcStructuralAction(String globalId, IfcStructuralLoad appliedLoad, IfcGlobalOrLocalEnum globalOrLocal)
	{
		super(globalId, appliedLoad, globalOrLocal);
	}

	public Boolean getDestabilizingLoad() {
		return this.destabilizingLoad;
	}

	public void setDestabilizingLoad(Boolean destabilizingLoad) {
		this.destabilizingLoad = destabilizingLoad;
	}


}

