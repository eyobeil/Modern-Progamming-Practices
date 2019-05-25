package problem3;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Cherries", "blums");

		fruits.forEach(s -> System.out.println(s ));

	}
}
