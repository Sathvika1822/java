package com.Strings;

public class CountVowelsConsonants {

	public static void main(String[] args) {
        String s="java is easy";
        int vCount=0, cCount=0;
        String str=s.toLowerCase();
        
        for(int i=0;i<str.length();i++)
        {
        	char ch=str.charAt(i);
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        	{
        		vCount++;
        	}
        	else if(ch>='a'&&ch<='z')
        	{
        		cCount++;
        	}
        }
        System.out.println(vCount);
        System.out.println(cCount);
	}

}
