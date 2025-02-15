package com.Recursion;

public class RangeFib {

	public static void main(String[] args) {
		fibb(0,1,1,10);
	}
	
	public static void fibb(int a,int b,int count,int n)
	{
		if(count>n) return;
		System.out.println(a);
		fibb(b,a+b,++count,n);
	}

}
