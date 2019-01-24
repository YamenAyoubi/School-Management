package DataAccess;

import java.util.List;

import Models.Student;

public interface StudentDAO {
	
	Student saveStudent(Student student);
	
	Student findByEmail(String email);
	
	List<Student> findByName(String name);
	
	Student findById(int id);
	
	List<Student> findAll();

	boolean deleteStudent(Student student);

	void ToPrintNewStudent(Student student);
}
