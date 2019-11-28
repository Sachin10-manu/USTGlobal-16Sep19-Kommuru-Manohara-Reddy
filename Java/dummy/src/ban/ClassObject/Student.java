package ban.ClassObject;

public class Student 
{
	private String name;
	private int id;
	private double marks;
	
	public Student(String name,int id,double marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return id;
	}
	public double getMarks()
	{
		return marks;
	}
	@Override
	
	public String toString()
	{
		return "Name= "+this.name+"Id= "+this.id+"Marks= "+this.marks;
	}
}
