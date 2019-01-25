package Services;
import Utilities.CoursDaoList_Control;
import Utilities.DoYouWannaDoMore;
import Utilities.InputValidNumberAsTheList;
import Utilities.StudentDaoList_Control;

public class Operation {
	
	static boolean Running = true;

	public static void Go() {

		while (Running) {
			
			System.out.println("Welcome To our School Management" + 
								"\nPlease Select" + 
								"\n1-Student" + 
								"\n2-Courses" + 
								"\n3-info");
			
			int Selections = InputValidNumberAsTheList.inputNumber(1, 3);
			
			switch (Selections) {

			case 1:

				System.out.println("Welcome to Student Section" + "\n10-Add New Student" + "\n11-Search" + "\n12-Delete");
				Selections = InputValidNumberAsTheList.inputNumber(10, 12);
				
				if (Selections==10) {   
					System.out.println("You Can Add Here");
					StudentDaoList_Control.createStudentListDaoList();
					break;}
				if (Selections==11) {
					System.out.println("You Can Search Here");
					StudentDaoList_Control.findByName();
					StudentDaoList_Control.findById();
					StudentDaoList_Control.findByEmail();
					break;}
				if (Selections==12) {   
					System.out.println("You Can Delete Here");
					StudentDaoList_Control.DeleteStudent();
					break;}
				
			case 2:
				System.out.println("Welcome to Course Section" + "\n20-Add New Course" + "\n21-Search" + "\n22-Delete");
				Selections = InputValidNumberAsTheList.inputNumber(20, 22);
			 
				if (Selections==20) {
				System.out.println("You Can Add Here");
				CoursDaoList_Control.CreatNewCourse();
				break;}
				
				if (Selections==21) { 
				System.out.println("You Can Search Here");
				CoursDaoList_Control.findByName();
				break;}


				if (Selections==22) {
				System.out.println("You Can Delete Here");
				CoursDaoList_Control.removeCourse();
				break;}

			case 3:
				System.out.println("Mogamed & Yamen");
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
			