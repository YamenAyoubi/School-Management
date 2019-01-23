package Models;

import java.time.LocalDate;

public class Course extends Student{
	
	private int Sequence =100000;
	private int ID;
	private  String CourseName;
	private  LocalDate LocalDate;
	private  String StartDate;
	private  int WeekDuration;
	
	




	public Course(String name, String email, String address, int iD, String courseName, int weekDuration) {
		super(name, email, address);
		ID = iD;
		CourseName = courseName;
		WeekDuration = weekDuration;
	}

	public void AddStudentToCourse(Student student) {

		
	}
	
	
	public void RemoveStudentFromCourse(Student student) {
		
		
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = Sequence ++;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public int getWeekDuration() {
		return WeekDuration;
	}

	public void setWeekDuration(int weekDuration) {
		WeekDuration = weekDuration;
	}
	
	public LocalDate getLocalDate() {
		return LocalDate;
	}


	public void setLocalDate(LocalDate localDate) {
		LocalDate = localDate;
	}
	
	
	public void ToPrint() {
		return;

	}
	
}
