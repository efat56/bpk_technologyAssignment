package com.bpk.usecase;

import java.util.Scanner;

import com.bpk.dao.StudentDao;
import com.bpk.dao.StudentDaoImpl;
import com.bpk.entity.Student;

public class RegisterStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student firstName");
		String fName = sc.next();
		
		System.out.println("Enter student lastName");
		String lName = sc.next();
		
		System.out.println("Enter student dateOfBirth");
		String dob = sc.next();
		
		System.out.println("Enter student parentName");
		String pName = sc.next();
		
		System.out.println("Enter student address");
		String addr = sc.next();
		
		System.out.println("Enter student city");
		String city = sc.next();
		
		System.out.println("Enter student phoneNumber");
		String phone = sc.next();
		
		Student st = new Student();
		st.setFirstName(fName);
		st.setLastName(lName);
		st.setDateOfBirth(dob);
		st.setParentName(pName);
		st.setAddress(addr);
		st.setCity(city);
		st.setPhoneNumber(phone);
		
		StudentDao sd = new StudentDaoImpl();
		sd.registerStudent(st);
		System.out.println("Done....");

	}

}
