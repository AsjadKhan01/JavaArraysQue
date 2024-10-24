package Strings;

public class Minimum_deletion {
	public static void main(String[] args) {
//not complete this task.
		String str = "geeksforgeeks";
		int deletion = 0;
		int len = str.length(); //13-4=9 
		
		for (int i = 0; i < len; i++) {
			
			for (int j = len - 1; j > 0; j--) {
				
				if(str.charAt(i) != str.charAt(j)) {
					deletion+=1;
				}else {
					len = len - deletion;
					break;
				}
			}
			System.out.print("t");
		}
		System.out.println(deletion);
	}
}
