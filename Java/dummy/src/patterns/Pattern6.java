package patterns;

import java.util.Scanner;

public class Pattern6 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
	    int num = sc.nextInt();
	for(int i=1;i<=num;i++)
	{
		char ch1='A';
		int ch2=1;
		for(int j=1;j<=i;j++)
		{
			if(j%2!=0)
			{
			System.out.print(ch1);
			ch1++;
			}
			else
			{
				System.out.print(ch2);
				ch2++;
			}
		}
		System.out.println();
	}
	}

}
