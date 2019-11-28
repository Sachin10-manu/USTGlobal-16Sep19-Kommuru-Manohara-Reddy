package ban.mix;

public class ColorFactory extends AbstractFactory
{
	public Color getColor(String s)
	{
		Color c=null;
		if(s.equalsIgnoreCase("Red"))
		{
			c=new Red();
		}
		else if(s.equalsIgnoreCase("Green"))
		{
			c=new Green();
		}
		else if(s.equalsIgnoreCase("Blue"))
		{
			c=new Blue();
		}
		return c;
	}
}
