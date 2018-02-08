package aquarium;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GuestTest {

	@Test
	public void shouldBeReturnHappyLevel() {
		Guest guest = new Guest();
		guest.getHappiness();
		int happyLevel = guest.getHappiness();
		assertThat(happyLevel, is(50));
	}

	@Test
	public void shouldReturnGuessCount() {
		Guest guest = new Guest();
		guest.getGuestCount();
		int guestCount = guest.getGuestCount();
		assertThat(guestCount, is(100));
	}

	@Test
	public void shouldRemoveGuestFromCount() {
		Guest guest = new Guest();
		guest.removeGuest(5);
		int guestCount = guest.getGuestCount();
		assertThat(guestCount, is(95));

	}
}
