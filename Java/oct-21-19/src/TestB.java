
public class TestB {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.name = "ganga";
		c.color = "Black and White";
		System.out.println("Name of cow is "+c.name);
		System.out.println("Color of cow is "+c.color);
		c.eat();
		c.sleep();
	}

}
