package com.TwoDArray;

public class SpiralPattern {
	public static void main(String[] args)
	{
		int[][] a=spiral(5);
		for(int[] t:a)
		{
			for(int n:t)
			{
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}
	
	static int[][] spiral(int size)
	{
		int[][] a=new int[size][size];
		int r=0, c=-1;
		char d='r';
		for(int i=1;i<=size*size;i++)
		{
			switch(d)
			{
			case 'r':
				c++;
				a[r][c]=i;
				if(c==size-1-r) d='d';
				break;
			case 'd':
				r++;
				a[r][c]=i;
				if(r==c) d='l';
				break;
			case 'l':
				c--;
				a[r][c]=i;
				if(r+c==size-1) d='u';
				break;
			case 'u':
				r--;
				a[r][c]=i;
				if(r-c==1) d='r';
				break;
			}
		}
		return a;
	}

}
