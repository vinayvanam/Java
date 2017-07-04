package Facebook;

import java.util.Scanner;

public class Practice {

	private static Scanner f;

	public static void main(String[] args) {
		int i;
		System.out.println("Enter number:");
		
		f = new Scanner(System.in);
				i = f.nextInt();
	if(i % 2==0)
		System.out.println(i+ "Even number ");
		else
			System.out.println(i+ " Odd number ");
		
	
		
	}

}
