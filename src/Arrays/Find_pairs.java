package Arrays;

public class Find_pairs {

	public static void main(String[] args) {
		
		int arr[] = {9,8,7,6,5,4,3,2,1,1,2,5,8,2,8};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]+arr[j]==10) {
					System.out.println("pair::"+"("+arr[i]+"+"+arr[j]+")");
					arr[j]=0;
					break;
				}
			}
		}
	}
}
