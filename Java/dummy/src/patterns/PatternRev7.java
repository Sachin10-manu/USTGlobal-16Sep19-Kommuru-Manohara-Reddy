package patterns;

import java.util.Scanner;

public class PatternRev7 
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
			System.out.print("*");
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
