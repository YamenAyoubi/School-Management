package Models;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private int Sequence =0;
	private int CourseID;
	private  String CourseName;
	private  int WeekDuration;
	static List<Course> CoursesList = new ArrayList<>();


	public Course(String courseName,int weekDuration) {
		super();
		this.CourseID = Sequence++;
		this.CourseName = courseName;
		this.WeekDuration = weekDuration;
		
	}

	public void AddStudentToCourse(Student student) {

		
	}
	
	
	public void RemoveStudentFromCourse(Student student) {
		
		
	}

	public int getCourseID() {
		return CourseID;
	}

	public void setCourseID(int courseID) {
		CourseID = ++Sequence;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}



	public int getWeekDuration() {
		return WeekDuration;
	}

	public void setWeekDuration(int weekDuration) {
		WeekDuration = weekDuration;
	}
	
	public void ToPrint() {
		System.out.println(this.getCourseID()+" "+this.getCourseName()+" "+this.getWeekDuration());

	}
	
}
