package javaBasics;

import java.util.Scanner;

public class PalindromeOrNot 
{
	public static void main(String[] args) 
	{
		//Take a word
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		sc.close();
		String palindrome="";
		for(int i=x.length()-1;i>=0;i--)
		{
			char c=x.charAt(i);
			palindrome=palindrome+c;
			//palindrome=x.charAt(i)+palindrome;
		}
		if(x.equals(palindrome))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}
