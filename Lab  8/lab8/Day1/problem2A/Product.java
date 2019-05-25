package problem2A;


public class Product {
	final String title;
	final double price;
	final int model;

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}

	public int getModel() {
		return model;
	}

	public Product(String title, Double price, int model) {
		this.title = title;
		this.price = price;
		this.model = model;
	}

	@Override
	public String toString() {
		return String.format("\n %s : %s : %s", title, price, model);
	}
	@Override
	public boolean equals(Object ob) {
		if(ob==null) return false;
		if(!(ob.getClass().equals(getClass())))  return false;
		Product pro=(Product)ob;
		return pro.getPrice()==price;
		}
}
