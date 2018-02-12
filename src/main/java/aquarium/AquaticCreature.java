package aquarium;

public abstract class AquaticCreature {
	static final int DEFAULT_HUNGERLEVEL = 50;
	static final int DEFAULT_BOREDOMLEVEL = 40;
	private int hungerLevel = DEFAULT_HUNGERLEVEL;

	private int boredomLevel = DEFAULT_BOREDOMLEVEL;
	protected String name;
	protected String microchipNumber;
	protected String color;

	public AquaticCreature(String microchipNumber, String name, String color) {
		this.microchipNumber = microchipNumber;
		this.name = name;
		this.color = color;
	}

	public AquaticCreature() {
		super();
	}

	public String getMicrochipNumber() {
		return microchipNumber;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getHungerLevel() {
		return hungerLevel;
	}

	public int getBoredomLevel() {
		return boredomLevel;
	}

}