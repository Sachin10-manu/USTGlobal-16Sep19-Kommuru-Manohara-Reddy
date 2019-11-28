package ban.interfaces.Browser;

import java.util.Scanner;

public class MainClass {
	public static void main(String[]args)
	{
		System.out.println("enter the choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		Browser B=null;
		
		switch(ch)
		{
		case 1:B=new BrowserFactory().getBrowser("Chrome");
		       B.start();
		       break;
		case 2:B=new BrowserFactory().getBrowser("Safari");
	           B.start();
	           break;
		case 3:B=new BrowserFactory().getBrowser("Opera");
	           B.start();
	           break;
		case 4:break;
		}
	}
}
