package zoo_proj;
public class Cat extends Animal {
	//constructor
	public Cat(String name,  int age, int weight) {
		super(name, age, weight);
	}

	//make sound
	public void makeSound() {
		System.out.println("Meow");
	}
}
