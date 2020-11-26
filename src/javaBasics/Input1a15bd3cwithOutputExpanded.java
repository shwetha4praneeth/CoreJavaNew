package javaBasics;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input1a15bd3cwithOutputExpanded 
{
	public static void main(String[] args) 
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence in desired pattern");
		String x=sc.nextLine(); //10a12b16cd
		sc.close();
		//Seperate digits & chars
		ArrayList<Integer> sizes=new ArrayList<Integer>(); 
		ArrayList<String> displays=new ArrayList<String>();
		Pattern r1=Pattern.compile("[0-9]+"); //one or more digits
		Matcher m1=r1.matcher(x);
		while(m1.find())
		{
			sizes.add(Integer.parseInt(m1.group())); //10..12..16 will come & wait
		}
		Pattern r2=Pattern.compile("[a-zA-Z]+"); //one or more alphabets
		Matcher m2=r2.matcher(x);
		while(m2.find())
		{
			displays.add(m2.group()); //a..b..cd will come & wait
		}
		//Display output
		String output = "";
		for(int i=0;i<sizes.size();i++)
		{
			int l=sizes.get(i); //From array 1
			String s=displays.get(i); //From array 2
			for(int j=0;j<l;j++)
			{
				output=output+s;
			}
		}
		System.out.println(output);
	}
}
