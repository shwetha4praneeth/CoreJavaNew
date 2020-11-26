package javaBasics;

import java.util.ArrayList;

public class ArraysCodeInOops 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> x=new ArrayList<Integer>();
		x.add(45);
		x.add(89);
		x.add(-90);
		x.add(0);
		for(int i=0; i<x.size(); i++)
		{
			System.out.println(x.get(i));
		}
	}
}
