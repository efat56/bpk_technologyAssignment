package com.bpk.usecase;

import java.util.Scanner;

import com.bpk.dao.StudentDao;
import com.bpk.dao.StudentDaoImpl;
import com.bpk.entity.Subject;

public class RegisterSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student subjectName");
		String subName = sc.next();
		
		Subject sub = new Subject();
		sub.setSubjectName(subName);
		
		StudentDao sDao = new StudentDaoImpl();
		sDao.registerSubject(sub);

	}

}
