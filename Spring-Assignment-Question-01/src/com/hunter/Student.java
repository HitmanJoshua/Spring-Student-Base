package com.hunter;

//import com.hunter.validation.CourseCode;
//import com.hunter.validation.CourseCodePrime;

public class Student {

	private String Name;
	private String Section;
	private String fatherName;
	private String Address;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSection() {
		return Section;
	}
	public void setSection(String section) {
		Section = section;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	
	
}
