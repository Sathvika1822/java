package com.Strings;

public class Palindrome {

	public static void main(String[] args) {
		String s="madam";
		int len=s.length();
		String revStr="";
		for(int i=len-1;i>=0;i--)
		{
			revStr=revStr+s.charAt(i);
		}
		if(s.equals(revStr))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
