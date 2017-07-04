package Facebook;

import java.util.Scanner;

public class Addition {

	private static Scanner s;
	public static void main(String[] args) {
		 s = new Scanner(System.in);
		System.out.print("Enter a value a:");
		int a = s.nextInt();
		System.out.print("Enter a value b:");
		int b = s.nextInt();
		int sum =a+b;
		int sub =a*b;
		float div =a/b;
		System.out.println("Total of sum:"+sum);
		System.out.println("Total of sub:"+sub);
		System.out.println("Total of div:"+div);
		
	}
	
}
