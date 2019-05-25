package problem3;

public interface Flyable {
	default void fly() {
		System.out.println("  Fly with wings");
	}

}
