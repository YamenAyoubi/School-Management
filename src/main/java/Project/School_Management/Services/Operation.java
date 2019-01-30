package Project.School_Management.Services;

import Project.School_Management.Utilites.DoYouWannaDoMore;
import Project.School_Management.Utilites.InputValidNumberAsTheList;

public class Operation {

	static boolean Running = true;

	public static void Go() {

		while (Running) {
			System.out.println("====================================" );
			System.out.println("||Welcome To our School Management||" );
			System.out.println("====================================" );
			System.out.println("\nPlease Select" + "\n1-|| Student ||"
					+ "\n2-|| Courses ||" + "\n3-||  info   ||");

			int Selections = InputValidNumberAsTheList.inputNumber(1, 3);

			switch (Selections) {

			case 1:

				System.out.println("Welcome to Student Section" + "\n10-|| Add New Student ||"
						+ "\n11-||     Search      ||" + "\n12-||     Delete      ||" +
						  "\n13-||     Show All    ||" +"\n14-||    ADD Course    ||");
				Selections = InputValidNumberAsTheList.inputNumber(10, 14);

				if (Selections == 10) {
					System.out.println("You Can Add Here");
					StudentDaoList_Control.createStudentListDaoList();
					break;
				}
				if (Selections == 11) {
					System.out.println("Please Select" + "\n111-||  By Name  ||" + "\n112-||  By Id    ||"
							+ "\n113-||  By Email ||");
					Selections = InputValidNumberAsTheList.inputNumber(111, 113);

					if (Selections == 111) {
						StudentDaoList_Control.findByName();
						break;
					}

					if (Selections == 112) {
						StudentDaoList_Control.findById();
						break;
					}

					if (Selections == 113) {
						StudentDaoList_Control.findByEmail();
						break;
					}

					break;
				}
				if (Selections == 12) {
					System.out.println("You Can Delete Here");
					StudentDaoList_Control.DeleteStudent();
					break;
				}
				if (Selections == 13) {
					System.out.println("Student List");
					StudentDaoList_Control.ShowAll();
					break;
				}
				
				if (Selections == 14) {
					System.out.println("Select and add");
					StudentDaoList_Control.AddToCourse();
					break;}
					
			case 2:
				System.out.println("Welcome to Course Section" + "\n20-|| Add New Course ||"
						+ "\n21-||     Search     ||" + "\n22-||     Delete     ||"
						+ "\n23-||     Find All   ||");
				Selections = InputValidNumberAsTheList.inputNumber(20, 23);

				if (Selections == 20) {
					System.out.println("You Can Add Here");
					CoursDaoList_Control.CreatNewCourse();
					break;
				}

				if (Selections == 21) {
					System.out.println("Please Select" + "\n211-||  By Name  ||" + "\n212-||  By Id    ||");
					Selections = InputValidNumberAsTheList.inputNumber(211, 212);

					if (Selections == 211) {
						CoursDaoList_Control.findByName();
						break;
					}

					if (Selections == 212) {
						CoursDaoList_Control.findById();
						break;
					}						
					break;
				}

				if (Selections == 22) {
					System.out.println("You Can Delete Here");
					CoursDaoList_Control.removeCourse();
					break;}
					
				if (Selections == 23) {
						CoursDaoList_Control.findAll();
						break;}


			case 3:
				System.out.println("===========================" );
				System.out.println("Designed By Mogamed & Yamen");
				System.out.println("==========Thanks===========");
				System.out.println("===========================" );
				Running = false;
				break;

			default:
				System.out.println("Worng Entry PLs check the Options");
			}

			System.out.println("Do You Want Open The System Again ? (Y/N)");
			String answer = DoYouWannaDoMore.GetPlaySystemAgainAnswer().toUpperCase();
			Running = DoYouWannaDoMore.PlaySystemAgain(answer);
		}
	}
}