package com.bpk.usecase;

import java.util.Scanner;

import com.bpk.dao.StudentDao;
import com.bpk.dao.StudentDaoImpl;
import com.bpk.entity.Grade;

public class MarksGreaterThanSixty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter Grade Id : ");
		int grade  = sc.nextInt();
		
		
		Grade gr = new Grade();
		gr.setGradeID(grade);
		
		StudentDao sDao = new StudentDaoImpl();
		//sDao.getAllStudentsObtainedMarksGrater60(gr);
		

	}

}
