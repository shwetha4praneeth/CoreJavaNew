package javaBasics;

import java.util.Scanner;

public class ReverseGivenStringDirectMethod
{
	public static void main(String[] args)
	{
		//Take a word
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		sc.close();
		//Reverse() method
		StringBuffer sb=new StringBuffer(x);
		StringBuffer y=sb.reverse();
		System.out.println(y);
	}
}
