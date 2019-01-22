package Project.School_Management;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseDaoList implements CourseDAO{
	
	static Scanner in = new Scanner (System.in);
	
	List<String>Course = new ArrayList<String>();

	
	public Course saveCourse(Course course) {
		
    	System.out.println("enter Course name");
    	course.setName(in.nextLine());
    	System.out.println("enter email");
    	course.setStartDate(in.nextLine());
    	System.out.println("enter address");
    	course.setWeekDuration(in.nextInt());
		return null;
	}

	@Override
	public Course findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> findByDate(LocalDate date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeCourse(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

}
