package patterns;

import java.util.Scanner;

public class PatternRev
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num= ");
	    int num=sc.nextInt();
	    int sp= num - 1;
	    for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		sp--;
		System.out.println();
	}
	}
}
