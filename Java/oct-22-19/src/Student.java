
public class Student {
	String name;
	int age;
	int id;
	static String cname;
	
	Student(String name,int age,int id,String cname){
		this.name = name;
		this.age = age;
		this.id = id;
		this.cname = cname;
	}
	
	void display() {
		System.out.println("Student name "+name);
		System.out.println("Student age "+age);
		System.out.println("Student id "+id);
		System.out.println("Student cname "+cname);
		System.out.println("*********************");
		
	}
	public static void main(String[] args) {
		
		Student s1 = new Student("Manu",24,1,"MITS");
		s1.display();
		
		Student s2 = new Student("Vikas",25,2,"MITS");
		s2.display();
		
		Student s3 = new Student("Rakesh",24,3,"MITS");
		s3.display();
		
		Student s4 = new Student("Reddy",23,4,"MITS");
		s4.display();
		
		Student s5 = new Student("Pradeep",26,5,"MITS");
		s5.display();
		
		Student s6 = new Student("Hima",23,6,"MITS");
		s6.display();
		
		Student s7 = new Student("Naveen",24,7,"MITS");
		s7.display();
		
		Student s8 = new Student("Manideep",24,8,"MITS");
		s8.display();
		
		Student s9 = new Student("Swamy",25,9,"MITS");
		s9.display();
		
		Student s10 = new Student("Shashi",23,10,"MITS");
		s10.display();
	}
}

