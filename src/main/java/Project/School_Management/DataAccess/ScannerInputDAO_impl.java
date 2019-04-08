package Project.School_Management.DataAccess;

import java.util.Scanner;

public class ScannerInputDAO_impl implements ScannerInputDAO{

	 Scanner in;

	@Override
	public String getString() {
		
		return in.next();
	}

	@Override
	public int getInt() {
		
		return in.nextInt();
	}
	
	 
	
}
