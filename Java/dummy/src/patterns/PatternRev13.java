package patterns;

import java.util.Scanner;

public class PatternRev13 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num= ");
	    int num=sc.nextInt();
	    int st= 1;
	    
	    for(int i=1;i<=num;i++)
	{
	    int ch1=1;
	    char ch2='A';
		for(int j=1;j<=st;j++)
		{
		if(i<=num/2 +1)
		{
			if(i%2!=0)
			System.out.print(ch2++);
		else
		   System.out.print(ch1++);
	    }
		else
			if(i%2!=0)
				System.out.print(ch1++);
			else
				System.out.print(ch2++);
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
