package Project.School_Management.Models;

public class Student {

	private static int Sequence = 0;
	private final int ID;
	private String Name;
	private String Email;
	private String Address;
	private String Course;

	@Override
	public String toString() {

		return "Student [ID=" + ID + ", Name=" + Name + ", Email=" + Email + ", Address=" + Address + ", Course="
				+ Course + "]";
	}

	public Student(String name, String email, String address, String course) {
		super();
		this.ID = ++Sequence;
		this.Name = name;
		this.Email = email;
		this.Address = address;
		this.Course = course;
	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public void ToPrint() {

		System.out.println(this.getID() + " " + this.Name + " " + this.Email + " " + this.Address);

	}
}
