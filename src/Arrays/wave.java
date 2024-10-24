package Arrays;

import java.util.Arrays;

public class wave {
	public static void main(String[] args) {
		int arr[] = { 20, 10, 8, 6, 4, 2, 9 };

		Arrays.sort(arr);
		System.out.print("Input: ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int i = 0; i < (arr.length - 1); i += 2) {

			// swap
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
		System.out.print("Wave : ");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
}
