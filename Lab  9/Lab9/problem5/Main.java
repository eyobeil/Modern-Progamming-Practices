package problem5;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
	static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.skip(m).limit(n+1-m);
	}
	private static Stream<String> nextStream() {
		return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
		"iii").stream();
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  streamSection(nextStream(),4,5).forEach(System.out::println);
	  System.out.println("-----------------------------");
	  streamSection(nextStream(),3,5).forEach(System.out::println);
	  System.out.println("----------------------------");
	  streamSection(nextStream(),1,5).forEach(System.out::println);

	}

}
