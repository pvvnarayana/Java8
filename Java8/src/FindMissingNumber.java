import java.util.Arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {5,4,1,4,3,9,33}  ;
		findMissingNumber(arr);
	}

	private static void findMissingNumber(int[] arr) {
		
		Arrays.sort(arr);
		int prevNumber = arr[0];

		for(int i=1;i<arr.length;i++) {
			int d = arr[i]-prevNumber;
			for(int k=1;k<d;k++) {
				System.out.println(prevNumber+k);
			}
			prevNumber = arr[i];
		}
		
	}
	
}
