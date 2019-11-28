package patterns;

import java.util.Scanner;

public class PatternRev6 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num= ");
	    int num=sc.nextInt();
	    int val=1;
	    int sp=num-1;
	    int ch1=1;
	    char ch2='A';
	    for(int i=1;i<=num;i++)
	{
		for(int j=1;j<=sp;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			if((i==1||i==num)&&(k==i)||(i==num)&&(k==1))
			{
			System.out.print("*");
			}
			else
			{
				if(val%2!=0)
				{
				System.out.print(ch1++);
				}
				else
				{
					System.out.print(ch2++);
				}
				val++;
			}
		}
		sp--;
		System.out.println();
	}
	}
}
