package useCases;

import java.util.Scanner;

import dao.StudentDao;
import dao.StudentDaoImpl;
import exceptions.RegisterException;
import model.Student;

public class RegisterStudent {
	
	public static void main(String[] args) throws RegisterException {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student First Name");
		String fName = sc.next();
		
		System.out.println("Enter student Last Name");
		String lName = sc.next();
		
		System.out.println("Enter student roll Number");
		int roll = sc.nextInt();
		
		
		System.out.println("Enter student date Of Birth");
		String dob = sc.next();
		
		System.out.println("Enter student parent Name");
		String pName = sc.next();
		
		System.out.println("Enter student address");
		String addr = sc.next();
		
		
		System.out.println("Enter student city");
		String city = sc.next();
		
		System.out.println("Enter student phoneNumber");
		String phone = sc.next();
		
		System.out.println("Enter student grade....");
		int grade = sc.nextInt();
		
		Student st = new Student();
		st.setFirstName(fName);
		st.setLastName(lName);
		st.setRollNo(roll);
		st.setDob(dob);
		st.setParentName(pName);
		st.setAddress(addr);
		st.setCity(city);
		st.setPhoneNumber(phone);
		st.setGrade(grade);
		
		StudentDao sDao = new StudentDaoImpl();
		sDao.registerstudent(st);
		
		
	}

}