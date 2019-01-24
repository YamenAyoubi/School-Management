package Services;

import java.util.Scanner;

import DataAccess.CourseDaoList;
import Models.Student;
import Utilities.CoursDaoList_Control;
import Utilities.StudentDaoList_Control;

public class Operation {
	static Scanner in = new Scanner(System.in);
	static boolean Running = true;
	

	public static void Go() {

		int Selections = in.nextInt();

		while (Running) {

			switch (Selections) {

			case 1:

				System.out.println("Welcome to Student Section" + "\n11-Add New Student" + "\n22-Search" + "\n33-Delete");
				Selections = in.nextInt();
				break;
				
			case 2:
				System.out.println("Welcome to Course Section" + "\n44-Add New Course" + "\n55-Search" + "\n66-Delete");
				Selections = in.nextInt();
				break;
				
			case 3:
				System.out.println("Mogamed & Yamen");
				Running=false;
				break;

			case 11:
				System.out.println("You Can Add Here");
				StudentDaoList_Control.createStudentListDaoList();
				break;
				
			case 22:
				System.out.println("You Can Search Here");
				StudentDaoList_Control.findByName();
				StudentDaoList_Control.findById();
				break;
			case 33:
				System.out.println("You Can Delete Here");
				StudentDaoList_Control.DeleteStudent();
				break;

			
			case 44:
				System.out.println("You Can Add Here");
				CoursDaoList_Control.CreatNewCourse();
				break;
			case 55:
				System.out.println("You Can Search Here");
				CoursDaoList_Control.findByName();
				break;
			case 66:
				System.out.println("You Can Delete Here");
				CoursDaoList_Control.removeCourse();
				break;
				
				default:
					System.out.println("Wong Entry");
			}
		}
	}
}