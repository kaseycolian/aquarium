package aquarium;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SharkTest {
@Test
public void shouldReturnMicrochipNumber() {
Shark underTest = new Shark("1111", "Fin", "Grey");
String microchipNumber =underTest.getMicrochipNumber();
assertEquals(microchipNumber, "1111");
}
@Test
public void shouldReturnName() {
	Shark underTest = new Shark ("1111", "Fin", "Grey");
	String name = underTest.getName();
	assertEquals(name, "Fin");
}

@Test
public void shouldReturnColor() {
	Shark underTest = new Shark ("1111", "Fin", "Grey");
	String color = underTest.getColor();
	assertEquals(color, "Grey");
	
}
}
