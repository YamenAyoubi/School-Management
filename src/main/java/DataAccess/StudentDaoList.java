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

		for (Student STD : StudentList) {
			if (STD.getEmail() == email) {
				return STD;
			}
		}
		return null;
	}

	@Override
	public Student findByName(String name) {
		for (Student STD : StudentList) {
			if (STD.getName() == name) {
				return STD;
			}
		}
		return null;
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
			return StudentList;

	}

	@Override
	public boolean deleteStudent(Student student) {
		for (Student STD : StudentList) {
				return StudentList.remove(STD);
			}
		return false;
		}

}
