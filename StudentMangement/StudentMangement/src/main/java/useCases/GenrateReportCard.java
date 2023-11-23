package useCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.StudentDao;
import dao.StudentDaoImpl;
import exceptions.StudentExceptions;
import model.ReportCard;
import model.Student;
import model.Subjects;

public class GenrateReportCard {

    public static void main(String[] args) throws StudentExceptions {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Student Id : ");
        int id = sc.nextInt();
        StudentDao sd = new StudentDaoImpl();
        Student stu = sd.getStudent(id);
        if (stu != null) {

            int roll = stu.getRollNo();
            int grade = stu.getGrade();
            String Name = stu.getFirstName();
            String lName = stu.getLastName();

            System.out.println("Enter The Number of Subjects :");
            int n = sc.nextInt();

            List<Subjects> subjects = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                System.out.println("Enter the Subject Name :");
                String sub = sc.next();
                System.out.println("Enter the Max marks :");
                int maxMarks = sc.nextInt();
                System.out.println("Enter the Obtain marks :");
                int obtainMarks = sc.nextInt();

                Subjects subj = new Subjects();
                subj.setSubject(sub);
                subj.setMaxMarks(maxMarks);
                subj.setMarks(obtainMarks);

                subjects.add(subj);
            }

            ReportCard reportCard = new ReportCard(Name, lName, roll, grade, 1000, 600, 60.0, subjects);

            sd.createReportCard(reportCard);
        }

        sc.close();
    }
}
