package Strings;

import java.util.Scanner;

public class Valid_palindrome {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String to Check palindrome or not : ");
		String str = sc.nextLine();
		
		String rev="";
	    for(int i=str.length()-1; i>=0; i--) {
	    	rev = rev + str.charAt(i);
	    }
	    if(str.equalsIgnoreCase(rev)) {
	    	System.out.println("Yes! "+str+" is Palindrome");
	    }
	    else {
	    	System.out.println("No! "+str+" is not Palindrome");

	    }
	}
}
