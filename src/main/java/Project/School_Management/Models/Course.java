package Project.School_Management.Models;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private static int Sequence = 0;
	private final int CourseID;
	private String CourseName;
	private int WeekDuration;
	private List<Student> students = new ArrayList<>();

	public Course(String courseName, int weekDuration) {
		CourseID = Sequence++;
		CourseName = courseName;
		WeekDuration = weekDuration;
		setStudents(new ArrayList<>());
	}

	public void AddStudentToCourse(Student student) {

	}

	public void RemoveStudentFromCourse(Student student) {

	}

	public int getCourseID() {
		return CourseID;
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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void ToPrint() {
		System.out.println(CourseID + " " + this.getCourseName() + " " + this.getWeekDuration());

	}

	@Override
	public String toString() {
		return "Course [CourseID=" + CourseID + ", CourseName=" + CourseName + ", WeekDuration=" + WeekDuration
				+ ", students=" + students + "]";
	}
	
}
