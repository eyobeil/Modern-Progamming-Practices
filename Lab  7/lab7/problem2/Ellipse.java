package problem2;

public class Ellipse implements ClosedCurve {
	private double a;
	private double E;

	public Ellipse(double a, double E) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.E = E;

	}

	public double getA() {
		return a;
	}

	public double getE() {
		return E;
	}

	@Override
	public double computePerimeter() {
		// TODO Auto-generated method stub
		return 4 * a * E;
	}
}
