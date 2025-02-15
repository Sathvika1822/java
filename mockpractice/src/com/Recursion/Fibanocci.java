package com.Recursion;

public class Fibanocci {

	public static void main(String[] args) {
		fib(0,1,500);
	}
	
	public static void fib(int a,int b,int n)
	{
		if(a>n) return;
		System.out.println(a);
		fib(b,a+b,n);
	}

}
