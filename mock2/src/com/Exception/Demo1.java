package com.Exception;

public class Demo1 {

	public static void main(String[] args) {
		try
		{
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch (ArithmeticException e)
		{
			System.out.println("we can't devide by zero");
		}
		finally
		{
			System.out.println("finally is always executed");
		}

	}

}
