package Utilities;

import java.util.*;

import DataAccess.CourseDaoList;
import DataAccess.StudentDaoList;
import Models.Course;
import Models.Student;

public class StudentDaoList_Control {


	static Scanner in = new Scanner(System.in);

	static StudentDaoList theStudentList = new StudentDaoList();

	public static StudentDaoList createStudentListDaoList() {
		Student STD = new Student("YAMEN", "YAMEN@G.COM", "NAYGATAN", "COURSE");
		theStudentList.saveStudent(STD);
		STD = new Student("mogh", "mog@G.COM", "mog", "COURSE");
		theStudentList.saveStudent(STD);
		System.out.println("Pls Add The Name ");
		String Name = in.next();
		STD.setName(Name);
		System.out.println("Student Name Has Been Added ");
		System.out.println("Pls Add The Email");
		String Email = in.next();
		STD.setEmail(Email);
		System.out.println("Student Email Has Been Added ");
		System.out.println("Pls Add The Address");
		String Address = in.next();
		STD.setAddress(Address);
		System.out.println("Student Address Has Been Added ");
		theStudentList.saveStudent(STD);
		STD.ToPrint();
		return theStudentList;
	}

	public static void findStudent() {
		System.out.println("1=by id" + "" + "\n2=by name");
		int Selections = in.nextInt();
		switch (Selections) {
		case 1:
			System.out.println("Enter the student id:");
			int id = in.nextInt();
			theStudentList.findById(id);
			break;
		case 2:
			System.out.println("Enter the student Name:");
			String name = in.next();
			theStudentList.ToPrintNewStudent(theStudentList.findByName(name));
			break;
		}

	}

	public static void DeleteStudent() {
		System.out.println("by id please enter the id ");
		int id = in.nextInt();
		theStudentList.ToPrintNewStudent(theStudentList.findById(id));
		Student result = theStudentList.findById(id);
		theStudentList.deleteStudent(result);

	}
}
