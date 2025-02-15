package com.Recursion;

public class DisplayNums {

	public static void main(String[] args) {
		display(1);
	}
	
	public static void display(int i)
	{
		if(i>10) return;
		System.out.println(i);
		display(i+1);
	}

}
