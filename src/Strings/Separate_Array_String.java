package Strings;

import java.util.Arrays;

public class Separate_Array_String {
	public static void main(String[] args) {

		String email = "a99sjad01122@gmail.com";
		System.out.println(email);
		
		String number = "";
		String string = "";
		String specielChar = "";

		// Convert String into array
		char[] array = email.toCharArray();

		for (int i = 0; i < email.length(); i++) {			
			int ASCII = (int) email.charAt(i);
			
			if(ASCII>47 && ASCII<58) {
				number += array[i]+",";
			}
			else if((ASCII> 64&& ASCII<91) || (ASCII> 96&& ASCII<123)) {
				string += array[i]+",";
			}
			else if((ASCII> 57&& ASCII<65) || (ASCII>32 && ASCII<48)) {
				specielChar += array[i]+",";
			}

		}
		System.out.println();
		System.err.println("Numbers ("+ number.length()+") --- "+number);
		System.err.println("String ("+string.length()+") --- "+string);
		System.err.println("Speciel Char ("+specielChar.length()+") --- "+specielChar);
	}
}
