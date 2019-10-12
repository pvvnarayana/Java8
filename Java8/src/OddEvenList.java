import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddEvenList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		Collections.addAll(list, 4,2,6,7,1,5,3,8,9);
		
		Stream.concat(
				list.stream().filter(e->e%2!=0).sorted(),
				list.stream().filter(e->e%2==0).sorted()
				).collect(Collectors.toList()).forEach(System.out::print);
		
	}
}
