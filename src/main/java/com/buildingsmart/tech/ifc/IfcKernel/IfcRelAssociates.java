// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

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
import com.buildingsmart.tech.ifc.IfcKernel.*;
import com.buildingsmart.tech.ifc.IfcControlExtension.IfcRelAssociatesApproval;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesClassification;
import com.buildingsmart.tech.ifc.IfcControlExtension.IfcRelAssociatesConstraint;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesDocument;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociatesLibrary;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelAssociatesMaterial;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelationship;
import com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect;

@Guid("50e72608-2b70-4951-afa7-68d8cf130d15")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcRelAssociatesApproval.class, name = "IfcRelAssociatesApproval"), @JsonSubTypes.Type(value = IfcRelAssociatesClassification.class, name = "IfcRelAssociatesClassification"), @JsonSubTypes.Type(value = IfcRelAssociatesConstraint.class, name = "IfcRelAssociatesConstraint"), @JsonSubTypes.Type(value = IfcRelAssociatesDocument.class, name = "IfcRelAssociatesDocument"), @JsonSubTypes.Type(value = IfcRelAssociatesLibrary.class, name = "IfcRelAssociatesLibrary"), @JsonSubTypes.Type(value = IfcRelAssociatesMaterial.class, name = "IfcRelAssociatesMaterial")})
public abstract class IfcRelAssociates extends IfcRelationship
{
	@Description("Set of object or property definitions to which the external references or information is associated. It includes object and type objects, property set templates, property templates and property sets and contexts.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute datatype has been changed from <em>IfcRoot</em> to <em>IfcDefinitionSelect</em>.</blockquote>")
	@Required()
	@Guid("22a3ccef-98eb-4699-b8ff-4edd0ca9ab83")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcDefinitionSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "RelatedObjects")
	private Set<IfcDefinitionSelect> relatedObjects;


	public IfcRelAssociates()
	{
	}

	public IfcRelAssociates(String globalId, IfcDefinitionSelect[] relatedObjects)
	{
		super(globalId);
		this.relatedObjects = new HashSet<>(Arrays.asList(relatedObjects));
	}

	public Set<IfcDefinitionSelect> getRelatedObjects() {
		return this.relatedObjects;
	}


}

