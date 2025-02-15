package com.Strings;

public class MaxCount {

	public static void main(String[] args) {
		String s1="jjjjjaaaaavvva";
		String s2="";
		int maxCount=0;
		char maxChar=' ';
		while(s1.length()!=0)
		{
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"","");
			int count=s1.length()-s2.length();
			System.out.println(ch+"="+count);
			
			if(count>maxCount)
			{
				maxCount=count;
				maxChar=ch;
			}
			s1=s2;
		}
		System.out.println("======");
		System.out.println(maxChar+"="+maxCount);

	}

}
