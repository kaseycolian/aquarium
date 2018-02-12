package aquarium;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GuestTest {
	Guest underTest = new Guest();

	@Test
	public void shouldBeReturnHappyLevel() {
		underTest.getHappiness();
		int happyLevel = underTest.getHappiness();
		assertThat(happyLevel, is(50));
	}
	@Test
	public void shouldMakeGuestsMoreHappy() {
	int happyBefore = underTest.getHappiness();
	underTest.giveHappiness();
	int happyAfter = underTest.getHappiness();
	assertEquals(happy - happyBefore, is (89));
	
	}
	
	@Test
	public void shouldReturnGuestCount() {
		underTest.getGuestCount();
		int guestCount = underTest.getGuestCount();
		assertThat(guestCount, is(100));
	}

	@Test
	public void shouldRemoveGuestFromCount() {
		underTest.removeGuest(5);
		int guestCount = underTest.getGuestCount();
		assertThat(guestCount, is(95));

	}
}
