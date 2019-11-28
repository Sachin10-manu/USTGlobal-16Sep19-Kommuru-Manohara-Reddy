package ban.interfaces.Browser;

public class BrowserFactory
{
	public Browser getBrowser(String s)
	{
		Browser B=null;
        if(s.equalsIgnoreCase("Chrome"))
        {
        	B=new Chrome();
        }
        else if(s.equalsIgnoreCase("Safari"))
        {
        	B=new Safari();
        }
        else if(s.equalsIgnoreCase("Opera"))
        {
        	B=new Opera();
        }
        return B;
	}
}
