package Project.School_Management.Services;


import java.util.Scanner;

import Project.School_Management.DataAccess.CourseDao_impl;
import Project.School_Management.Models.Course;
import Project.School_Management.Models.Student;
import Project.School_Management.Utilites.InputValidNumberAsTheList;

public class CoursDaoList_Control {

	private static Scanner in = new Scanner(System.in);
	private static CourseDao_impl theCoursesList = new CourseDao_impl();

	public static CourseDao_impl CreatNewCourse() {
		
		Course cor = new Course("C++", 6);
		System.out.println("Pls Add The Course Name ");
		String courseName = in.next();
		cor.setCourseName(courseName);
		System.out.println("Course Name Has Been Added ");
		System.out.println("Pls Add The Course WeekDuration 1 TO 36");
		int weekduration = InputValidNumberAsTheList.inputNumber(1, 36);
		cor.setWeekDuration(weekduration);
		theCoursesList.saveCourse(cor);
		cor.ToPrint();
		System.out.println("Course WeekDuration Has Been Added ");
		return theCoursesList;

	}

	public static CourseDao_impl findById() {
		System.out.println("Enter the Course id:");
		int id = in.nextInt();
		theCoursesList.findById(id);
		System.out.println(theCoursesList.findById(id));
		return theCoursesList;
	}

	public static CourseDao_impl findByName() {
		System.out.println("Enter the course Name:");
		String name = in.nextLine();
		theCoursesList.findByName(name);
		return theCoursesList;

	}

	public static void findAll() {
		System.out.println(theCoursesList.findAll());
	}

	public static CourseDao_impl removeCourse() {
		System.out.println("by id please enter the Course id ");
		int id = in.nextInt();
		theCoursesList.toPrintCourse(theCoursesList.findById(id));
		Course course = theCoursesList.findById(id);
		theCoursesList.removeCourse(course);
		return theCoursesList;
	}
	
	
	
	public static CourseDao_impl AddStudentToCourse () {
		
		return theCoursesList;	
	}
}
