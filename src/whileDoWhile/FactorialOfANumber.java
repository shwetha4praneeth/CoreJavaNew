package whileDoWhile;

import java.util.Scanner;

public class FactorialOfANumber 
{
	public static void main(String[] args) 
	{
		//Take a number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt(); 
		sc.close();
		long f=1; 
		int temp=n;
		while (temp>0)
		{
			f=f*temp;
			temp--;
		}
		System.out.println(f);
	}
}
