package problem1day2;

import java.util.function.Predicate;

public class MyClass {
	private int num ;
	private String str ;
	public MyClass(int num, String str) {
		this.num = num;
		this.str= str;
	}
	Predicate<MyClass> p1 = this::equals;
	Predicate<MyClass> p2 = this::equals;
			//this::equals;
	public void myMethod(MyClass cl) {
		System.out.println("Is this instance equal to cl? " + p2.test(cl));
		System.out.println((this==cl));
	}
	
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		MyClass mc = (MyClass)ob;
		return mc.num == num && mc.str.equals(str);
	}

	public static void main(String[] args) {
		MyClass myclass = new MyClass(8, "Adam");
		myclass.myMethod(myclass);

	}
	
}
