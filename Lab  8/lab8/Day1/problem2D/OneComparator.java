package problem2D;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import problem2C.Product;

public class OneComparator {
	static enum sortMethod {
		byTitle, byPrice
	};

	public void sort(List<Product> products, final sortMethod method) {
		Collections.sort(products, (p1, p2) -> {
			if (method == sortMethod.byTitle) {
				if (p1.getTitle().compareTo(p2.getTitle()) != 0)
					return p1.getTitle().compareTo(p2.getTitle());
				else
					return 0;
			}

			else {
				if (p1.getPrice() == p2.getPrice())
					return 0;
				else if (p1.getPrice() < p2.getPrice())
					return -1;
				else
					return 0;
			}
		});

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> pros = Arrays.asList(new Product("TShirt", 670.4, 2017), new Product("IPhone", 900.99, 2018),
				new Product("Pants", 300.99, 2017));
		OneComparator com = new OneComparator();
		com.sort(pros, sortMethod.byTitle);
		System.out.println(pros);
		com.sort(pros, sortMethod.byPrice);
		System.out.println(pros);

	}

}
