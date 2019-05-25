package problem2;

import java.util.function.Supplier;

public class MethodExpr {
	public static void main(String[] args) {
		Supplier<Double>sup=Math::random;
		System.out.println(sup.get());
	}

}
