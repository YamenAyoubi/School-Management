package Project.School_Management;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import DataAccess.StudentDaoList;
import Models.Student;
import Services.Operation;
import Services.SchoolManagement;

public class App {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(
				"Welcome To our School Management" + "\nPlease Select" + "\n1-Student" + "\n2-Courses" + "\n3-info");

		while (true) {
			Operation.Go();
		}
	}
}
