package composantMonnais;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComposantBancaireTest {

	@Test
	public void testdepot() {
		assertEquals(5500, CompteBancaire.operation("depot",500,5000));
	}
	@Test
	public void testretrait() {
		assertEquals(4500, CompteBancaire.operation("retrait",500,5000));
	}
	@Test(expected = IllegalArgumentException.class) 
	public void testnull() {
	 CompteBancaire.operation("xxx",500,5000);
	}
}
