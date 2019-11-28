package patterns;

import java.util.Scanner;

public class GroomPattern2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int temp=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp%2);
				temp++;
			}
			System.out.println();
		}
	}
}
