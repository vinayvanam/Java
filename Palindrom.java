package Facebook;

import java.util.Scanner;

public class Palindrom {
	
	private static Scanner h;
	
	public static void main(String arg[]){
		
		  int r,sum=0,temp; 
		
		  //It is the number variable to be checked for palindrome  
		  h = new Scanner (System.in);
		  System.out.println("Enter number");
		  int n =h.nextInt(); 
		  temp=n;  
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;
	}
	if(temp==sum)
		System.out.println("palindrom number ");
		else
			System.out.println("Not palindrom number");
	
}
}