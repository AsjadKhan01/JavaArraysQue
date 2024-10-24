package Arrays;

public class Occurances {
	public static void main(String[] args) {

		int arr[] = {1,1,2,2,3,2,2,4};
		int x=4;
		int count =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				count++;
			}
		}
		System.out.println(x+" Occurs "+count+" times");
	}
}
