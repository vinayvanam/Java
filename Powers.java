package Facebook;

import java.util.Scanner;

public class Powers {
	
	private static Scanner f;

	public static void main(String[] args) {
		int c;
		f = new Scanner(System.in);
		System.out.println("Enter number");
		int i = f.nextInt();
		//Given number is power of number
		if(i<100){
			
			c=i*i;
			
			System.out.println("value is:" +c);
			
		}
		
		
		
	}

}
