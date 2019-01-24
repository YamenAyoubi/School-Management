package Models;



public class Course {
	
	private int Sequence =100000;
	private int CourseID;
	private  String CourseName;
	private  int WeekDuration;
	


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

	public int getID() {
		return CourseID;
	}

	public void setID(int CourseID) {
		CourseID = Sequence ++;
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
		return;

	}
	
}
