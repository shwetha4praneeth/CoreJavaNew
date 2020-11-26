package whileDoWhile;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a limit");
		int l=sc.nextInt();
		int x=0; 
		int y=1;
		do
		{
			int z=x+y; 
			System.out.println(""+z);
			x=y;
			y=z;
		} while((x+y)<=l); 
	}
}
