package patterns;

public class PatternThree 
{
	public static void main(String[] args)
	{
		int num=5;
		
		for(int i=1;i<=num;i++)
		{
			char ch1='A';
			int ch2=1;
			for(int j=1;j<=i;j++)
			{
				if(i % 2 !=0)
				{
					System.out.print(ch1);
				}
				else
				{
					System.out.print(ch2);
				}
			
			}
				if(i % 2 !=0)
					ch1++;
				else
					ch2++;
			
				System.out.println();
			
	    }
    }

}
