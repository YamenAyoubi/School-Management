package Project.School_Management.Services;

import Project.School_Management.Utilites.DoYouWannaDoMore;
import Project.School_Management.Utilites.InputValidNumberAsTheList;

public class Case2 {
	
	public static void caseTwoActions () {
		
		System.out.println("Welcome to Course Section" + "\n20-|| Add New Course ||"
				+ "\n21-||     Search     ||" + "\n22-||     Delete     ||"
				+ "\n23-||     Find All   ||");
		int selections = InputValidNumberAsTheList.inputNumber(20, 23);
		
		boolean running = true;
		
		while (running) {
			
		if (selections == 20) {
			System.out.println("You Can Add Here");
			CoursDaoList_Control.CreatNewCourse();
			break;
		}

		if (selections == 21) {
			System.out.println("Please Select" + "\n211-||  By Name  ||" + "\n212-||  By Id    ||");
			selections = InputValidNumberAsTheList.inputNumber(211, 212);

			if (selections == 211) {
				CoursDaoList_Control.findByName();
				break;
			}

			if (selections == 212) {
				CoursDaoList_Control.findById();
				break;
			}						
			break;
		}

		if (selections == 22) {
			System.out.println("You Can Delete Here");
			CoursDaoList_Control.removeCourse();
			break;}
			
		if (selections == 23) {
				CoursDaoList_Control.findAll();
				break;}
		
		System.out.println("Do You Want Open The System Again ? (Y/N)");
		String answer = DoYouWannaDoMore.GetPlaySystemAgainAnswer().toUpperCase();
		running = DoYouWannaDoMore.PlaySystemAgain(answer);
	}
	}
}