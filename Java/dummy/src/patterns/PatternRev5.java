package patterns;

import java.util.Scanner;

public class PatternRev5 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num= ");
	    int num=sc.nextInt();
	    int sp= num - 1;
	    for(int i=1;i<=num;i++)
	{
	    	int ch=1;
	    	char ch1='A';
		for(int j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			if(k%2==0)
			{
			System.out.print(ch1++);
			}
			else
			{
				System.out.print(ch++);
			}
		}
		sp--;
		System.out.println();
	}
	}
}
