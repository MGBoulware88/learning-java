
public class Car {
	public int gas = 10;
	
	public String getGasLevel() {
		String currentGasLevel = (String.valueOf(gas)) + "/10";
		return currentGasLevel;
	}
}
