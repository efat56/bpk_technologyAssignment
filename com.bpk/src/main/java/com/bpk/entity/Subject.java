package com.bpk.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Subjects")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subjectID;

    private String subjectName;

    @OneToMany(mappedBy = "subject")
    private List<Mark> marks;

    // Constructors, getters, setters, and other methods
    
    public Subject() {
		// TODO Auto-generated constructor stub
	}

	public Subject(int subjectID, String subjectName, List<Mark> marks) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.marks = marks;
	}

	public int getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public List<Mark> getMarks() {
		return marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Subject [subjectID=" + subjectID + ", subjectName=" + subjectName + "]";
	}
    
    
}

