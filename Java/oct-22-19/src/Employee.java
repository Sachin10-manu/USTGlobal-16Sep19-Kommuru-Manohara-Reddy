
public class Employee {
	String name;
	int eid;

	public Employee(String empname,int empid) {
		name = empname;
		eid = empid;
	}
	
	void printDetails() {
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+eid);
	}
	
	public static void main(String[] args) {

		Employee e1 = new Employee("Rashmika",143);		
		Employee e2 = new Employee("Deepika",420);		
		Employee e3 = new Employee("Manu",345);
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}

}
