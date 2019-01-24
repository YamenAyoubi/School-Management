package DataAccess;

import java.time.LocalDate;
import java.util.List;

import Models.Course;

public interface CourseDAO {
	
	Course saveCourse(Course course);
	Course findById(int id);
	Course findByName(String name);
	List<Course> findByDate(LocalDate date);
	List<Course> findAll();
	boolean removeCourse(Course course);
}