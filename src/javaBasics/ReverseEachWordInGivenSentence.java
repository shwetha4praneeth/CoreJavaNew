package javaBasics;

import java.util.Scanner;

public class ReverseEachWordInGivenSentence 
{
	public static void main(String[] args) 
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close();
		String[] words=x.split(" ");
		//Reverse each word & add to output
		String y=""; //for output
		for(int i=0;i<words.length;i++)
		{
			//Reverse that word
			String temp="";
			for(int j=words[i].length()-1;j>=0;j--)
			{
				temp=temp+words[i].charAt(j);
			}
			//Add reversed word to output
			y=y+temp+" ";
		}
		//Display output
		System.out.println(y.trim());
	}
}
