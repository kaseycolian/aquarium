package aquarium;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PenguinTest {

	AquaticCreature underTest = new Penguin("1234", "Chubs", "Orange");

	@Test
	public void shouldReturnName() {
		String name = underTest.getName();
		assertThat(name, is("Chubs"));
	}

	@Test
	public void shouldReturnMicrochipNumber() {
		String micro = underTest.getMicrochipNumber();
		assertThat(micro, is("1234"));
	}

	@Test
	public void shouldReturnColor() {
		String color = underTest.getColor();
		assertThat(color, is("Orange"));
	}

	@Test
	public void shouldReturnHungerLevel() {
		int hunger = underTest.getHungerLevel();
		assertEquals(hunger, 50);
	}

	@Test
	public void shouldReturnBoredomLevel() {
		int bored = underTest.getBoredomLevel();
		assertEquals(bored, 40);
	}
}
