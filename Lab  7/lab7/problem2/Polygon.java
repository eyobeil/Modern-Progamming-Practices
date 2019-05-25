package problem2;

public interface Polygon extends ClosedCurve {
	double[] getSides();

	default double computePerimeter() {
		double sum = 0.0;
		for (int i = 0; i < getSides().length; i++) {
			sum += getSides()[i];
		}
		return sum;

	}

}
