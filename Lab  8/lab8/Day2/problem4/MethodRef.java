package problem4;

import java.util.Arrays;

public class MethodRef {

	public static void main(String[] args) {

		String[] names = { "Alexis", "Tim", "Kyleen", "KRISTY" };
		Arrays.sort(names, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(names));

	}

}
