package lesson5.prog2;

import java.util.ArrayList;

public class Main {

	static private ArrayList<Figure> list;

	public static void main(String[] args) {

		list = new ArrayList<Figure>();
		list.add(new Rectangle(5, 6));
		list.add(new Circle(3));
		list.add(new Triangle(7, 9));

		double sumAreas = 0.0;

		for (int i = 0; i < list.size(); i++) {
			sumAreas += list.get(i).computeArea();
		}
		System.out.println("Sum of all areas:" + sumAreas);
	}

}
