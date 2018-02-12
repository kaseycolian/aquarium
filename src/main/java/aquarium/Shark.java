package aquarium;

public class Shark extends AquaticCreature {
	static final int DEFAULT_DESIRETOFLY = 30;
	private int desireToFly = DEFAULT_DESIRETOFLY;

	public Shark(String microchipNumber, String name, String color) {
		this.microchipNumber = microchipNumber;
		this.name = name;
		this.color = color;
	}

	public int getDesireToFly() {
		return desireToFly;
	}

}
