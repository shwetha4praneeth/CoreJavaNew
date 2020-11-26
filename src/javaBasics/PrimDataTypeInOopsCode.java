package javaBasics;

public class PrimDataTypeInOopsCode 
{
	public static void main(String[] args)
	{
		Integer x=new Integer(34);
		Integer y=new Integer(56);
		Integer z=new Integer(x.intValue()+y.intValue());
		System.out.println(z.intValue());
	}
}
