package numbers;
import java.util.Scanner;
public class specialnumber 
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
			int fact=1;
			while(rem>1)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println(" The number is perfect number");
		}
		else
		{
			System.out.println("The number is not perfect number");
		}
		
		
		}
	}

