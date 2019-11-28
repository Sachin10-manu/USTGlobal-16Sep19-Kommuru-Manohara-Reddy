package patterns;

import java.util.Scanner;

public class PatternRev9 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num= ");
	    int num=sc.nextInt();
	    int st= 1;
	    int val=0;
	    for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=st;j++)
		{
		if(i<=(num/2)+1)
		{
			System.out.print(++val);
		}
		else
		{
		   System.out.print(--val);
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
