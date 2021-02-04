package composantMonnais;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmetiqueTest {
@Test
public void plus() {
	assertEquals(10, Arithmetique.arithmetique("plus",5,5));
}
@Test
public void moins() {
	assertEquals(0, Arithmetique.arithmetique("moins",5,5));
}
@Test
public void fois() {
	assertEquals(25, Arithmetique.arithmetique("fois",5,5));
}
@Test
public void divise() {
	assertEquals(1, Arithmetique.arithmetique("divise",5,5));
}@Test(expected = IllegalArgumentException.class) 
public void nullArithmetique() {
	Arithmetique.arithmetique("xxx",5,5);
}
}
