package javaBasics;

import java.util.Scanner;

public class CountOfCharactersInSentenceWithoutLoop 
{
	public static void main(String[] args) 
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		//Take a char
		System.out.println("Enter a character");
		
		CharSequence y=sc.nextLine();
		
		//char y=sc.nextLine().charAt(0);
		sc.close();
		//Count of occurences without loop
		String temp1=x; //Copy sentence
		int l1=temp1.length(); //Get count of chars in that sentence
		System.out.println(l1);
		
		/*String temp2=""; //empty string
		temp1=temp1.replace(temp2.valueOf(y),"");*/
		/*String temp2=""+y;
		temp1=temp1.replace(temp2,"");*/
		temp1=temp1.replace(y,"");
		
		int l2=temp1.length(); //Get count of chars in that sentence after replacing
		System.out.println(l2);
		System.out.println(y+" occured "+(l1-l2)+" times");
	}
}
