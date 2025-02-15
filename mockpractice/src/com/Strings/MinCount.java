package com.Strings;

public class MinCount {
	public static void main(String[] args)
	{
		String s1="jjjjjaaaaavva";
		String s2="";
		int minCount=s1.length()-1;
		char minChar=' ';
		while(s1.length()!=0)
		{
			char ch=s1.charAt(0);
			s2=s1.replace(ch+"", "");
			int count=s1.length()-s2.length();
			System.out.println(ch+"="+count);
			if(count<minCount)
			{
				minCount=count;
				minChar=ch;
			}
			s1=s2;
		}
		System.out.println("====");
		System.out.println(minChar+"="+minCount);
		
	}

}
