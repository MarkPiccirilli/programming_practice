package zoo_proj;

public abstract class Animal {
	//data members
	private String name;
	private int age;
	private int weight;

	//constructor
	public Animal(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//getters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age; 
	}
	public int getWeight() {
		return weight;
	}

	//make sound function
	public abstract void makeSound(); 
}

