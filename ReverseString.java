package Facebook;

import java.util.Scanner;

public class ReverseString {

	 private static Scanner in;
	 public static void main(String[] args) {
		String original,reverse ="";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String to reverse:");
		original = in.nextLine();
		int len = original.length();
       //Logic for reverse string 
		for ( int i=len-1;i>=0;i--)
	         reverse = reverse + original.charAt(i);
	      System.out.println("Reserse string is :" +reverse);
		

	}

}
