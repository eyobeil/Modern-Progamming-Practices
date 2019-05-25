package problem7b;

import java.util.List;
import java.util.stream.Collectors;

import javax.swing.text.GapContent;

public class LambdaLibrary {
	public static final TriFunction<List<Employee>, Integer, Character, String> NAME=
			(emps,salaryBound,letter)->emps.stream()//
									  .filter(e->(e.getSalary()>salaryBound))//
									  .filter(e->(e.getLastName().charAt(0)>letter))//
									  .map(e->e.firstName+" "+e.lastName)//
									  .sorted()
									  .collect(Collectors.joining(","));

}