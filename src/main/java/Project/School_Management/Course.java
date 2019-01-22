package Project.School_Management;

public class Course extends Student{
	
	private int Sequence =100000;
	private int ID;
	private static String CourseName;
	private static String LocalDate;
	private static String StartDate;
	private static int WeekDuration;
	
	public Course(int iD, String courseName, String localDate, String startDate, int weekDuration) {
		super(iD, Name, Email, Address);
		ID = Sequence ++;
		CourseName = courseName;
		LocalDate = localDate;
		StartDate = startDate;
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

	public String getLocalDate() {
		return LocalDate;
	}

	public void setLocalDate(String localDate) {
		LocalDate = localDate;
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
	
	public static void ToPrint() {
		
		System.out.println(Student.Name+CourseName);
		System.out.println();
	}
	
}
