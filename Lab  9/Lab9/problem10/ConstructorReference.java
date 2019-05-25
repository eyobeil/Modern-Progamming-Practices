package problem10;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only Female canditates names
	System.out.println(Stream.of(list).filter((Human h)->h.getGender().equals("Female")).map((Human h)->h.getName()).
	collect(Collectors.joining(",")));

    // Query 2 : Create an object by choosing suitable Interface to the specified constructors
	//(Totally 3 constructors)using fourth type of Method Reference ClassName::new. 
	//Then print the object status 
	TriFunction<String,Integer,String,Human> myTriFunc =Human::new;
	BiFunction<String,Integer,Human>myBiFunc=Human::new;
	Function<String,Human> myFunc=Human::new;
	System.out.println(myFunc.apply("Adam"));
	System.out.println(myBiFunc.apply("Joseph", 21));
	System.out.println(myTriFunc.apply("Hellen", 22, "Female"));
 
	// Query 3 : Count the male candidates whose age is more than 30
    System.out.println(Stream.of(list).filter((Human h)->h.getAge()>30).count());
    
    
   }



}
