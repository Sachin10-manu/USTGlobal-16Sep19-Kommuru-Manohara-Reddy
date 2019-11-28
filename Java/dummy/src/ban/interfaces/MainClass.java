package ban.interfaces;
import java.util.Scanner;

public class MainClass
{
	public static void main(String[]args)
	{
		System.out.println("enter the choice");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		Shape sh=null;
		
		switch(ch)
		{
		case 1:sh=new ShapeFactory().getShape("Circle");
		       sh.draw();
		       break;
		case 2:sh=new ShapeFactory().getShape("Square");
	           sh.draw();
	           break;
		case 3:sh=new ShapeFactory().getShape("rectangle");
	           sh.draw();
	           break;
		case 4:break;
		}
	}
}
