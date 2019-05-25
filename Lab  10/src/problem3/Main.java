package problem3;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
	public static double sum(Collection<? extends Number> nums) {
		double s = 0.0;
		for (Number num : nums)
			s += num.doubleValue();
		return s;
	}
public static void main(String[] args) {
	List<Integer>list= Arrays.asList(3,7,9);
	System.out.println(sum(list));
}
}
