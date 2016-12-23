package com.musala.xml.parser.database.structure.model.models;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "schoolClasses")
public class SchoolClassListWrapper {
	List<SchoolClass> schoolClasses;

	@XmlElement(name = "schoolClass")
	public void setSchoolClasses(List<SchoolClass> schoolClasses) {
		this.schoolClasses = schoolClasses;
	}

	public List<SchoolClass> getSchoolClasses() {
		return schoolClasses;
	}
}
