import java.util.Arrays;

public class PrintPairsOfSum {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 3,7, -1, 5,-3,3,9 }; 
        int n = arr.length; 
        int sum = 6; 
        printPairs(arr, n, sum);
	}

	private static void printPairs(int[] arr, int n, int sum) {
		
		Arrays.sort(arr);
		Arrays.stream(arr).forEach(System.out::print);
		
		for(int i=0;i<arr.length&& arr[i]<=sum/2;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum)
					System.out.print("("+arr[i]+" , "+arr[j]+")");
			}
		}
		
	}
}
