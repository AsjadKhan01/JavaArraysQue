package Arrays;

public class Max_Min_element {
	public static void main(String[] args) {

		int arr[] = {1,15,12,11,4, 9, 6, 3, 7, 10, 5,12,14,2,3 ,-1 ,-2 ,-6, -5};
		int max = arr[0];
		int min = arr[0]; // 4,
		int k = 1;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[k] && arr[i] >= max) {
				max = arr[i];
			}else {
				if(arr[k] >= max)
				max = arr[k];
			}
			
			if (arr[i] > arr[k] && arr[k] <= min) {
				min = arr[k];
			}
			k += 1;
		}
		System.out.println("Maximum num : " + max);
		System.out.println("Manimum num : " + min);

	}
}
