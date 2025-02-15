package com.Number;

public class RecPrime {
	public static void main(String[] args) {
	int n=21;
	if(isPrime(n,n/2))
	{
		System.out.println("prime");
	}
	else
	{
		System.out.println("Not Prime");
	}
  }
	public static boolean isPrime(int n,int i)
	{
		if(i==1)return true;
		if(n<=1||n%i==0)return false;
		return isPrime(n,i-1);
	}
}
