package Project.School_Management.Services;

import Project.School_Management.DataAccess.CourseDao_impl;
import Project.School_Management.DataAccess.ScannerInputDAO_impl;
import Project.School_Management.DataAccess.StudentDao_impl;
import Project.School_Management.Models.Course;
import Project.School_Management.Models.Student;

public class StudentDaoList_Control {

	private static ScannerInputDAO_impl scanerInput=new ScannerInputDAO_impl();
	private static CourseDao_impl theCoursesList = new CourseDao_impl();
	static StudentDao_impl theStudentList = new StudentDao_impl();

	public static StudentDao_impl createStudentListDaoList() {
		Student std = new Student("name", "email", "address" , "STD");
		System.out.println("Pls Add The Name ");
		String name = scanerInput.getString();
		std.setName(name);
		System.out.println("Student Name Has Been Added ");
		System.out.println("Pls Add The Email");
		String Email = scanerInput.getString();
		std.setEmail(Email);
		System.out.println("Student Email Has Been Added ");
		System.out.println("Pls Add The Address");
		String address = scanerInput.getString();
		std.setAddress(address);
		System.out.println("Student Address Has Been Added ");
		theStudentList.saveStudent(std);
		std.toPrint();
		System.out.println("Student Has Been Stored");
		return theStudentList;
	}

	public static StudentDao_impl findById() {
		System.out.println("Enter the Student id:");
		int id = scanerInput.getInt();
		theStudentList.findById(id);
		System.out.println(theStudentList.findById(id));
		return theStudentList;
	}

	public static StudentDao_impl findByName() {
		System.out.println("Enter the Student Name:");
		String name = scanerInput.getString();
		theStudentList.findByName(name);
		System.out.println(theStudentList.findByName(name));
		return theStudentList;

	}

	public static StudentDao_impl findByEmail() {
		System.out.println("Enter the Student email:");
		String email = scanerInput.getString();
		theStudentList.findByEmail(email);
		System.out.println(theStudentList.findByEmail(email));
		return theStudentList;

	}

	public static StudentDao_impl DeleteStudent() {
		System.out.println("Please Enter The Student ID ");
		int id = scanerInput.getInt();
		Student result = theStudentList.findById(id);
		System.out.println(theStudentList.deleteStudent(result));
		return theStudentList;

	}

	public static StudentDao_impl ShowAll() {

		System.out.println(theStudentList.findAll());
		return theStudentList;
	}
	
	public static StudentDao_impl AddToCourse() {
		System.out.println("Be Sure That You Have The Student ID & The Course ID");
		System.out.println("Enter the Student id:");
		int studentId = scanerInput.getInt();
		theStudentList.findById(studentId);
		System.out.println(theStudentList.findById(studentId));
		Student result1=theStudentList.findById(studentId);
		System.out.println("Enter the Course id:");
		int courseId = scanerInput.getInt();
		theCoursesList.findById(courseId);
		System.out.println(theCoursesList.findById(courseId));
		Course result2 =theCoursesList.findById(courseId);
		String pcikCourseName = result2.getCourseName();
		result1.setCourse(pcikCourseName);
		System.out.println("Student Has Been Added To The Course");
		System.out.println(result1);
		return theStudentList;
	}
}