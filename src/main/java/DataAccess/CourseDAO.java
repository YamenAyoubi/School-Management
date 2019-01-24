package DataAccess;

import java.util.List;

import Models.Course;

public interface CourseDAO {
	
	Course saveCourse(Course course);
	Course findById(int id);
	Course findByName(String name);
	List<Course> findAll();
	boolean removeCourse(Course course);
	void ToPrintCourse(Course course);
}