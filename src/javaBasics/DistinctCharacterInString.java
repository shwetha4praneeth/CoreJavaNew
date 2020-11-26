package javaBasics;

import java.util.HashMap;
import java.util.Scanner;

public class DistinctCharacterInString 
{
	public static void main(String[] args) 
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close(); 
		x=x.toLowerCase(); //Getting duplicate chars in different cases to same case
		//Split sentence into chars
		char[] chars=x.toCharArray();
		//Create hashmap to store chars & occurences of those chars as pairs
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<chars.length;i++)
		{
			if(hm.containsKey(chars[i])) //character already inserted into hashmap
			{
				hm.put(chars[i],hm.get(chars[i])+1); //Update existing entry
			}
			else
			{
				hm.put(chars[i],1); //Insert new entry
			}
		}
		System.out.println(hm);
		//Find duplicated chars in all inserted distinct chars in hashmap
		for(char c:hm.keySet())
		{
			if(hm.get(c)>1)
			{
				System.out.println(c+" occured "+hm.get(c));
			}
		}
	}
}
