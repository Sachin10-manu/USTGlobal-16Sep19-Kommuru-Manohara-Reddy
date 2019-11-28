package numbers;

import java.util.Scanner;

public class genArmStrong 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number= ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		int count=0;
		while(num>0)//no.of digits logic
		{
			count++;
			num=num/10;
		}
		num=temp;//reloading the number
		while(num>0)
		{
			int rem=num%10;
			int mul=1;
			for(int i=1;i<=count;i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("The number is armstrong ");
		}
		else
		{
			System.out.println("The number is not armstrong");
		}
	}
}
		

