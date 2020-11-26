package javaBasics;

import java.util.Scanner;

public class CountOfUpCaseLoCaseDiSpa 
{
	public static void main(String[] args) 
	{
		/*//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		//Way:1
		//Count variables
		int clc=0;
		int cuc=0;
		int cd=0;
		int csc=0;
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			if(y>=97 && y<=122) //if (y>='a' && y<='z') -> ASCII values
			{
				clc++;
			}
			else if(y>=65 && y<=90) //else if(y>'A' && y<='Z')
			{
				cuc++;
			}
			else if(y>=48 && y<=57) //else if(y>='0' && y<='9')
			{
				cd++;
			}
			else
			{
				csc++;
			}
		}
		System.out.println("Count of lower case is "+clc);
		System.out.println("Count of upper case is "+cuc);
		System.out.println("Count of digits is "+cd);
		System.out.println("Count of special characters "+csc);*/
		
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		//Way:2
		//Count variables
		int clc=0;
		int cuc=0;
		int cd=0;
		int csc=0;
		int spc=0;
		
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			if(Character.isLowerCase(y))
			{
				clc++;
			}
			else if(Character.isUpperCase(y))
			{
				cuc++;
			}
			else if(Character.isDigit(y))
			{
				cd++;
			}
			else if(Character.isSpace(y))
			{
				spc++;
			}
			else
			{
				csc++;
			}
		}
		System.out.println("Count of lower case is "+clc);
		System.out.println("Count of upper case is "+cuc);
		System.out.println("Count of digits is "+cd);
		System.out.println("Count of special characters "+csc);
		System.out.println("Count of spaces "+spc);
	}
}
