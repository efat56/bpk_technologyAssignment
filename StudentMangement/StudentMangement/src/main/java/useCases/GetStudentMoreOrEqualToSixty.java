package useCases;

import dao.StudentDao;
import dao.StudentDaoImpl;
import exceptions.StudentExceptions;

public class GetStudentMoreOrEqualToSixty {
	public static void main(String[] args)  {
		StudentDao sd= new StudentDaoImpl();
	
		System.out.println(sd.getStudentMoreThanSixty());
		
	}

}
