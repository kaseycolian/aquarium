package aquarium;

public class Shark extends AquaticCreature {
	static final int DEFAULT_SHARKS = 30;
	private int sharkCount = DEFAULT_SHARKS;

	public Shark(String microchipNumber, String name, String color) {
		this.microchipNumber = microchipNumber;
		this.name = name;
		this.color = color;
	}

	public void killGuest(Guest guest) {
		guest.removeGuest(5);

	}

	public int getSharkCount() {
		return sharkCount;
	}

}
