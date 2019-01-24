package Project.School_Management;

import java.util.Scanner;
import Services.Operation;


public class App {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"Welcome To our School Management" + "\nPlease Select" + "\n1-Student" + "\n2-Courses" + "\n3-info");

			Operation.Go();
		}
	}
