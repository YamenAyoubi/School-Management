package Project.School_Management;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DataAccess.StudentDaoList;
import Models.Student;
import Utilities.StudentDaoList_Control;



public class PersonDaoImplTest {
	

	//This is what we are going to test
		private StudentDaoList underTest = new StudentDaoList();
		
		//Is used in findById test
		private Student TestStudent;
		private int TestStudentid;
		
		//Runs BEFORE each test
		@Before
		public void init() {
			TestStudent = new Student("name", "email", "address", "course");	
			underTest.saveStudent(TestStudent);
			TestStudentid = TestStudent.getID();
			underTest.saveStudent(new Student("Test", "Testsson2", "sada","dsaddas"));
		}
		
		//Runs AFTER each test
		@After
		public void tearDown() {
			StudentDaoList_Control.DeleteStudent();
		}
		
		@Test
		public void test_save_on_new_person() {
			Student expected = new Student("Test", "Testquist", "sdasa" , "sadsa");
			assertEquals(expected, underTest.saveStudent(expected));
		}
		
		@Test(expected = IllegalArgumentException.class)
		public void test_save_duplicate_throw_IllegalArgumentException() {
			underTest.saveStudent(TestStudent);		
		}
		
		@Test
		public void test_findById_return_testPerson() {
			assertEquals(TestStudent, underTest.findById(TestStudentid));
		}
		
		@Test
		public void test_findByFirstName() {
			String param = "Test";
			
			List<Student> result = underTest.findByName(param);
			for(Student p : result) {
				assertEquals(param, p.getName());
			}
		}
		
		@Test
		public void test_findByFirstName_with_lambda() {
			String param = "Test";
			
			List<Student> result = underTest.findByName(param);
			
			assertTrue(result.stream()
					.allMatch(TestStudent -> TestStudent.getName().equals(param)));
		}
}
