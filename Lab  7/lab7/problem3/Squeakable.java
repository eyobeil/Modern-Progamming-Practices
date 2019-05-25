package problem3;

public interface Squeakable extends Quackable {

	default void quack() {
		// TODO Auto-generated method stub
		System.out.println("  squeaking");
	}

}
