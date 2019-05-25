package lesson5.prog2;

final public class Circle implements Figure {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public double computeArea() {
		double area = Math.PI * radius * radius;
		return area;
	}

}
