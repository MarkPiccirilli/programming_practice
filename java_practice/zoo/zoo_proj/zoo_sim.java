package zoo_proj;

public class zoo_sim {
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
