package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import exceptions.RegisterException;
import exceptions.StudentExceptions;
import exceptions.SubjectExceptions;
import model.ReportCard;
import model.Student;
import utility.EMUtil;

public class StudentDaoImpl implements StudentDao {

	@Override
	public Student registerstudent(Student stu) throws RegisterException {
		EntityManager em =EMUtil.provideEntityManager();
		  
		  em.getTransaction().begin();
		  em.persist(stu);
		  em.getTransaction().commit();
		  
		  
	      em.close();
	      return stu;
	}

	

	@Override
	public List<ReportCard> getStudentMoreThanSixty()  {
		 EntityManager em = EMUtil.provideEntityManager();
		 List<ReportCard> repoCard = null;
	        try {
	            em.getTransaction().begin();

	            TypedQuery<ReportCard> query = em.createQuery(
	                    "SELECT s FROM ReportCard s WHERE s.reportCard.percentage = 60", ReportCard.class);

	             repoCard = query.getResultList();

	            if (repoCard.isEmpty()) {
	                throw new StudentExceptions("No students found with a percentage greater than 60");
	            }
               return repoCard;
	            // Assuming you want to return the first student with a percentage greater than 60            return students.get(0);
	        } catch (Exception e) {
	            em.getTransaction().rollback();
	            //throw new StudentExceptions("Error retrieving students with more than sixty");
	        } finally {
	            em.close();
	        }
			return repoCard;
	        
	}

	@Override
	public ReportCard createReportCard(ReportCard repoCard) throws StudentExceptions {
		EntityManager em =EMUtil.provideEntityManager();
		  em.getTransaction().begin();
		  em.persist(repoCard);
		  em.getTransaction().commit();
		  
		  
	      em.close();
	      return repoCard;
	}



	@Override
	public Student getStudent(int studentId) throws StudentExceptions {
		 EntityManager em = EMUtil.provideEntityManager();
		    
		    try {
		        em.getTransaction().begin();

		        Student student = em.find(Student.class, studentId);

		        if (student == null) {
		            throw new StudentExceptions("Student with ID " + studentId + " not found");
		        }

		        return student;
		    } catch (Exception e) {
		        
		        throw new StudentExceptions("Student is not is present with ID " + studentId);
		    } finally {
		       
		        if (em.getTransaction().isActive()) {
		            em.getTransaction().rollback();
		        }
		        em.close();
		    }
	}



	@Override
	public String updateDetails(int studentId) throws SubjectExceptions {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
