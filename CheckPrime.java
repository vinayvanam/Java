package com.training.assignments;

class Number{
	int num;
	
	
	Number(int num){
		this.num = num;
	}
	
	public int getNumber(){
		return this.num;
	}
	
	/*public boolean isPrime(){
		boolean flag = false;
		
		int i, count=0;
		for(i=1; i<=this.num; i++){
			if(this.num%i==0){
				count++;
			}
		}
		if(count==2){
			flag = true;
		}
		return flag;
	}*/
	
	public boolean isPrime(){
		boolean flag = true;
		
		int i, count=0;
		for(i=2; i<this.num; i++){
			if(this.num%i == 0){
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
}

public class CheckPrime {

	public static void main(String args[]){
		Number n1 = new Number(8);
		if(n1.isPrime()){
			System.out.println("The number:"+n1.getNumber()+" is prime");
		}else{
			System.out.println("The number:"+n1.getNumber()+" is composite");
		}
	}
}

