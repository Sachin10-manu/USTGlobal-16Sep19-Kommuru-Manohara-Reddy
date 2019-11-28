package ban.interfaces;

public class ShapeFactory 
{
	Shape sh=null;
	public Shape getShape(String s)
	{
		if(s.equalsIgnoreCase("Circle"))
		{
			sh=new Circle();
		}
		else if(s.equalsIgnoreCase("Square"))
		{
			sh=new Square();
		}
		else if(s.equalsIgnoreCase("Rectangle"))
		{
			sh=new Rectangle();
		}
		return sh;
		
	}
}
