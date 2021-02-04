package composantMonnais;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class PalindromeCheckTest {

	private PalindromeCheck palindromeCheck = new PalindromeCheck();
	
	@Test
	public void shouldTellANullStringIsNotPalindrome() {
		assertFalse(palindromeCheck.estPalindrome(null));
	}
	
	@Test
	public void shouldTellAnEmptyStringIsPalindrome() {
		assertTrue(palindromeCheck.estPalindrome(""));
	}
	
	@Test
	public void shouldTellABlankStringIsPalindrome() {
		assertTrue(palindromeCheck.estPalindrome("     "));
	}
	
	@Test
	public void shouldTellAPalindromeStringIsPalindrome() {
		assertTrue(palindromeCheck.estPalindrome("KAYAK"));
	}
	@Test
	public void shouldTellAPalindromeStringIsPalindrome2() {
		assertTrue(palindromeCheck.estPalindrome("KAYYAK"));
	}
	
	@Test
	public void shouldTellANonPalindromeStringIsNotPalindrome() {
		assertFalse(palindromeCheck.estPalindrome("ABC"));
	}
}
