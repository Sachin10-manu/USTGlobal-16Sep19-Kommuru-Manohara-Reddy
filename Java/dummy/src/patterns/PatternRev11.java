package patterns;

import java.util.Scanner;

public class PatternRev11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num= ");
	    int num=sc.nextInt();
	    int st= 1;
	    for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=st;j++)
		{
		if(i<=(num/2)+1)
		{
			System.out.print((i+j)%2);
		}
		else
		{
			if((i+j)%2==0)
		   System.out.print("1");
			else
				System.out.print("0");
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
