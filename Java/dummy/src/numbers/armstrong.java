package numbers;

import java.util.Scanner;

public class armstrong 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number= ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(" The number is armstrong number");
		}
		else
		{
			System.out.println("The number is not armstrong number");
		}
		
		
	}
}
