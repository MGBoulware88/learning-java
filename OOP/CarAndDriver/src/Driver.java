
public class Driver extends Car {
	public void driveCar(Car car) {
		car.gas -= 1;
		System.out.println("You drive the car.");
		System.out.println("Gas remaining: " + car.getGasLevel());
	}
	
	public void boostCar(Car car) {
		if (car.gas >= 3) {
			car.gas -= 3;
			System.out.println("You boost the car.");
			System.out.println("Gas remaining: " + car.getGasLevel());
			
		} else System.out.println("Not enough fuel!");
	}
	
	public void refuelCar(Car car) {
		if (car.gas <= 8) {
			car.gas += 2;
			System.out.println("You refuel the car.");
			System.out.println("Gas remaining: " + car.getGasLevel());
			
		} else System.out.println("Your car can't hold more fuel!");
	}
}
