
public class Employee1 {
	String name;
	int eid;

	public Employee1(String name,int eid) {
		this.name = name;
		this.eid = eid;
	}
	
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("Hello "+name+" welcome to UST global company");
	}
	
	public static void main(String[] args) {

		Employee1 e1 = new Employee1("Rashmika",143);
		Employee1 e2 = new Employee1("Deepika",420);		
		Employee1 e3 = new Employee1("Manu",345);
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}

}
