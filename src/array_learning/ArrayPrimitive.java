package array_learning;

import java.util.Scanner;

public class ArrayPrimitive 
{
	public static void main(String [] args)
	{
		int s[]=new int[10];
		
		System.out.println("Enter students roll number:");
		Scanner r=new Scanner(System.in);
		
		for(int i=0;i<s.length;i++)
		{
			s[i]=r.nextInt();
		}
		
		System.out.println("Printing students roll number:");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
