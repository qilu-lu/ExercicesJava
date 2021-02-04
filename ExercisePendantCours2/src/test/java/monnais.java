import static org.junit.Assert.*;

import org.junit.Test;

public class monnais {

	@Test
	public void should_return_euro_when_passe_dollar() {

		assertEquals(1.2, ChangeMonnais.dollarToEuro(1.0), 0001);
	}

	@Test
	public void should_return_euro_when_passe_dollar2() {

		assertEquals(2.4, ChangeMonnais.dollarToEuro(2.0), 0001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_return_null_when_passe_nulldollar() {

		Double b = -1.;
		ChangeMonnais.dollarToEuro(b);
	}
	@Test
	public void should_return_dollars_when_passe_euro() {

		assertEquals(0.8, ChangeMonnais.EuroToDollar(1.0), 0001);
	}

	@Test
	public void should_return_dollars_when_passe_euro2() {

		assertEquals(1.6, ChangeMonnais.EuroToDollar(2.0), 0001);
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_return_null_when_passe_nulleuro() {

		Double b = -1.;
		ChangeMonnais.EuroToDollar(b);
	}
	@Test
	public void convertir() {

		assertEquals(1.6, ChangeMonnais.convertir("Dollar",2.0,"Euro"), 0001);
	}
}
