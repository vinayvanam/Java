package Facebook;

import java.util.Scanner;

public class ArmstrongNumber {
     public static Scanner f;
	public static void main(String[] args) {
	
		f = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = f.nextInt();
		int temp =n;
		int r,sum=0;
		
	while(n>0){
		r =n%10;
		n=n/10;
		sum= sum +r*r*r;
}
	if(temp == sum)
		System.out.println("Given number is Armstrong number");
	else
		System.out.println("Not a armstrong number");
	}

	}