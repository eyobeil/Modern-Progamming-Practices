package lesson5.prog2;

final public class Triangle implements Figure {
	private double base;
	private double height;

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	

	@Override
	public double computeArea() {

		double area = 1 / 2 * base * height;
		return area;
	}

	

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

}
