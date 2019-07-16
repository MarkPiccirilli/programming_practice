//full zoo sim program

//Animal Class
abstract class Animal {

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

//cat class inherits from Animal
class Cat extends Animal {
	//constructor
	public Cat(String name,  int age, int weight) {
		super(name, age, weight);
	}

	//make sound
	public void makeSound() {
		System.out.println("Meow");
	}
}

//Dog class inherits from Animal
class Dog extends Animal {
	//constructor
	public Dog(String name,  int age, int weight) {
		super(name, age, weight);
	}

	//make sound
	public void makeSound() {
		System.out.println("ruff");
	}
}

//Pig class inherits from Animal
class Pig extends Animal {
	//constructor
	public Pig(String name,  int age, int weight) {
		super(name, age, weight);
	}

	//make sound
	public void makeSound() {
		System.out.println("oink");
	}
}

public class zoo_sim_all {
	public static void main(String args[]) {
		//create and allocate animal array
		Animal animalArray[] = new Animal[3]; 

		//and Leo to animal array
		Animal Leo = new Cat("Leo", 4, 13);
		animalArray[0] = Leo;

		//add Crixus to animal array
		Animal Crixus = new Dog("Crixus", 5, 50);
		animalArray[1] = Crixus;

		//add Peter to animal array
		Animal Peter = new Pig("Peter", 3, 100);
		animalArray[2] = Peter;

		//c style for loop
		for(int i = 0; i < animalArray.length; i++) {
			System.out.print(animalArray[i].getName() + " is " + animalArray[i].getAge() + " years old and says ");
			animalArray[i].makeSound();
		}
		
		//print line in between
		System.out.println();

		//for each style for loop 
		for(Animal i : animalArray) {
			System.out.print(i.getName() + " weighs " + i.getWeight() + " pounds and says ");
			i.makeSound();
		}
	}
}
