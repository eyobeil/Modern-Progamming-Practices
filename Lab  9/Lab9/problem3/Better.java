package problem3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Better {

	final Function<String, Predicate<String>> startsWithLetter = letter -> name -> name.startsWith(letter);
	final Function<String, Predicate<String>> NotstartsWithLetter = letter -> name -> !name.startsWith(letter);
	final Function<Integer, Predicate<String>> equalsLength1 = len -> name -> name.length() == len);

	public int countWords(List<String> words, char c, char d, int len) {

		final int wordsStartC = (int) words.stream().filter(startsWithLetter.apply("" + c)).count();
		final int wordsNotStartD = (int) words.stream().filter(NotstartsWithLetter.apply("" + d)).count();
		final int equalsLength = (int) words.stream().filter(equalsLength1.apply(len)).count();

		return wordsStartC + wordsNotStartD + equalsLength;

	}
	public static void main(String[] args) {
		Better better= new Better();
		List<String> words = Arrays.asList("cat", "coat", "come", "dog", "hotel", "door", "student", "hot", "hat",
				"calf");

		System.out.println(better.countWords(words, 'd', 'c', 4));

		System.out.println(better.countWords(words, 'h', 'c', 3));
	}
}