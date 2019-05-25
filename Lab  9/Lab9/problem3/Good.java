package problem3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public int countWords(List<String> words, char c, char d, int len) {
		words.stream().filter(w->w.startsWith(""+c)).
		filter(w->!w.startsWith(""+c)).
		filter(w->w.length()==len).count();
		
		return countWordWithCharacters(words,""+c)
				+ countWordWithNoCharacters(words,""+d) + 
				countWordWithSpecifiedLength(words, len);
	}

	public int countWordWithCharacters(List<String> words, String letter) {
		return (int) words.stream().filter(w -> w.startsWith(letter)).count();
	}

	public int countWordWithNoCharacters(List<String> words, String letter) {
		return (int) words.stream().filter(w -> !w.startsWith(letter)).count();
	}

	public int countWordWithSpecifiedLength(List<String> words, int len) {
		return (int) words.stream().filter(w -> w.length() == len).count();
	}

	public static void main(final String[] args) {
		Good good = new Good();
		List<String> words = Arrays.asList("cat", "coat", "come", "dog", "hotel", "door", "student", "hot", "hat",
				"calf");

		System.out.println(good.countWords(words, 'c', 'd', 4));

		System.out.println(good.countWords(words, 'h', 'c', 4));
	}

}
