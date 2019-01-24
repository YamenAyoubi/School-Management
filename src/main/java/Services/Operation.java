package Services;

import java.util.Scanner;

import Models.Student;

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

			case 11:
				System.out.println("You Can Add Here");
				SchoolManagement.createStudentListDaoList();
				break;
				
			case 22:
				System.out.println("You Can Search Here");
			SchoolManagement.findStudent();
				break;
			case 33:
				System.out.println("You Can Delete Here");
				
				break;

			case 2:
				System.out.println("Welcome to Course Section" + "\n44-Add New Course" + "\n55-Search" + "\n66-Delete");
				Selections = in.nextInt();
			case 44:
				System.out.println("You Can Add Here");
				SchoolManagement.createCourseListDaoList();
				break;
			case 55:
				System.out.println("You Can Search Here");
				
				break;
			case 66:
				System.out.println("You Can Delete Here");
				break;

			case 3:
				System.out.println("Mogamed & Yamen");
				break;
			}
		}

	}
}
