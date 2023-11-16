package com.bpk.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.bpk.entity.Grade;
import com.bpk.entity.Mark;
import com.bpk.entity.Student;
import com.bpk.entity.Subject;
import com.bpk.util.EMUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void registerStudent(Student student) {
		// TODO Auto-generated method stub
  EntityManager em =EMUtil.provideEntityManager();
		  
		  em.getTransaction().begin();
		  em.persist(student);
		  em.getTransaction().commit();
		  
		  
		  
		  
		  
		  em.close();
		
	}

	@Override
	public void registerSubject(Subject subject) {
		// TODO Auto-generated method stub
		 EntityManager em =EMUtil.provideEntityManager();
		  
		  em.getTransaction().begin();
		  em.persist(subject);
		  em.getTransaction().commit();
		  
		  
		  
		  
		  
		  em.close();
		
	}

	@Override
	public void registerGrade(Grade grades) {
		// TODO Auto-generated method stub
		 EntityManager em =EMUtil.provideEntityManager();
		  
		  em.getTransaction().begin();
		  em.persist(grades);
		  em.getTransaction().commit();
		  
		  
		  
		  
		  
		  em.close();
		
	}

	@Override
	public void registerMarks(Mark marks) {
		// TODO Auto-generated method stub
		 EntityManager em =EMUtil.provideEntityManager();
		  
		  em.getTransaction().begin();
		  em.persist(marks);
		  em.getTransaction().commit();
		  
		  
		  
		  
		  
		  em.close();
		
	}

	@Override
	public List<Student> getAllStudentsObtainedMarksGrater60(Student st) {
		// TODO Auto-generated method stub
		EntityManager em =EMUtil.provideEntityManager();
		
		 List<Student> studentsList = new ArrayList<>();
		 
		 String jpql = "FROM Students " +
                 "JOIN Marks ON Students.StudentID = Marks.StudentID " +
                 "WHERE Marks.MarksObtained > 60";
		 
		 Query q= em.createQuery(jpql);
			
			List<Student> allStu= q.getResultList();
			
				
			System.out.println(allStu);
			
		return studentsList;
	}

}
