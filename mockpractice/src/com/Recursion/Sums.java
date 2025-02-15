package com.Recursion;

public class Sums {

	public static void main(String[] args) {
		int n=5326;
		int sum=sums(n,0);
		System.out.println(sum);
	}
	
	public static int sums(int n,int sum)
	{
		if(n==0) return sum;
		return n%10+sums(n/10,sum);
	}

}
