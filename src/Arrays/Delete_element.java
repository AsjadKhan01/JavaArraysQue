package Arrays;

public class Delete_element {

	public static int[] removeElem(int[] arr, int dltIndex) {

		int anotherArray[] = new int[arr.length - 1];

		for (int i = 0; i < anotherArray.length; i++) {
			if (i >= dltIndex) {
				anotherArray[i] = arr[i + 1];
			} else {
				anotherArray[i] = arr[i];
			}
		}
		return anotherArray;
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 5, 7, 9, 2 };
		int[] removeElem = removeElem(arr, 1);
		//print new array
		for(int i=0; i<removeElem.length; i++) {
			System.out.print(removeElem[i]+",");
		}

	}
}
