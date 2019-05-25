package problem6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Union {
	public static final Set<String> EMPTY_SET = new HashSet<String>();

	public Set<String> union(List<Set<String>> sets) {
		return sets.stream().reduce(EMPTY_SET, (s, t) -> {
			s.addAll(t);
			return s;
		});
	}

	public static void main(String[] args) {
		Union u = new Union();
		Set<String> set1 = new HashSet<>();
		set1.add("A");
		set1.add("B");
		Set<String> set2 = new HashSet<>();
		set2.add("D");
		Set<String> set3 = new HashSet<>();
		set3.add("1");
		set3.add("3");
		set3.add("5");
		List<Set<String>> list = new ArrayList<>();
		list.add(set1);
		list.add(set2);
		list.add(set3);
		System.out.println(u.union(list));

	}

}
