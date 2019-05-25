package problem2A;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import problem2B.Product;
import problem2B.TitleComparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> pros=Arrays.asList(new Product("TShirt",670.4,2017), new Product("IPhone",900.99,2018),new Product("Pants",300.99,2017)  );
		PriceComparator com= new PriceComparator();
		TitleComparator title= new TitleComparator();
		Collections.sort(pros, com);
		System.out.println(pros);
		Collections.sort(pros, title);
		System.out.println(pros);
	

	}

}
