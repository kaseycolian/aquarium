package aquarium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SharkTest {
	Shark underTest = new Shark("1111", "Fin", "Grey");

	@Test
	public void shouldReturnMicrochipNumber() {
		String microchipNumber = underTest.getMicrochipNumber();
		assertEquals(microchipNumber, "1111");
	}

	@Test
	public void shouldReturnName() {
		String name = underTest.getName();
		assertEquals(name, "Fin");
	}

	@Test
	public void shouldReturnColor() {
		String color = underTest.getColor();
		assertEquals(color, "Grey");

	}
}
