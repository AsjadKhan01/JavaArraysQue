package Strings;

public class Panagram_checking {

	private static boolean contains(char[] arr, char c) {
		for (char x : arr) {
			if (Character.toLowerCase(x) == Character.toLowerCase(c)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog";
		char arr[] = new char[26];

		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isLetter(c) && !contains(arr, c)) {
				arr[index] = c;
				index++;
			}
		}
		if (Character.isLetter(arr[25])) {
			System.out.println("Panagram String");
		} else {
			System.out.println("NOT Panagram String");
		}
	}
}