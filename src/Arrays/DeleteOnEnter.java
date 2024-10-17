package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteOnEnter {
	static int[] deleteOnIndex(int arr[], int dltIndex) {

		// Delete on index or fill numbers in new array
		int arrNew[] = new int[arr.length - 1];
		for (int i = 0; i < arrNew.length; i++) {
			if (i < dltIndex) {
				arrNew[i] = arr[i];
			} else {
				arrNew[i] = arr[i + 1];
			}
		}
		return arrNew;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 1, 3, 4, 5, 7 };
		System.out.print(Arrays.toString(arr));
		int num;
		// insert number by user
		while (arr.length > 0) {
			num = sc.nextInt();

			// Checking number on index in array
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == num) {
					int NewArray[] = deleteOnIndex(arr, i);
					System.out.print(Arrays.toString(NewArray));
					arr = NewArray;
				}
			}
		}
	}
}
