package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Remove_duplicate_elememts {

	public static int[] duplicate(int arr[], int removel) {

		int[] newArray = new int[arr.length - removel];
		for (int i = 0; i < arr.length; i++) {
			for (int j=i+1; j < arr.length; j++) {

				if(arr[i] == arr[j]) {
					System.out.print(arr[i]);
				}
			}
		}

		return newArray;
	}

	public static int[] sortArray(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i; j<arr.length;j++) {
				
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = { 9, 2, 1, 3, 4, 5, 5, 4, 3 };

		System.out.println("Old Array :: " + Arrays.toString(arr));

		int removeLength = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					removeLength = removeLength + 1;
//					System.out.print(arr[i]);
				}
			}
		}
		int[] duplicate = duplicate(arr, removeLength);
		System.out.println("Sorted Array :: "+ Arrays.toString(arr));
		System.out.println("New Array :: " + Arrays.toString(duplicate));
	}
}
