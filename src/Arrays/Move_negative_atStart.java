package Arrays;

public class Move_negative_atStart {
	public static void main(String[] args) {
		int arr[] = { 12, 11, -13, -5, 6, -7, 5 ,-6};

		int j = 0;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) {
				// swap
				int temp=0;
				temp = arr[index];
				arr[index]=arr[i];
				arr[i] = temp;
				
				index++;
			}
		}
		for (int a : arr) {
			System.out.print(a + ",");
		}
	}
}
