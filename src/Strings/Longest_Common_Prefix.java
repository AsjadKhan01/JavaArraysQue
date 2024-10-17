package Strings;

import java.util.Arrays;

public class Longest_Common_Prefix {
	static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "-1";

		// Sort the array of strings
		Arrays.sort(strs);

		// Get the first and last strings after sorting
		String first = strs[0];
		String last = strs[strs.length - 1];
		int minLength = Math.min(first.length(), last.length());

		int i = 0;
		// Find the common prefix between the first and last
		// strings
		while (i < minLength && first.charAt(i) == last.charAt(i)) {
			i++;
		}

		// Check if there's no common prefix
		if (i == 0)
			return "-1";

		// Return the common prefix
		return first.substring(0, i);
	}

	public static void main(String[] args) {
		String[] strs = { "geeksforgeeks", "geeks", "geek", "geezer" };
		System.out.println("The longest common prefix is: " + longestCommonPrefix(strs));
	}
}
