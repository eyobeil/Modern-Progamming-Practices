package problem3;

import java.util.Arrays;
import java.util.List;

public class MethodRef {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");

		fruits.forEach(System.out::println);

	}
}