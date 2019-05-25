package lesson3.prob4;

public class Driver {
	public static void main(String[] args) {

		Property[] objects = { new House(9000), new Condo(2), 
				new Trailer(new Address("7K taste of Utopia", "Fairfield", "IA", "52557")) };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}

}
