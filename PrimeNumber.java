package Facebook;

import java.util.Scanner;

public class PrimeNumber {
	public static Scanner f;
	public static void main(String[] args) {
		f = new Scanner(System.in);
		System.out.println("Enter number:");
		int i = f.nextInt();
		//Logic for Prime list of Numbers 
		for(i=2;i<=100;i++){
			for(int j=2;j<=i;j++){
				if(j==i)
				{
					System.out.println(i);
				}
				if(i%j==0)
				{
					break;
				}
			}
		}
	}

}
