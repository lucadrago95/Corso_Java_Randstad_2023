
public class SuperCar extends Car{

	private int maxSpeed;
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public SuperCar(String marca, String modello, int annoModello, String colore, int maxSpeed) {
		super(marca, modello, annoModello, colore);
		
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public void stampaInfo() {
		super.stampaInfo();
		System.out.println("MaxSpeed: " + getMaxSpeed());
	}
	
	public void brumBrum() {
		System.out.println("Io sono velocità! Vado a " + getMaxSpeed() + "km/h");
	}
}