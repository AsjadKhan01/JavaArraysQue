package Arrays;

public class Find_pairs {

	public static void main(String[] args) {
		
		int arr[] = {7,8,9,7,8,1,2,3};
		
		for(int i=0; i<arr.length; i++) {
		    for(int j=i; j<arr.length; j++) {
		    	if(arr[i]+arr[j]==10) {
		    		System.out.print(" ("+arr[i]+","+arr[j]+") ");
		    		arr[j]=0;
		    	}
		    }
		}
	}
}
