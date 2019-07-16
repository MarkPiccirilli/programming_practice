package zoo_proj;
public class Pig extends Animal {
	//constructor
	public Pig(String name,  int age, int weight) {
		super(name, age, weight);
	}

	//make sound
	public void makeSound() {
		System.out.println("oink");
	}
}
