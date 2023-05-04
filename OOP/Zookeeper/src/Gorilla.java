
public class Gorilla extends Mammal {
	public void throwSomething(String item) {
		this.energyLevel -= 5;
		System.out.println("The gorilla threw a " + item + " at innocent bystanders!");
	}
	
	public void eatBananas() {
		this.energyLevel += 10;
		System.out.println("The gorilla ate some bananas and smiled!");
	}
	
	public void climb() {
		this.energyLevel -= 10;
		System.out.println("The gorilla climbed a tree for some reason (probably looking for bananas)!");
	}
}
