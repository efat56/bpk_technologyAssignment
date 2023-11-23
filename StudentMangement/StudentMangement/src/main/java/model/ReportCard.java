package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="ReportCard")
public class ReportCard {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reportCardId;
	private String firstName;
    private String lastName;
    private int rollNo;
	private int grade;
	private int maxMarks;
	private int totalmarks;
	private double percentage;
	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "reportCard")  // Corrected mappedBy attribute
//    private List<Subjects> subjects;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "reportCard")
	private List<Subjects> subjects;
	@OneToOne
	@JoinColumn(name = "student_id")
	private Student student;
	
	public double calculatePercentage()
	{
		
		return percentage;
		
	}
   
	public ReportCard() {
		// TODO Auto-generated constructor stub
	}

	

	public ReportCard( String firstName, String lastName, int rollNo, int grade, int maxMarks,
			int totalmarks, double percentage, List<Subjects> subjects) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.grade = grade;
		this.maxMarks = maxMarks;
		this.totalmarks = totalmarks;
		this.percentage = percentage;
		this.subjects = subjects;
	}

	public Long getReportCardId() {
		return reportCardId;
	}

	public void setReportCardId(Long reportCardId) {
		this.reportCardId = reportCardId;
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

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "ReportCard [reportCardId=" + reportCardId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", rollNo=" + rollNo + ", grade=" + grade + ", maxMarks=" + maxMarks + ", totalmarks=" + totalmarks
				+ ", percentage=" + percentage + ", subjects=" + subjects + ", student=" + student + "]";
	}
  
	
	
	

}
