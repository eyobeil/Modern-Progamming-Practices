package problem1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stringsStream =Stream.of("Bill","Thomas","Mary");
		System.out.println(stringsStream.collect(Collectors.joining(",")));

	}

}
