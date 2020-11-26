package javaBasics;

import java.util.Scanner;

public class MulTableFromArrayList 
{
	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a number");
		//int n=sc.nextInt();
		
		int x[] = {2,4,6,8,10};
		for(int j=0; j<x.length; j++) //array loop
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(i+"*"+x[j]+"="+(i*x[j]));
			}
		}
	}
}
