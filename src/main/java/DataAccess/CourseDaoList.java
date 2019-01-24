package DataAccess;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Models.Course;
import Models.Student;

public class CourseDaoList implements CourseDAO{
	
	static Scanner in = new Scanner (System.in);
	
	List<Course> CoursesList = new ArrayList<>();

	public Course saveCourse(Course course) {
		
		return null;
	}

	@Override
	public Course findById(int id) {
		for (Course COR : CoursesList) {
			if (COR.getID() == id) {
				return COR;}}
		
		return null;
	}

	@Override
	public Course findByName(String name) {
		for (Course COR : CoursesList) {
			if (COR.getCourseName() == name) {
				return COR;}}
		
		return null;
	}

	@Override
	public List<Course> findAll() {
				return CoursesList;
				}

	@Override
	public boolean removeCourse(Course course) {
		for (Course COR : CoursesList) {
			return CoursesList.remove(COR);
		}
	return false;
	}

	@Override
	public List<Course> findByDate(LocalDate date) {

		return CoursesList;
	}

}

