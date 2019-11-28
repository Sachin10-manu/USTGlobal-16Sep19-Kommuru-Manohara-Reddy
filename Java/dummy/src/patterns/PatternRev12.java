package patterns;

import java.util.Scanner;

public class PatternRev12 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num= ");
	    int num=sc.nextInt();
	    int st= 1;
	    int ch1=1;
	    for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=st;j++)
		{
		if(j==1||j==st)
		{
			System.out.print("*");
		}
		else
		{
		   System.out.print(ch1++);
	    }
	    }
		if(i<=num/2)
		{
			st++;
		}
		else
		{
			st--;
		}
		System.out.println();
	}
  }
}
