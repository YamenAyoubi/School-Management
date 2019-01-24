package Services;

import java.time.LocalDate;
import java.util.*;

import DataAccess.CourseDaoList;
import DataAccess.StudentDaoList;
import Models.Course;
import Models.Student;

public class SchoolManagement {
	
	private StudentDaoList studentdaolist;
	private CourseDaoList coursedaolist;
	static Scanner in = new Scanner (System.in);
	
	public SchoolManagement() {
		super();
		this.studentdaolist = createStudentListDaoList();
		this.coursedaolist = createCourseListDaoList();
	}
	
	public CourseDaoList createCourseListDaoList() {
		CourseDaoList theList = new CourseDaoList();
		Course COR = new Course("Math", LocalDate.now(), 10);
		theList.saveCourse(COR);
		COR = new Course( "Swedish", LocalDate.now(), 10);
		theList.saveCourse(COR);
		System.out.println("Pls Add The Course Name");
		String Name = in.next();
		COR.setCourseName(Name);
		System.out.println("Course Name Has Been Added ");
		System.out.println("Pls Add The weekDuration");
		int WeekDuration = in.nextInt();
		COR.setWeekDuration(WeekDuration);
		System.out.println("weekDuration  Has Been Added ");
		COR.ToPrint();
		return theList;
	}
	public StudentDaoList createStudentListDaoList() {
		StudentDaoList theList = new StudentDaoList();
		Student STD = new Student("YAMEN", "YAMEN@G.COM", "NAYGATAN");
		theList.saveStudent(STD);
		STD = new Student("mogh", "mog@G.COM", "mog");
		theList.saveStudent(STD);
		System.out.println("Pls Add The Name");
		String Name = in.next();
		STD.setName(Name);
		System.out.println("Student Name Has Been Added ");
		System.out.println("Pls Add The Email");
		String Email = in.next();
		STD.setEmail(Email);
		System.out.println("Student Email Has Been Added ");
		System.out.println("Pls Add The Address");
		String Address = in.next();
		STD.setAddress(Address);
		System.out.println("Student Address Has Been Added ");
		STD.ToPrint();
		return theList;}
		

	
	public void findStudent() {
		int Selections=in.nextInt();
		switch (Selections) {
		case 1:
			System.out.println("Enter the student id:");
			int id = in.nextInt();
			studentdaolist.findById(id);
			break;
		case 2:
			System.out.println("Enter the student Name:");
			String name = in.nextLine();
			printStudent(studentdaolist.findByName(name));
			break;
		default:
			break;
		}
		
	}
	
	public void findCourse() {
		// TODO Auto-generated method stub
		
	}
	private void printStudent(Student theStudent) {
		System.out.println(theStudent);
		
	}
	private void printStudent(List<Student> theStudents) {
		for (Student student : theStudents) {
			System.out.println(student);
		}
	}
	
	private void printCourse(Course theCourse) {
		System.out.println(theCourse);
		
	}

	public static int Selections() {

		System.out.println("------------------");
		System.out.println("1 Find by id");
		System.out.println("2 Find by name");
		System.out.println("3 View all students");
		
		return 0;

	}

}
