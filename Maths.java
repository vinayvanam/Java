package Facebook;

import java.util.Scanner;

public class Maths {

	
	
/*Math Magic results 13837*age*73= 262626
 * 
	age =26 */
	public static void main(String[] args) {
		int a =13837;
		int b =73;
		int Results;
		Scanner d = new Scanner (System.in);
		System.out.println("Enter your age:");
		int age = d.nextInt();
		Results =a*age*b;
		System.out.println("Maths Magic:"+Results);
		
	
	}

}
