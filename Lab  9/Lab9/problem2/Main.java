package problem2;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Stream<Integer> myIntStream = Stream.of(21, 4, 7, 15, 19, 23);
		IntSummaryStatistics summary = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println("max=" + summary.getMax() + "\n"+ "min= " + summary.getMin());

	}
}
