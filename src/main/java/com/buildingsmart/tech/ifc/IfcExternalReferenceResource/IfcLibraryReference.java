// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

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
import com.buildingsmart.tech.ifc.IfcKernel.*;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReference;

@Guid("739c22f8-9791-4f05-b25d-70ddc3ed443f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLibraryReference extends IfcExternalReference implements IfcLibrarySelect
{
	@Description("Additional description provided for the library reference.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.  </blockquote>")
	@Guid("c36f2056-db4c-4e1e-b01c-a5a7d5794c09")
	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	private String description;

	@Description("The language in which a library reference is expressed.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New attribute added at the end of the attribute list.  </blockquote>")
	@Guid("48d70f10-19be-4364-a36d-d32efe9e72de")
	@JacksonXmlProperty(isAttribute=false, localName = "Language")
	private IfcLanguageId language;

	@Description("The library information that is being referenced.")
	@Guid("0ddfeb57-9edd-46aa-8369-dff55be36456")
	@JacksonXmlProperty(isAttribute=false, localName = "ReferencedLibrary")
	private IfcLibraryInformation referencedLibrary;

	@Description("The library reference with which objects are associated.  <blockquote class=\"change-ifc2x4\">    IFC4 CHANGE&nbsp; New inverse attribute.  </blockquote>")
	@Guid("369a8e6b-21f9-42f6-82fc-0feec6c5a0fe")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelAssociatesLibrary")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "LibraryRefForObjects")
	private Set<IfcRelAssociatesLibrary> libraryRefForObjects;


	public IfcLibraryReference()
	{
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public IfcLanguageId getLanguage() {
		return this.language;
	}

	public void setLanguage(IfcLanguageId language) {
		this.language = language;
	}

	public IfcLibraryInformation getReferencedLibrary() {
		return this.referencedLibrary;
	}

	public void setReferencedLibrary(IfcLibraryInformation referencedLibrary) {
		this.referencedLibrary = referencedLibrary;
	}

	public Set<IfcRelAssociatesLibrary> getLibraryRefForObjects() {
		return this.libraryRefForObjects;
	}


}

