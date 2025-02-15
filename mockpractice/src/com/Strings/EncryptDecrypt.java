package com.Strings;

public class EncryptDecrypt {

	public static void main(String[] args) {
		System.out.println(encode("abc",2));
	}
	
	public static String encode(String s,int n)
	{
		String res="";
		for(int i=0;i<s.length();i++)
		{
		char ch=s.charAt(i);
		if(Character.isUpperCase(ch))
		{
			char ch1=((char)('A'+(ch-'A'+n)%26));
			res+=ch1;
		}
		else if(Character.isLowerCase(ch))
		{
			char ch1=((char)('a'+(ch-'a'+n)%26));
			res+=ch1;
		}
		else
		{
			res+=ch;
		}
	   }
		return res;
	}
	
	public static String decode(String s,int n)
	{
		return encode(s,(26-(n%26)));
	}

}
