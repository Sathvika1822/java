package com.TwoDArray;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scn.nextInt();
		int s=n-1;
		int[][] a=pascal(n);
		for(int[] t:a)
		{
			for(int k=0;k<s;k++)
			{
				System.out.print(" ");
			}
			for(int l:t)
			{
				System.out.print(l+" ");
			}
			System.out.println();
		    s--;
		}
	}
	
	static int[][] pascal(int size)
	{
		int[][] a=new int[size][];
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0||i==j)
				{
					a[i][j]=1;
				}
				else
				{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		return a;
	}
}
