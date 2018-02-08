package aquarium;

public class Shark {
	private String name;
	private String microchipNumber;
	private String color;

	public Shark(String microchipNumber, String name, String color) {
		this.microchipNumber = microchipNumber;
		this.name = name;
		this.color = color;
	}
//will pull into AquaticCreature Interface
	public String getMicrochipNumber() {
		return microchipNumber;
	}
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}




	
	

	

}
