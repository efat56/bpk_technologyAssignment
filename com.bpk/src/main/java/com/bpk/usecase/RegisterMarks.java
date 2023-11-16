package com.bpk.usecase;

import java.util.Scanner;

import com.bpk.dao.StudentDao;
import com.bpk.dao.StudentDaoImpl;

import com.bpk.entity.Mark;

public class RegisterMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student marksObtained");
		int marks  = sc.nextInt();
		
		Mark mr = new Mark();
		mr.setMarksObtained(marks);
		
		StudentDao sDao = new StudentDaoImpl();
		sDao.registerMarks(mr);

	}

}
