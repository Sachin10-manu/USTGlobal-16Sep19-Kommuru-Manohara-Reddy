package patterns;

public class PatternSeven 
{
	public static void main(String[] args)
	{
		int num=5;
		char ch1='A';
		int ch2=1;
		int val=1;
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(val++%2);
			}
				System.out.println();	
	    }
    }
}
