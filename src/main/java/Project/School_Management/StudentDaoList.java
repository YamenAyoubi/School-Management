package Project.School_Management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDaoList implements StudentDAO {

	Scanner in = new Scanner (System.in);
	
	List<String>Student = new ArrayList<String>();
	
	@Override
	public Student saveStudent(Student student) {
    	
    	System.out.println("enter name");
    	student.setName(in.nextLine());
    	System.out.println("enter email");
    	student.setEmail(in.nextLine());
    	System.out.println("enter address");
    	student.setAddress(in.nextLine());
		return student;

	}

	@Override
	public Student findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
