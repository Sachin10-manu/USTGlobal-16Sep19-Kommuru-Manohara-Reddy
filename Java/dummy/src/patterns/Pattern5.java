package patterns;

import java.util.Scanner;

public class Pattern5
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
	    int num = sc.nextInt();
	    char ch='A';
	for(int i=1;i<=num;i++)
	{
		
		for(int j=1;j<=i;j++)
		{
			System.out.print(ch);
			ch++;
		}
		System.out.println();
	}
	}

}