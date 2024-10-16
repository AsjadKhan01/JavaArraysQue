package Sorting;

import java.util.Arrays;

public class Selection_sort {

	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();

		int[] arr = { 36, 19, 29, 12, 5 };
		System.out.println("Unsorted Array :: " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length - 1; j++) {
				if (arr[i] > arr[j + 1]) {
//swapping 
					arr[i] = arr[i] + arr[j + 1]; // 5=5+6 a=11
					arr[j + 1] = arr[i] - arr[j + 1]; // 6=11-6 b=5
					arr[i] = arr[i] - arr[j + 1]; // 11=11-5 a=6

//					int temp = arr[j + 1];
//					arr[j + 1] = arr[i];
//					arr[i] = temp;
				}
			}
			System.out.println("Sorting Array :: " + Arrays.toString(arr));
		}
		System.out.println(" Sorted Array :: " + Arrays.toString(arr));

		final long endTime = System.currentTimeMillis();
		System.out.println();
		System.out.println("Total execution time: " + (endTime - startTime));
	}
}
