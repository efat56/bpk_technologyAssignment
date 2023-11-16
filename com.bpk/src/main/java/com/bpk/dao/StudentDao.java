package com.bpk.dao;

import java.util.List;

import com.bpk.entity.Grade;
import com.bpk.entity.Mark;
import com.bpk.entity.Student;
import com.bpk.entity.Subject;

public interface StudentDao {
	
	public void registerStudent(Student student);
	public void registerSubject(Subject subject);
	public void registerGrade(Grade grades);
	public void registerMarks(Mark marks);
	public List<Student> getAllStudentsObtainedMarksGrater60(Student st);
	
	

}
