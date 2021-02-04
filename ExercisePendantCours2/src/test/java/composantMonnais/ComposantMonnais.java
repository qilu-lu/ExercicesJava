package composantMonnais;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComposantMonnais {
	@Test
	public void cents_composer_juste_by_1cent() {
		assertEquals(100, ComosantMonnaie.only1(100));
	}

	@Test
	public void cents_composer_juste_by_5cent() {
		assertEquals(20, ComosantMonnaie.only5(100));
	}

	@Test
	public void cents_composer_by_1cent_and_2cent() {
		assertEquals(20, ComosantMonnaie.only1and2(100));
	}
}
