package com.Recursion;

public class Palindrome {

	public static void main(String[] args) {
		int n=12321;
		int rev=isPalindrome(n,0);
		if(n==rev)
		{
			System.out.println(n+" is Palindrome");
		}
		else
		{
			System.out.println(n+" is Not Palindrome");
		}
	}
	
	public static int isPalindrome(int n, int rev)
	{
		if(n==0) return rev;
		rev=(rev*10)+(n%10);
		return isPalindrome(n/10, rev);
	}

}
