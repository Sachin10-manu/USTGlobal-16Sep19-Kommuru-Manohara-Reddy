package patterns;

import java.util.Scanner;

public class PatternRev10 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num= ");
	    int num=sc.nextInt();
	    int st= 1;
	    char ch1='A',ch2='a';
	    for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=st;j++)
		{
		if(i<=(num/2)+1)
		{
			System.out.print(ch1++);
			ch2++;
		}
		else
		{
		   System.out.print(ch2++);
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
