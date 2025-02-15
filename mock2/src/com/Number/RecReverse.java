package com.Number;

public class RecReverse {

	public static void main(String[] args) {
		int n=1234;
		System.out.println(isRev(n,0));
	}
	
	public static int isRev(int n,int rev)
	{
		if(n==0)return rev;
		rev=(rev*10)+n%10;
		return isRev(n/10,rev);
	}
}
