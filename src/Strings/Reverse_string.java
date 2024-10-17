package Strings;

import java.util.Scanner;

public class Reverse_string {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.nextLine();
				
		double nextDouble = sc.nextDouble();
		
		String rvs = "";
		for(int i=str.length()-1; i>=0; i--) {
			rvs = rvs + str.charAt(i);
		}
		System.out.println("Reverse String is : "+ rvs);
	}
}
