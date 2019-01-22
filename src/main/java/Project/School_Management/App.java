package Project.School_Management;

import java.util.Collections;
import java.util.Scanner;

public class App 
{
	
	static Scanner in = new Scanner (System.in);
	
    public static void main( String[] args ){

    	System.out.println("enter name");
    	Student.setName(in.nextLine());
    	System.out.println("enter email");
    	Student.setEmail(in.nextLine());
    	System.out.println("enter address");
    	Student.setAddress(in.nextLine());

    	
//    	Course course1 = new Course(0, null, null, null, 0);
//    	
//    	Course.ToPrint();
    	
    }
}
