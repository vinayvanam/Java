package Facebook;

import java.util.Scanner;

public class EvenandOdd {

	private static Scanner s;
	public static void main(String[] args) {
		
		s = new Scanner(System.in);
		System.out.println("Enter number:");
		int a = s.nextInt();
		
	if (a % 2 == 0)
		System.out.println("Even number:"+a);
	else
		System.out.println(" Odd number:"+a);
	
	 
	
		
	}

}
