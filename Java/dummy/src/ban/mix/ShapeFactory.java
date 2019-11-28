package ban.mix;

public class ShapeFactory extends AbstractFactory
{
	public Shape getShape(String s)
	{
		Shape sh=null;
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
