package basics;

import java.util.Scanner;

public class SwapTwoNumbers 
{
	public static void main(String[] args) 
	{
		//Take two numbers from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int x=sc.nextInt();
		System.out.println("Enter 2nd number");
		int y=sc.nextInt();
		sc.close();
		System.out.println(x+" "+y);
		//Way:1 (Using third variable)
		/*int z=x;
		x=y;
		y=z;
		System.out.println(x+" "+y);*/
		
		//Way:2 (Without using third variable)
		/*x=x*y;
		y=x/y;
		x=x/y;
		System.out.println(x+" "+y);*/
		
		//Way:3 (Without using third variable)
		/*x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" "+y);*/
		
		//Way:4 (Using bitwise operators)
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println(x+" "+y);
	}
}
