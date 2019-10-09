import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MapFlatMap {

	public static void main(String[] args) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();
		Collections.addAll(list1, 1,2,3,4,5,6);
		Collections.addAll(list2, 11,12,13,14,15,16);
		Collections.addAll(list3, 21,22,23,24,25,26);
		Collections.addAll(list4, 31,32,33,34,35,36);
		Collections.addAll(lists, list1,list2,list3,list4);
		
		lists.stream().flatMap(e -> e.stream()).peek(e -> System.out.println("e : "+e)).filter(n -> n%2==0).forEach(System.out::println);
		
	}
}
