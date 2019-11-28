package ban.mix;

public class FactoryProducer 
{
	public AbstractFactory getFactory(String s)
	{
		if(s.equalsIgnoreCase("Shape"))
		{
			return new ShapeFactory();
		}
		else if(s.equalsIgnoreCase("Color"))
		{
			return new ColorFactory();
		}
		return null;

	}
}
