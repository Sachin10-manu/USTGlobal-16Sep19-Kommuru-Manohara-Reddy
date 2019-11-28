package ban.mix;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[]args)
	{
		System.out.println("Enter the choice ");
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
		Color c=null;
		
		switch(ch)
		{
		case 1:c=new ColorFactory().getColor("Red");
	           c.fill();
	           break;
		case 2:c=new ColorFactory().getColor("Green");
	           c.fill();
	           break;
		case 3:c=new ColorFactory().getColor("Green");
               c.fill();
               break;
		case 4:break;
		}
	}
}
