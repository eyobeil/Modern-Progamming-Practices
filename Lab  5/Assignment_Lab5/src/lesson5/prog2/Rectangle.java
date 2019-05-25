package lesson5.prog2;

final public class Rectangle implements Figure {
	private double width;
	private double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}


	@Override
	public double computeArea() {
		double area = width * length;
		return area;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

}
