package prob1_D;


final public class Employee {
	
private final String name;
	
private final int salary;
	
private final boolean visited = false;


public Employee(String name, int salary) {
		
this.name = name;
		
this.salary = salary;
	}

	
public String getName() {
		
return name;
	}

	
public int getSalary() {
		
return salary;
	}

	
public boolean isVisited() {
		
return visited;
	}

	
@Override
	
public String toString()
 {
		
return "(" + name + ", " + salary + ")";
	
}

	
@Override
	
public boolean equals(Object ob) {
		
if (ob == null)
			
return false;
		
if (!(ob instanceof Employee))
			
return false;
		
Employee emp = (Employee) ob;
		
return emp.name.equals(name) && emp.salary == salary && emp.visited == visited;
	}

	@Override

public int hashCode() {
		
int result = 17;
		
long longval = Double.doubleToLongBits(salary);
		
int salaryHash = (int) (longval ^ (longval >>> 32));
		
result += 31 * result + name.hashCode();
		
result += 31 * result + salaryHash;
		
result += 31 * result + (visited ? 1 : 0);
		
return result;
	}
}
