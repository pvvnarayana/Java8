import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseList {

	public static void main(String[] args) {
		 List<Integer> lists = Arrays.asList(11, 22, 33, 44); 
		 
		// Collections.reverse(lists);
		// System.out.println(lists);
		 
		 lists.stream().collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
			 Collections.reverse(list);
			 return list.stream();
		 })).forEach(System.out::println);;
		 
		 lists.stream().collect(Collectors.toCollection(LinkedList::new))
		 				.descendingIterator()
		 				.forEachRemaining(System.out::println);
		 
		 
	}
}
