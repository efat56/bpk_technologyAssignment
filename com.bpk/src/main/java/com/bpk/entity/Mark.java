package com.bpk.entity;

import javax.persistence.*;

@Entity
@Table(name = "Marks")
public class Mark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int markID;

    @ManyToOne
    @JoinColumn(name = "studentID", nullable = false)
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subjectID", nullable = false)
    private Subject subject;

    @ManyToOne
    @JoinColumn(name = "gradeID", nullable = false)
    private Grade grade;

    private int marksObtained;

    // Constructors, getters, setters, and other methods
    public Mark() {
		// TODO Auto-generated constructor stub
	}

	public Mark(int markID, Student student, Subject subject, Grade grade, int marksObtained) {
		super();
		this.markID = markID;
		this.student = student;
		this.subject = subject;
		this.grade = grade;
		this.marksObtained = marksObtained;
	}

	public int getMarkID() {
		return markID;
	}

	public void setMarkID(int markID) {
		this.markID = markID;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}

	@Override
	public String toString() {
		return "Mark [markID=" + markID + ", student=" + student + ", subject=" + subject + ", grade=" + grade
				+ ", marksObtained=" + marksObtained + "]";
	}
    
    
}

