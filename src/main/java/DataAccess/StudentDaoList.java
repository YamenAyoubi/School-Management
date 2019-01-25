package DataAccess;

import java.util.*;
import java.util.List;


import Models.Student;

public class StudentDaoList implements StudentDAO {

	private static List<Student> StudentList = new ArrayList<Student>();

	@Override
	public Student saveStudent(Student STD) throws IllegalArgumentException {
		if (STD == null) {
			throw new IllegalArgumentException();
		} else {
			StudentList.add(STD);
			return STD;
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
		return StudentList;
	}

	@Override
	public boolean deleteStudent(Student student) {
		for (Student STD : StudentList) {
			System.out.println("Stident Has Been Removed");
			return StudentList.remove(STD);
		}
		return false;
	}

	@Override
	public void ToPrintNewStudent(Student student) {
		for (Student STD : StudentList) {
			System.out.println(STD);
		}
	}
}