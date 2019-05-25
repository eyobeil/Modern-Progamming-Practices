package problem2C;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import problem2C.Product;

public class OneComparator {
	static enum sortMethod{ byTitle, byPrice};
	public void sort(List<Product >products, final sortMethod method) {
		class ProductComparator implements Comparator<Product>{

			@Override
			public int compare(Product p1, Product p2) {
				// TODO Auto-generated method stub
			if(method==sortMethod.byPrice) {
				if(p1.getPrice()==p2.getPrice()) return 0;
				else if(p1.getPrice()<p2.getPrice()) return -1;
				else return 0;
			}
			else {
				return p1.getTitle().compareTo(p2.getTitle());
			}
			}
			
		}
		Collections.sort(products, new ProductComparator());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> pros=Arrays.asList(new Product("TShirt",670.4,2017), new Product("IPhone",900.99,2018),new Product("Pants",300.99,2017)  );
		OneComparator com= new OneComparator();
		com.sort(pros,sortMethod.byTitle);
		System.out.println(pros);
		com.sort(pros,sortMethod.byPrice);
		System.out.println(pros);
	

	}

	

}
