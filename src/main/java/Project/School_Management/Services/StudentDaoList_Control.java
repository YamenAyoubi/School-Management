package Project.School_Management.Services;

import java.util.*;

import Project.School_Management.DataAccess.CourseDaoList;
import Project.School_Management.DataAccess.StudentDaoList;
import Project.School_Management.Models.Course;
import Project.School_Management.Models.Student;

public class StudentDaoList_Control {

	static Scanner in = new Scanner(System.in);

	static StudentDaoList theStudentList = new StudentDaoList();

	public static StudentDaoList createStudentListDaoList() {
		Student STD = new Student("YAMEN", "YAMEN@G.COM", "NAYGATAN", "NULL");
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
		System.out.println("Student Has Been Stored");
		return theStudentList;
	}

	public static StudentDaoList findById() {
		System.out.println("Enter the Student id:");
		int id = in.nextInt();
		theStudentList.findById(id);
		System.out.println(theStudentList.findById(id));
		return theStudentList;
	}

	public static StudentDaoList findByName() {
		System.out.println("Enter the Student Name:");
		String name = in.next();
		theStudentList.findByName(name);
		System.out.println(theStudentList.findByName(name));
		return theStudentList;

	}

	public static StudentDaoList findByEmail() {
		System.out.println("Enter the Student email:");
		String email = in.nextLine();
		theStudentList.findByEmail(email);
		System.out.println(theStudentList.findByEmail(email));
		return theStudentList;

	}

	public static StudentDaoList DeleteStudent() {
		System.out.println("Please Enter The Student ID ");
		int id = in.nextInt();
		Student result = theStudentList.findById(id);
		System.out.println(theStudentList.deleteStudent(result));
		return theStudentList;

	}

	public static void ShowAll() {

		System.out.println(theStudentList.findAll());
	}
}
