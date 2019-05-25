package prob1_B;

public class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(this.getClass() == obj.getClass()))
			return false;
		Employee employee = (Employee) obj;
		return this.name.equals(employee.name) && this.salary == employee.salary;
	}

//  equals(Employee e): the Arguement is Wrong.It should be a Object,not the class type.	
//	public boolean equals(Employee e) {
//		return e.name.equals(name) && e.salary == salary;
//	}

}
