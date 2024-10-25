package Arrays;

public class Factorial {
	public static void main(String[] args) {
		
		long fact = 50l;
		
		for (long i=fact-1; i>0; i--) {
			fact = fact*i;
		}
		System.out.println("Factorial : "+fact);
	}
}
