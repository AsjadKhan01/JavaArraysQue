package Arrays;

import java.util.Arrays;

public class Segregets_0s_and_01 {

	public static int[] segregets(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == 1) {
					// swap
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 0, 1, 1, 0, 0, 1 };

		System.out.println(Arrays.toString(arr));

		int[] segregets = segregets(arr);
		System.out.println(Arrays.toString(segregets));
	}
}
