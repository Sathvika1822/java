package com.Recursion;

public class Prime {

	public static void main(String[] args) {
		int n=11;
		if(isPrime(n,n/2))
		{
			System.out.println(n+" is Prime");
		}
		else
		{
			System.out.println(n+" is Not Prime");
		}
	}
	
	public static boolean isPrime(int n, int i)
	{
		if(i==1) return true;
		if(n<=1||n%i==0) return false;
		return isPrime(n,i-1);
	}

}
