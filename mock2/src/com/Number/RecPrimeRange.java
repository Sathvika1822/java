package com.Number;

public class RecPrimeRange {

	public static void main(String[] args) {
		range(10,20);
	}
	static int count=0;
	public static void range(int st,int end)
	{
		
		if(st>end) return;
		if(isPrime(st,st/2))
		{
			count++;
			if(count==2) {
			System.out.println(st);
			}
		}
		range(st+1,end);
	}

	private static boolean isPrime(int n, int i) {
		if(i==1)return true;
		if(n<=1||n%i==0)return false;
		return isPrime(n,i-1);
	}

}
