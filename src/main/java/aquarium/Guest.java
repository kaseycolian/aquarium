package aquarium;

public class Guest {
	static final int DEFAULT_HAPPY = 50;
	static final int DEFAULT_GUESTCOUNT = 100;
	
	private int happyLevel = DEFAULT_HAPPY;
	private int guestCount = DEFAULT_GUESTCOUNT;

	public int getHappiness() {
		
		return happyLevel;
	}
	public void giveHappiness(int amount){
		happyLevel =+amount;
		
	}
	public int getGuestCount() {
		return guestCount;
		
		
	}
	public void removeGuest(int numberToRemove) {
		guestCount -= numberToRemove;
		
	}

}
