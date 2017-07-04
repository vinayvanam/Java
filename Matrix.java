
/*
 * Enter matrix
 * 2*2 and 2*2 or more
 * 
 * 1 2 
 * 3 4 
 * 
 * 5 6
 * 7 8
 *  
 * Result some kind
 * 
 * 19 22
 * 43 50 
 * 
 * */

package Solution;

import java.util.Scanner;

public class Matrix {
	private static Scanner input;
	public static void main(String[] args) {
		int n;
		input = new Scanner (System.in);
		System.out.println("Enter Matrix Base:");
		n = input.nextInt();
		int a[][]= new int[n][n];
		int b[][]= new int[n][n];
		int c[][]= new int[n][n];
			
	System.out.println("Enter First Matrix Number");
	for(int i=0;i<n;i++){
		for (int j=0;j<n;j++){
			
			a[i][j] = input.nextInt();
		}
		
		}
	System.out.println("Enter Second  Matrix Number");
	for(int i=0;i<n;i++){
		for (int j=0;j<n;j++){
			
			b[i][j] = input.nextInt();
		}
		
		}
	System.out.println("Enter Multiplication Matrix Number");
	for(int i=0;i<n;i++){
		for (int j=0;j<n;j++){
			for (int k=0;k<n;k++){
			
			c[i][j] = c[i][j]+a[i][k]*b[k][j];
		}
		
		}
	}
    System.out.println("The product is:");

    for (int i = 0; i < n; i++)

    {

        for (int j = 0; j < n; j++)

        {

            System.out.print(c[i][j] + " ");

        }

        System.out.println();

    }

    input.close();
	
	}


}
