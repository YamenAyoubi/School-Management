package Models;

public class Student {

	int Sequence = 1000;
	public  int ID;
	public  String Name;
	public  String Email;
	public  String Address;

	public Student( String name, String email, String address) {
		super();
		ID = Sequence++;
		Name = name;
		Email = email;
		Address = address;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = Sequence++;
	}

	public String getName() {
		return Name;
	}

	public  void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public  void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public  void setAddress(String address) {
		Address = address;
	}

	public void ToPrint() {
		
		System.out.println(this.ID +" "+this.Name +" "+ this.Email+" " +this.Address);
		
	}
}

