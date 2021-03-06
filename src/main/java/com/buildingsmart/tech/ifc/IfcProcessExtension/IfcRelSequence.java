// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

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
import com.buildingsmart.tech.ifc.IfcDateTimeResource.*;
import com.buildingsmart.tech.ifc.IfcProcessExtension.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects;
import com.buildingsmart.tech.ifc.IfcKernel.IfcProcess;

@Guid("99cd2ac0-7e3f-4393-bf5a-fbd991bf194b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelSequence extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Reference to the process, that is the predecessor.")
	@Required()
	@Guid("22284f64-9b1c-42ca-ad5b-c1332fc7f416")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingProcess")
	private IfcProcess relatingProcess;

	@Description("Reference to the process, that is the successor.")
	@Required()
	@Guid("0512a983-f4fe-4536-8095-7defbd21c65b")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatedProcess")
	private IfcProcess relatedProcess;

	@Description("Time duration of the sequence, it is the time lag between the      predecessor and the successor as specified by the      SequenceType.")
	@Guid("94d09d41-3b26-40a2-803f-92dc47187a91")
	@JacksonXmlProperty(isAttribute=false, localName = "TimeLag")
	private IfcLagTime timeLag;

	@Description("The way in which the time lag applies to the sequence.")
	@Guid("b73f79bf-ab44-454c-9180-a11e3cf40323")
	@JacksonXmlProperty(isAttribute=true, localName = "SequenceType")
	private IfcSequenceEnum sequenceType;

	@Description("Allows for specification of user defined type of the sequence      beyond the enumeration values (START_START, START_FINISH,      FINISH_START, FINISH_FINISH) provided by <em>SequenceType</em>      attribute of type <em>IfcSequenceEnum</em>. When a value is      provided for attribute <em>UserDefinedSequenceType</em> in      parallel the attribute <em>SequenceType</em> shall have      enumeration value USERDEFINED.      <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added</blockquote>")
	@Guid("2514fd3f-d851-4771-a4ec-5e55b283085a")
	@JacksonXmlProperty(isAttribute=true, localName = "UserDefinedSequenceType")
	private String userDefinedSequenceType;


	public IfcRelSequence()
	{
	}

	public IfcRelSequence(String globalId, IfcProcess relatingProcess, IfcProcess relatedProcess)
	{
		super(globalId);
		this.relatingProcess = relatingProcess;
		this.relatedProcess = relatedProcess;
	}

	public IfcProcess getRelatingProcess() {
		return this.relatingProcess;
	}

	public void setRelatingProcess(IfcProcess relatingProcess) {
		this.relatingProcess = relatingProcess;
	}

	public IfcProcess getRelatedProcess() {
		return this.relatedProcess;
	}

	public void setRelatedProcess(IfcProcess relatedProcess) {
		this.relatedProcess = relatedProcess;
	}

	public IfcLagTime getTimeLag() {
		return this.timeLag;
	}

	public void setTimeLag(IfcLagTime timeLag) {
		this.timeLag = timeLag;
	}

	public IfcSequenceEnum getSequenceType() {
		return this.sequenceType;
	}

	public void setSequenceType(IfcSequenceEnum sequenceType) {
		this.sequenceType = sequenceType;
	}

	public String getUserDefinedSequenceType() {
		return this.userDefinedSequenceType;
	}

	public void setUserDefinedSequenceType(String userDefinedSequenceType) {
		this.userDefinedSequenceType = userDefinedSequenceType;
	}


}

