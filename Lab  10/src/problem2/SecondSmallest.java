package problem2;

import java.util.Arrays;
import java.util.List;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(8, 3, 5, 1, 7, 2);
		System.out.println(findSecondSmallest(list));
	}

	public static <T extends Comparable<T>> T findSecondSmallest(List<T> list) {
		T min1 = list.get(0);
		T min2 = list.get(0);
		for (T t : list) {
			if (t.compareTo(min1) < 0) {
				min2 = min1;
				min1 = t;
			} else if (t.compareTo(min1) != 0 && t.compareTo(min2) < 0) {
				min2 = t;
			}
		}

		return min2;

	}
}
