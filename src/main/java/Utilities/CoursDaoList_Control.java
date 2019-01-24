package Utilities;

import java.util.List;
import java.util.Scanner;

import DataAccess.CourseDaoList;
import Models.Course;

public class CoursDaoList_Control {

	static Scanner in = new Scanner(System.in);
	static CourseDaoList theCoursesList = new CourseDaoList();
	
	public static CourseDaoList CreatNewCourse() {
		
		Course COR = new Course("C++", 6);
		theCoursesList.saveCourse(COR);
		COR = new Course("JAVA", 12);
		theCoursesList.saveCourse(COR);
		return theCoursesList;
		
	}
	public static CourseDaoList findById() {
		System.out.println("Enter the Course id:");
		int id = in.nextInt();
		theCoursesList.findById(id);
		return theCoursesList;
	}
	public static CourseDaoList findByName() {
		System.out.println("Enter the course Name:");
		String name = in.nextLine();
		theCoursesList.findByName(name);
		return theCoursesList;
		
	}
	List<Course> findAll(){
		return theCoursesList.findAll();	
	}
	
	public static CourseDaoList removeCourse() {
		System.out.println("by id please enter the Course id ");
		int id = in.nextInt();
		theCoursesList.ToPrintCourse(theCoursesList.findById(id));
		Course course = theCoursesList.findById(id);
		theCoursesList.removeCourse(course);
		return theCoursesList;

	}
}
