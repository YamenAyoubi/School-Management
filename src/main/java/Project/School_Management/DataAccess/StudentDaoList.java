package Project.School_Management.DataAccess;

import java.util.*;
import java.util.stream.Collectors;
import Project.School_Management.Models.Student;


public class StudentDaoList implements StudentDAO {

	private static List<Student> StudentList = new ArrayList<Student>();
	static StudentDaoList theStudentList = new StudentDaoList();
	Set<Student>set = StudentList.stream()
			.collect(Collectors.toSet());

	@Override
	public Student saveStudent(Student std) throws IllegalArgumentException {
		if (std == null) {
			throw new IllegalArgumentException();
		} else {
			StudentList.add(std);
			return std;
		}
	}

	@Override
	public Student findByEmail(String email) {
		for (Student std : StudentList) {
			if (std.getEmail().equals(email)) {
				return std;
			}
		}
		return null;
	}

	@Override
	public List<Student> findByName(String name) {
		List<Student> result = new ArrayList<>();
		for (Student std : StudentList) {
			if (std.getName().equalsIgnoreCase(name)) {
				result.add(std);
			}
		}
		return result;
	}

	public Student findById(int id) {
		for (Student std : StudentList) {
			if (std.getID() == id) {
				return std;
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
		for (Student std : StudentList) {
			System.out.println("Student Has Been Removed");
			return StudentList.remove(std);
		}
		return false;
	}

	@Override
	public Student addToCourse(String name) {
		
		return null;
	}

}