
public class Bat extends Mammal {
	int energyLevel = 300;
	
	public void fly() {
		System.out.println("Kreee");
		this.energyLevel -= 50;
	}
	
	public void eatHumans() {
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("AHHHHHHHHHHHH");
		this.energyLevel -= 100;
	}
}
