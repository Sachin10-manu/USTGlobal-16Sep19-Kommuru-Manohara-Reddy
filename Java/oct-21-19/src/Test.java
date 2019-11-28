
public class Test {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost = 100;
		p.color = "blue";
		p.brand = "Reynolds";
		System.out.println("Cost is "+p.cost);
		System.out.println("Color is "+p.color);
		System.out.println("Brand is "+p.brand);
		p.write();
		
		System.out.println("*****************************");
		Van v = new Van();
		v.price = 1000000;
		v.color = "Blue";
		System.out.println("Price is "+v.price);
		System.out.println("Color is "+v.color);
		v.move();
		
		Van v1 = new Van();
		v1.price = 1000000;
		v1.color = "Blue";
		System.out.println("Price is "+v1.price);
		System.out.println("Color is "+v1.color);
		v1.move();
	}

}
