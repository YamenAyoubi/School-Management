package DataAccess;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Models.Course;
import Models.Student;


public class CourseDaoList implements CourseDAO{
	
	static Scanner in = new Scanner (System.in);
	
	static List<Course> CoursesList = new ArrayList<>();

	
	public Course saveCourse(Course course) {
		if (course == null) {
			throw new IllegalArgumentException();

		} else {
			CoursesList.add(course);
			System.out.println(CoursesList.subList(0, 200000));
			return course;
		}
	}

	@Override
	public Course findById(int id) {
		for (Course COR : CoursesList) {
			if (COR.getID() == id) {
				return COR;}
			}
		return null;
	}

	@Override
	public Course findByName(String name) {
		for (Course COR : CoursesList) {
			if (COR.getCourseName() == name) {
				return COR;}
			}
		return null;
	}

	@Override
	public List<Course> findAll() {
				return CoursesList.subList(0, 200000000);
				}

	@Override
	public boolean removeCourse(Course course) {
		for (Course COR : CoursesList) {
			return CoursesList.remove(COR);
		}
	return false;
	}
	
	@Override
	public void ToPrintCourse(Course course) {
		for (Course COR : CoursesList) {
			System.out.println(COR);
		}
	}
}
