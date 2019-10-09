import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumDistanceTwoPairs {
	
	public static void main(String[] args) {
		int a[] = {3,3,2,1,1,2};
		System.out.println(minimumDistances(a));
		
	}

	// Complete the minimumDistances function below.
    static int minimumDistances(int[] a) {
    	int minDistance = -1;
       
    	List<Integer> list =  Arrays.stream(a).boxed().collect(Collectors.toList());
    	
    	
    	for(int i=0;i< list.size()-1;i++) {
    		
    		int lindex = list.lastIndexOf(list.get(i));
    		if(lindex!= -1 && lindex != i) {
    			int dist = Math.abs(lindex-i);
    			minDistance = minDistance == -1 ?  dist :(dist < minDistance ? dist : minDistance) ;
    			if(minDistance ==1) break;
    		}
    	}
    	
    	return minDistance;

    }
}
