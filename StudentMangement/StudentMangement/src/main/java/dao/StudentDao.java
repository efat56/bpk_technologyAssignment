package dao;

import java.util.List;

import exceptions.RegisterException;
import exceptions.StudentExceptions;
import exceptions.SubjectExceptions;
import model.ReportCard;
import model.Student;

public interface StudentDao {
	
	public Student registerstudent(Student stu) throws RegisterException;  
	public Student getStudent(int studentId) throws StudentExceptions;
	public ReportCard createReportCard(ReportCard repoCard)throws StudentExceptions;
	public String updateDetails(int studentId) throws SubjectExceptions;
	public List<ReportCard> getStudentMoreThanSixty();
	

}
