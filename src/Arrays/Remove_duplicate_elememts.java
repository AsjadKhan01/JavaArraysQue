package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_duplicate_elememts {

	private static int[] removeElement(int[] arr, int removeLength) {
		int newArr[] = new int[arr.length - removeLength];
		int temp = 0;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (temp != arr[i]) {
				newArr[j++] = arr[i];
			}
			temp = arr[i];
		}
		return newArr;
	}

	public static void main(String args[]) {

		int[] arr = { 1, 9, 2, 1, 3, 4, 5, 5, 4, 3 };

		// sorted array
		Arrays.sort(arr);
		System.out.println("Sorted Array " + Arrays.toString(arr));
		int removeLength = 0;

		// Counting removable length
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == (2 * arr[i])) {
					removeLength += 1;
				}
			}
		}
		int[] newArray = removeElement(arr, removeLength);
		System.out.println("Unique Array " + Arrays.toString(newArray));
	}
}