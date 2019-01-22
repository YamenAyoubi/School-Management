package Project.School_Management;

public class Student {
	
	int Sequence=1000;
	public static int ID;
	public static String Name;
	public static String Email;
	public static String Address;
	
	
	public Student(int iD, String name, String email, String address) {
		super();
		ID = Sequence ++;
		Name = name;
		Email = email;
		Address = address;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = Sequence ++;
	}

	public String getName() {
		return Name;
	}

	public static void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public static void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public static void setAddress(String address) {
		Address = address;
	}

	
}
