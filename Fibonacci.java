package Facebook;

import java.util.Scanner;

//Fibonacci formula fn=fn-1+fn-2 values like F0=0;F1=1
public class Fibonacci {

   private static Scanner s;

public static void main(String[] args) {
       s = new Scanner(System.in);
       System.out.println("Enter the value of n: ");
       int n = s.nextInt();
       for (int i = 1; i <= n; i++) {
           System.out.println(fibonacci(i) + " ");
       }
   }

   public static int fibonacci(int n) {
       if (n == 0) {
           return 0;
       } else if (n == 1) {
           return 1;
       } else {
           return fibonacci(n - 1) + fibonacci(n - 2);
       }
   }
}
