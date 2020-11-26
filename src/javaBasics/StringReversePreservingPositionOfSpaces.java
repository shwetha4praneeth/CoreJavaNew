package javaBasics;

import java.util.Scanner;

public class StringReversePreservingPositionOfSpaces 
{
	public static void main(String[] args) 
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence"); 
		String x=sc.nextLine(); //I love Praneeth
		sc.close();
		//Reverse the sentence
		String y="";
		for(int i=x.length()-1;i>=0;i--)
		{
			char c=x.charAt(i);
			y=y+c; //hteenarP evol I
		}
		//Preserve positions of spaces
		y=y.replace(" ",""); //hteenarPevolI  //Remove spaces in reverse to preserve spaces of original
		String z="";
		int j=0;
		for(int i=0;i<x.length();i++) //Follow original string to preserve spaces
		{
			if(x.charAt(i)==' ')
			{
				z=z+' ';
			}
			else
			{
				z=z+y.charAt(j);
				j++;
			}
		}
		System.out.println(z);
	}
}
