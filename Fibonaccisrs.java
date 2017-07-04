package Facebook;


public class Fibonaccisrs {


	public static void main(String[] args) {
		int a=0,b=1,c;
		int reminder = 0, reverse=0;
		System.out.println(a);
		System.out.println(b);
		c=a+b;
		System.out.println(c);
		while(c<90)
		{
		a=b;
		b=c;
		c=a+b;
		System.out.println(c);
		}
		/*System.out.println("origanl no "+c);
		while(c>0){
			reminder = c%10;
			reverse=(reverse*10)+reminder;
			c=c/10;
			System.out.println("reverseno"+reverse);
		}*/
	}

}
