
public class Factorial {
	public static void main(String[] args) {
		int n=fact(6);
		System.out.println("Factorial is "+n);
	}
	public static int fact(int n) {
		if(n==0 || n==1)
			return 1;
		return n*fact(n-1);
	}

}
