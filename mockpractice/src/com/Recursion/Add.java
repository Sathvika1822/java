package com.Recursion;

public class Add {

	public static void main(String[] args) {
		int n=12;
		System.out.println(add(n));
	}
	
	public static int add(int n)
	{
		if(n<=9) return n;
		return (n%10)+add(n/10);
	}

}
