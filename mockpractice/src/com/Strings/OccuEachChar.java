package com.Strings;

public class OccuEachChar {

	public static void main(String[] args) {
		String s1="jaaavvva";
		String s2="";
		
		while(s1.length()!=0)
		{
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"","");
			int count=s1.length()-s2.length();
			System.out.println(ch+"="+count);
			s1=s2;
		}

	}

}
