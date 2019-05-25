package lesson3.prob4;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double sumtotalRent = 0.0;
		for(Property p: properties) {
			sumtotalRent += p.computeRent();
		}
		return sumtotalRent;
	}

}
