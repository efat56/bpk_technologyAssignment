package com.bpk.usecase;

import java.util.Scanner;

import com.bpk.dao.StudentDao;
import com.bpk.dao.StudentDaoImpl;
import com.bpk.entity.Grade;


public class RegisterGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter student gradeName");
			String gradeName = sc.next();
			
			Grade gr = new Grade();
			gr.setGradeName(gradeName);
			
			StudentDao sDao = new StudentDaoImpl();
			sDao.registerGrade(gr);

	}

}
