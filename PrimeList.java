package com.training.assignments;

class Primes{
	
	private int startNum;
	private int endNum;
	
	Primes(int startNum, int endNum){
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	public boolean isPrime(int num){
		boolean flag = true;
		
		int i, count=0;
		for(i=2; i<num; i++){
			if(num%i == 0){
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
	public void printPrimes(){
		System.out.println("The list of primes between "+this.startNum+ " and "+this.endNum);
		for(int i=this.startNum; i<=this.endNum; i++){
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}
}

public class PrimeList {

	public static void main(String args[]){
		
		Primes p = new Primes(100, 200);
		p.printPrimes();
		
	}
}
