package Facebook;

import java.util.Scanner;

public class Signup {

	public static void main(String[] args) {
		String Firstname;
		String lastname;
		int phno;
		int dob;
		
		Scanner b = new Scanner(System.in);
		System.out.println("Firstname");
		Firstname=b.next();
		System.out.println("lirstname");
		lastname=b.next();
		System.out.println("phno");
		phno=b.nextInt();
		System.out.println("dob");
		dob=b.nextInt();
		System.out.println("signup is successfully");
	    Login.main(null);
	    
		

	}
}
