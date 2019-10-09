import java.util.stream.Stream;

public class NullStream {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of(null);
		stream.forEach(System.out::print);
		
	}
}
