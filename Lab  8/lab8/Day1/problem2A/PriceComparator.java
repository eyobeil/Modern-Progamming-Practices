package problem2A;

import java.util.Comparator;

import problem2B.Product;

public class PriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		if (p1.getPrice() != p2.getPrice()) {
		if (p1.getPrice() < p2.getPrice())
			return -1;
		else
			return 1;
	   }
		else if (!p1.getTitle().equals(p2.getTitle())) {
			return p1.getTitle().compareTo(p2.getTitle());
		}
		else {
			if (p1.getModel()==p2.getModel()) return 0;
			else if(p1.getModel()<p2.getModel()) return -1;
			else return 1;
	
			
			
			}
		}
	

}
