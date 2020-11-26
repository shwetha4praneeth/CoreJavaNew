package javaBasics;

import java.util.Scanner;

public class HormonicSeries 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		//Sum = 1/1 + 1/2 + 1/3 + ... + 1/n
		/*double sum=0;
		for(int i=1; i<=n; i++)
		{
			sum=sum+1/i;
		}
		System.out.println(sum);*/
	
		//Sum = 1/1 + 1/3 + 1/5 + ... + 1/n
		/*double sum=0;
		for(int i=1; i<=n; i=i+2)
		{
			sum=sum+1/i;
		}
		System.out.println(sum);*/
		
		//Sum = 1/5 + 2/5 + 3/5 + ... + n/5
		/*double sum=0;
		for(int i=1; i<=n; i++)
		{
			sum=sum+i/5;
		}
		System.out.println(sum);*/
		
		//Sum = (1*5) + (2*5) + (3*5) + ... + (n*5)
		/*long sum=0;
		for(int i=1; i<=n; i++)
		{
			sum=sum+(i*5);
		}
		System.out.println(sum);*/
		
		//Sum = 1/2 + 1/4 + 1/8 + 1/16 + ... + 1/n
		/*double sum=0;
		for(int i=2; i<=n; i=i*2)
		{
			sum=sum+(1/i);
		}
		System.out.println(sum);*/
		
		//Sum = 1/2 + 2/3 + 3/4 + ... + n/n+1
		/*double sum=0;
		for(int i=1; i<=n; i++)
		{
			sum=sum+i/(i+1);
		}
		System.out.println(sum);*/
		
		//Sum = 1/2 + 1/4 + 1/6 ... + 1/n
		//Sum = 1/1 + 1/3 + 1/5 ... + 1/n
		//Using one loop
		/*double sum1=0;
		double sum2=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{		
				sum1=sum1+1/i;
			}
			else
			{
				sum2=sum2+1/i;
			}
		}
			System.out.println(sum1);
			System.out.println(sum2);*/
	
		//Sum = 1/n + 1/n-1 + ... + 1/1
		/*double sum=0;
		for(int i=n; i>=1;i--)
		{
			sum=sum+1/i;
		}
		System.out.println(sum);*/
	}
}
