package Strings;

public class Closest_String {
	public static void main(String[] args) {

		String str[] = { "my", "name", "is", "peter", "parker" };

		String word2 = "parker";
		String word1 = "name";
		int indexOf1 = 0;
		int indexOf2 = 0;

		for (int i = 0; i < str.length; i++) {
			String matcher = str[i];
			System.out.print(matcher + " ");

			if (matcher.equals(word1)) {
				indexOf1 = i;
			}
			if (matcher.equals(word2)) {
				indexOf2 = i;
			}
		}
		System.out.println(indexOf1 + " " + indexOf2);

		if (indexOf1 > indexOf2)
			System.out
					.println("Minimum Distance between [" + word1 + "] & [" + word2 + "] : " + (indexOf1 - (indexOf2 + 1)));
		else
			System.out
					.println("Minimum Distance between [" + word1 + "] & [" + word2 + "] : " + (indexOf2 - (indexOf1 + 1)));
	}
}
