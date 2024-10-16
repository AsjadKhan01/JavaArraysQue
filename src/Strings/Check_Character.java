package Strings;

import java.util.Scanner;

public class Check_Character {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("Enter the character : ");
			char ch = sc.next().charAt(0);
			
			int chr = (int)ch;
			System.out.println(chr);
			
			if(ch==97||ch==101||ch==105||ch==111||ch==117) {
				System.out.println("WOVEL");
			}
			else {
				System.out.println("CONSTONENTS");
			}
		}
	}
}
