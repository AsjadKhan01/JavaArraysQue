package Arrays;

public class Find_common_elemnts {
	public static void main(String[] args) {
	
		int arr1[]= {10,20,80,90,70,60,50};
		int arr2[]= {20,30,40,90};
		int arr3[]= {60,30,20,40,90};

		//fist find common element from array 1 and 2 then output compare with third 3rd array 
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				for(int k=0; k<arr3.length; k++) {
					
					if(arr1[i]==arr2[j]) {
						if(arr1[i]==arr3[k]) {
							System.out.print(arr3[k]+",");
						}
					}
				}
				
//				if(arr1[i]==arr2[j]) {
//					System.out.print(arr2[j]+",");
//				}
			}
		}
	}
}
