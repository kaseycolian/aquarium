package aquarium;
//WILL MAKE THIS INTO THE AQUARIUM CLASS, DON'T NEED GUESTS AS OBJECTS, JUST DOING OVERALL GUEST 
public class Guest {
	static final int DEFAULT_HAPPY = 50;
	static final int DEFAULT_GUESTCOUNT = 100;
	
	private int happyLevel = DEFAULT_HAPPY;
	private int guestCount = DEFAULT_GUESTCOUNT;

	public int getHappiness() {
		
		return happyLevel;
	}
	public void giveHappiness(){
		happyLevel =+5;
		
	}
	public int getGuestCount() {
		return guestCount;
		
		
	}
	public void removeGuest(int amount) {
		guestCount -= amount;
		
	}

}
