package patterns;

public class PatternSix
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
				System.out.print((i+j)%2);
			}
				System.out.println();
			
	    }
    }
}
