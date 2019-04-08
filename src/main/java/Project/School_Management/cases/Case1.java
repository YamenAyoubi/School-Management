package Project.School_Management.cases;

import Project.School_Management.Services.StudentDaoList_Control;
import Project.School_Management.Utilites.DoYouWannaDoMore;
import Project.School_Management.Utilites.InputValidNumberAsTheList;

public class Case1 {
	
	public static void caseOneActions () {
				
		System.out.println("Welcome to Student Section" + "\n10-|| Add New Student ||"
				+ "\n11-||     Search      ||" + "\n12-||     Delete      ||" +
				  "\n13-||     Show All    ||" +"\n14-||    ADD Course    ||");
		
		int selections = InputValidNumberAsTheList.inputNumber(10, 14);
		
		boolean running = true;
		
		while (running) {
			
		if (selections == 10) {
			System.out.println("You Can Add Here");
			StudentDaoList_Control.createStudentListDaoList();
			break;
		}
		if (selections == 11) {
			System.out.println("Please Select" + "\n111-||  By Name  ||" + "\n112-||  By Id    ||"
					+ "\n113-||  By Email ||");
			selections = InputValidNumberAsTheList.inputNumber(111, 113);

			if (selections == 111) {
				StudentDaoList_Control.findByName();
				break;
			}

			if (selections == 112) {
				StudentDaoList_Control.findById();
				break;
			}

			if (selections == 113) {
				StudentDaoList_Control.findByEmail();
				break;
			}

			break;
		}
		if (selections == 12) {
			System.out.println("You Can Delete Here");
			StudentDaoList_Control.DeleteStudent();
			break;
		}
		if (selections == 13) {
			System.out.println("Student List");
			StudentDaoList_Control.ShowAll();
			break;
		}
		
		if (selections == 14) {
			System.out.println("Select and add");
			StudentDaoList_Control.AddToCourse();
			break;}
		
		System.out.println("Do You Want Open The System Again ? (Y/N)");
		String answer = DoYouWannaDoMore.GetPlaySystemAgainAnswer().toUpperCase();
		running = DoYouWannaDoMore.PlaySystemAgain(answer);
	}
	}
}