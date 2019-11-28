package patterns;

public class Patternstype2 
{
	public static void main(String[] args)
	{
		int num=5;
		char ch1='A';
		int ch2=1;
		
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=1;j++)
			{
				if(i%2!=0)
				{
					System.out.print(ch1);
				}
				else
				{
					System.out.print(ch2);
				}
			}
				if(i%2!=0)
					ch1++;
				else
					ch2++;
				System.out.println();
			}
	}
}
