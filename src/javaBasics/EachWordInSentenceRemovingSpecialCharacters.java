package javaBasics;

import java.util.HashMap;
import java.util.Scanner;

public class EachWordInSentenceRemovingSpecialCharacters
{
	public static void main(String[] args) 
	{
		//Give a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		//If duplicate words in different cases, get sentence into same case
		x=x.toUpperCase();
		//Split sentence into words
		String[] words=x.split(" "); //Blank space as separator
		//Remove special characters in every word except 's and 't
		//shw pra guddu isn't wasn't it's put get please come
		for(int i=0;i<words.length;i++)
		{
			//Each char in a word
			for(int j=0;j<words[i].length();j++)
			{
				//As per our requirements, increase if conditions
				char c=words[i].charAt(j);
				if(c=='\'' && words[i].charAt(j+1)=='s')
				{
					continue;
				}
				else if(c=='\'' && words[i].charAt(j+1)=='t')
				{
					continue;
				}
				else if(!Character.isAlphabetic(c) && !Character.isDigit(c)) //mandatory
				{
					String s=c+""; //Convert char into string
					words[i]=words[i].replace(s,""); //special character replaced with null
				}
			}
		}
		//Create hashmap to store "words" & "occurences of those words" as pairs/entries
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<words.length;i++) //for all words in sentence
		{
			if(hm.containsKey(words[i])) //word already inserted into hash map
			{
				hm.put(words[i],hm.get(words[i])+1);
			}
			else
			{
				hm.put(words[i],1);
			}
		}
		System.out.println(hm);
		//Display duplicated words
		for(String word:hm.keySet()) //for all inserted distinct words in hash map
		{
			if(hm.get(word)>1)
			{
				System.out.println(word+" occured "+hm.get(word));
			}
		}
	}
}
