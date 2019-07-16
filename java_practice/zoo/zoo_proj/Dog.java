package zoo_proj;
public class Dog extends Animal {
	//constructor
	public Dog(String name,  int age, int weight) {
		super(name, age, weight);
	}

	//make sound
	public void makeSound() {
		System.out.println("ruff");
	}
}
