package javaBasics;

import java.util.Scanner;

public class MulTableFromKeyboard 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
				
		int x[] = new int[n];
		System.out.println("Enter array values");
		for(int k=0; k<n; k++) //array input from scanner
		{
			x[k]=sc.nextInt();
		}
		
		for(int j=0; j<x.length; j++) //array loop to get value
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(i+"*"+x[j]+"="+(i*x[j]));
			}
		}
	}
}
