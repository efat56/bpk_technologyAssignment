package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Students")
public class Student {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int studentId;
	    private String firstName;
	    private String lastName;
	    private int rollNo;
	    private String dob;
	    private String parentName;
	    private String address;
	    private String city;
	    private String phoneNumber;
	    private int grade;
	    
	    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	    private ReportCard reportCard;
	     
	   public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String firstName, String lastName, int rollNo, String dob, String parentName,
			String address, String city, String phoneNumber, int grade, ReportCard reportCard) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.dob = dob;
		this.parentName = parentName;
		this.address = address;
		this.city = city;
		this.phoneNumber = phoneNumber;
		this.grade = grade;
		this.reportCard = reportCard;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public ReportCard getReportCard() {
		return reportCard;
	}

	public void setReportCard(ReportCard reportCard) {
		this.reportCard = reportCard;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", rollNo="
				+ rollNo + ", dob=" + dob + ", parentName=" + parentName + ", address=" + address + ", city=" + city
				+ ", phoneNumber=" + phoneNumber + ", grade=" + grade + ", reportCard=" + reportCard + "]";
	}
	   
        

}
