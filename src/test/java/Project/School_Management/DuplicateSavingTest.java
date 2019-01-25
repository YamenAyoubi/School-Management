package Project.School_Management;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DataAccess.StudentDaoList;
import Models.Student;
import Services.StudentDaoList_Control;



public class DuplicateSavingTest {
	

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
		
		@Test(expected = IllegalArgumentException.class)
		public void test_save_duplicate_throw_IllegalArgumentException() {
			underTest.saveStudent(TestStudent);		
		}
				
}
