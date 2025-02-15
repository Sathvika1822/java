package com.Number;

public class RecPalindrome {

	public static void main(String[] args) {
		int n=1213;
		int rev=isPalindrome(n,0);
		if(n==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}
	
	public static int isPalindrome(int n,int rev)
	{
		if(n==0)return rev;
		rev=(rev*10)+n%10;
		return isPalindrome(n/10,rev);
	}

}
