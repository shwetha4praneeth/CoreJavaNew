package javaBasics;

import java.util.Scanner;

public class CountOfVowelsInSentence 
{
	public static void main(String[] args) 
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		//Count vowels
		int vc=0;
		int remaining=0;
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			switch(y)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vc++;
				break;
			default:
				remaining++;
			}
		}
		System.out.println("Count of vowels is: "+vc);
		System.out.println("Count of remaining characters is: "+remaining);
	}
}
