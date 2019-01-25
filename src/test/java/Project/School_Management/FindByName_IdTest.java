package Project.School_Management;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DataAccess.StudentDaoList;
import Models.Student;

public class FindByName_IdTest {
	
	//This is what we are going to test
	private StudentDaoList underTest = new StudentDaoList();
	
	//Is used in findById test
	private Student TestStudent;
	private int TestStudentid;
	
	//Runs BEFORE each test
	@Before
	public void init() {
		TestStudent = new Student("yamen", "ya@g.com", "address", "course");	
		underTest.saveStudent(TestStudent);
		TestStudentid = TestStudent.getID();
		underTest.saveStudent(new Student("yamen2", "asdsad", "sada","dsaddas"));
	}
	
	
	@Test
	public void test_findById_return_testPerson() {
		assertEquals(TestStudent, underTest.findById(TestStudentid));
	}
	
	@Test
	public void test_findByName() {
		String param = "Test";
		
		List<Student> result = underTest.findByName(param);
		for(Student p : result) {
			assertEquals(param, p.getName());
		}
	}
	
	@Test
	public void test_findByName_with_lambda() {
		String param = "Test";
		
		List<Student> result = underTest.findByName(param);
		
		assertTrue(result.stream().allMatch(TestStudent -> TestStudent.getName().equals(param)));
	}

}
