package com.Strings;

public class ReverseString {
	public static void main(String[] args)
	{
		String s="sathvika";
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			s2+=ch;
		}
		System.out.println(s2);
	}

}
