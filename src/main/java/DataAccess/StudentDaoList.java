package DataAccess;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Models.Student;

public class StudentDaoList implements StudentDAO {

	List<Student> StudentList = new ArrayList<Student>();

	@Override
	public Student saveStudent(Student student) throws IllegalArgumentException {
		if (student == null) {
			throw new IllegalArgumentException();

		} else {
			StudentList.add(student);
			return student;
		}
	}

	@Override
	public Student findByEmail(String email) {

		for (Student STD : StudentList) {
			if (STD.getEmail() == email) {
				return STD;
			}
		}
		return null;
	}

	@Override
	public List<Student> findByName(String name) {
		List<Student> result = new ArrayList<>();
		for (Student STD : StudentList) {
			if (STD.getName().equalsIgnoreCase(name)) {
				result.add(STD);
			}
		}
		return result;
	}

	public Student findById(int id) {

		for (Student STD : StudentList) {
			if (STD.getID() == id) {
				return STD;
			}
		}
		return null;
	}

	@Override
	public List<Student> findAll() {	
		return StudentList.subList(0, 200000);

	}

	@Override
	public boolean deleteStudent(Student student) {
		for (Student STD : StudentList) {
			return StudentList.remove(STD);
		}
		return false;
	}
	@Override
	public void ToPrintNewStudent(Student student) {
		for (Student Newstudent : StudentList) {
			System.out.println(Newstudent);
		}
	}
}
