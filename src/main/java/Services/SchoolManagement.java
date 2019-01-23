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
	
	private CourseDaoList createCourseListDaoList() {
		CourseDaoList theList = new CourseDaoList();
		Course C = new Course("Math", LocalDate.now(), 10);
		theList.saveCourse(C);
		C = new Course( "Swedish", LocalDate.now(), 10);
		theList.saveCourse(C);
		System.out.println("Pls Add The Course Name");
		String Name = in.next();
		C.setCourseName(Name);
		System.out.println("Course Name Has Been Added ");
		System.out.println("Pls Add The weekDuration");
		int WeekDuration = in.nextInt();
		C.setWeekDuration(WeekDuration);
		System.out.println("weekDuration  Has Been Added ");
		C.ToPrint();
		return theList;
	}
	public StudentDaoList createStudentListDaoList() {
		StudentDaoList theList = new StudentDaoList();
		Student S = new Student("YAMEN", "YAMEN@G.COM", "NAYGATAN");
		theList.saveStudent(S);
		S = new Student("mogh", "mog@G.COM", "mog");
		theList.saveStudent(S);
		System.out.println("Pls Add The Name");
		String Name = in.next();
		S.setName(Name);
		System.out.println("Student Name Has Been Added ");
		System.out.println("Pls Add The Email");
		String Email = in.next();
		S.setEmail(Email);
		System.out.println("Student Email Has Been Added ");
		System.out.println("Pls Add The Address");
		String Address = in.next();
		S.setAddress(Address);
		System.out.println("Student Address Has Been Added ");
		S.ToPrint();
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
