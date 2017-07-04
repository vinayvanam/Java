/*Sample Output
 * 
 * 45
 * 72
 * 144
 * 322
 * */



package Solution;

import java.util.Scanner;


public class Printnumber {
	private static Scanner p;
/*
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Enter values:");
		int a = p.nextInt();
		int b = p.nextInt();
		int c = p.nextInt();
		int d = p.nextInt();
		p.close();
		
		System.out.println("Output:"+a);
		System.out.println("Output:"+b);
		System.out.println("Output:"+c);
		System.out.println("Output:"+d);
		
	}	
*/
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		String a = p.next();
		Double b = p.nextDouble();
		int c =  p.nextInt();
		p.close();
		
		System.out.println("String:"+a);
		System.out.println("Double:"+b);
		System.out.println("int:"+c);
		
		
	
	}

}
