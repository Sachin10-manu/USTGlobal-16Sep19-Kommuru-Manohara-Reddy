
public class TestC {
	public static void main(String[] args) {
		Person.color = "white";
		Person.sleep();
		System.out.println("Person color "+Person.color);
		Person p = new Person();
		p.name = "Manu";
		p.age = 24;
		System.out.println("Person name "+p.name);
		System.out.println("Person age "+p.age);
		p.eat();
		p.sleep();
	}

}
