package patterns;

public class PatternFour 
{
	public static void main(String[] args)
	{
		int num=5;
		char ch1='A';
		int ch2=1;
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==1 || j==i)
				{
					System.out.print(ch1++);
				}
				else
				{
					System.out.print(ch2++);
				}
			}
				System.out.println();
			
	    }
    }

}
