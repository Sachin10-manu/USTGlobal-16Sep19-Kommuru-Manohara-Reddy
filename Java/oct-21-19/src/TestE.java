
public class TestE {
	public static void main(String[] args) {
		Student.cname = "MITS";
		Student s1 = new Student();
		s1.name = "Manu";
		s1.Usn = 499;
		System.out.println("Collage name is "+Student.cname);
		System.out.println("Name is "+s1.name);
		System.out.println("ID is "+s1.Usn);
	}

}
