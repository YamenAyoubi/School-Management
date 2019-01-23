package DataAccess;

import java.util.*;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Models.Student;

public class StudentDaoList implements StudentDAO {



	private static List<Student> StudentList = new ArrayList<>();

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

		return null;
	}

	public List<Student> findByName(String name) {

		List<Student> result = new ArrayList<>();
		for (Student student : StudentList) {
			if (student.getName().equalsIgnoreCase(name)) {
				result.add(student);
			}
		}
		return result;
	}

	public Student findById(int id) {

		for (Student student : StudentList) {
			if (student.getID() == id) {
				return student;
			}
		}
		return null;
	}

	@Override
	public List<Student> findAll() {
		StudentList.containsAll(StudentList);
		return null;
	}

	@Override
	public boolean deleteStudent(Student student) {
		StudentList.clear();
		return false;
	}

}
