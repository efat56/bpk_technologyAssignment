package com.bpk.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Grades")
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gradeID;

    private String gradeName;

    @OneToMany(mappedBy = "grade")
    private List<Mark> marks;

    // Constructors, getters, setters, and other methods
    
    public Grade() {
		// TODO Auto-generated constructor stub
	}

	public Grade(int gradeID, String gradeName, List<Mark> marks) {
		super();
		this.gradeID = gradeID;
		this.gradeName = gradeName;
		this.marks = marks;
	}

	public int getGradeID() {
		return gradeID;
	}

	public void setGradeID(int gradeID) {
		this.gradeID = gradeID;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public List<Mark> getMarks() {
		return marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Grade [gradeID=" + gradeID + ", gradeName=" + gradeName + ", marks=" + marks + "]";
	}
    
    
}

