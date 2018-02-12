package aquarium;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AquaticCreaturesTest {

	AquaticCreature underTest = new Shark("4321", "mister", "tiger");

	@Test
	public void shouldReturnName() {
		String name = underTest.getName();
		assertThat(name, is("mister"));

	}
	@Test
	public void shouldReturnMicroNumber() {
		String micro = underTest.getMicrochipNumber();
		assertThat(micro, is("4321"));
	}
	
	@Test
	public void shouldReturnColor() {
		String color = underTest.getColor();
		assertThat(color, is("tiger"));
	}
	
	@Test
	public void shouldReturnHungerLevel() {
		int hunger = underTest.getHungerLevel();
		assertThat(hunger, is(50));
	}
	@Test
	public void shouldReturnBoredomlevel() {
		int bored = underTest.getBoredomLevel();
		assertThat(bored, is(40));
	}
}
