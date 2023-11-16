package com.bpk.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentID;

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String parentName;
    private String address;
    private String city;
    private String phoneNumber;

    @OneToMany(mappedBy = "student")
    private List<Mark> marks;

    // Constructors, getters, setters, and other methods
    
    public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentID, String firstName, String lastName, String dateOfBirth, String parentName,
			String address, String city, String phoneNumber, List<Mark> marks) {
		super();
		this.studentID = studentID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.parentName = parentName;
		this.address = address;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.marks = marks;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Mark> getMarks() {
		return marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", parentName=" + parentName + ", address=" + address + ", city="
				+ city + ", phoneNumber=" + phoneNumber + "]";
	}

	
    
    
}

