package Strings;

import java.util.Arrays;

public class Isomorphic_string {
	public static void main(String[] args) {

		String str1 = "bab";
		String str2 = "nbn";

		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;

		for (int i = 0; i < s1.length - 1; i++) {
			if (s1[i] == s1[i + 1] && s2[i] == s2[i + 1]) {
				score1 += 1;
			}
			if (s1[i] == s1[i + 1]) {
				score2 += 1;
			}
			if (s2[i] == s2[i + 1]) {
				score3 += 1;
			}
		}
		if ((score1 == score2) && (score2 == score3)) {
			System.out.println(true);
		} else {
			System.err.println(false);
		}
	}
}
