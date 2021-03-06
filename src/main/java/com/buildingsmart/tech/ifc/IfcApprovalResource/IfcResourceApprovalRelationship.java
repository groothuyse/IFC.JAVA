// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcApprovalResource;

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
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.*;
import com.buildingsmart.tech.ifc.IfcApprovalResource.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceObjectSelect;
import com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval;

@Guid("6de8ca8d-3bd7-4b78-8326-eece0c07a365")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcResourceApprovalRelationship extends com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcResourceLevelRelationship
{
	@Description("Resource objects that are approved.")
	@Required()
	@Guid("c6883e2d-5f86-4009-859d-e33bbdc46730")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcResourceObjectSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "RelatedResourceObjects")
	private Set<IfcResourceObjectSelect> relatedResourceObjects;

	@Description("The approval for the resource objects selected.")
	@Required()
	@Guid("7a73f010-f2e7-4683-b597-b07460897bf5")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingApproval")
	private IfcApproval relatingApproval;


	public IfcResourceApprovalRelationship()
	{
	}

	public IfcResourceApprovalRelationship(IfcResourceObjectSelect[] relatedResourceObjects, IfcApproval relatingApproval)
	{
		this.relatedResourceObjects = new HashSet<>(Arrays.asList(relatedResourceObjects));
		this.relatingApproval = relatingApproval;
	}

	public Set<IfcResourceObjectSelect> getRelatedResourceObjects() {
		return this.relatedResourceObjects;
	}

	public IfcApproval getRelatingApproval() {
		return this.relatingApproval;
	}

	public void setRelatingApproval(IfcApproval relatingApproval) {
		this.relatingApproval = relatingApproval;
	}


}

