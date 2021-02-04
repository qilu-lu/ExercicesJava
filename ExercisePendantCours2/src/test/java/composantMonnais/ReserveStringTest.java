package composantMonnais;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReserveStringTest {
	@Test(expected = IllegalArgumentException.class )
	public void shouldreturn_null() {
		ReverseString.reverse(null);
	}
	@Test
	public void shouldreturn_empty() {
		String excepted="";
		assertEquals(excepted, ReverseString.reverse(""));
	}
	@Test
	public void shouldreturn_string() {
		String excepted="abc";
		assertEquals(excepted, ReverseString.reverse("cba"));
	}@Test
	public void shouldreturn_string2() {
		String excepted="abcd";
		assertEquals(excepted, ReverseString.reverse("dcba"));
	}
	
//	@Test
//	public void shouldTellAnEmptyStringIsPalindrome() {
//		assertTrue(palindromeCheck.estPalindrome(""));
//	}
//	
//	@Test
//	public void shouldTellABlankStringIsPalindrome() {
//		assertTrue(palindromeCheck.estPalindrome("     "));
//	}
//	
//	@Test
//	public void shouldTellAPalindromeStringIsPalindrome() {
//		assertTrue(palindromeCheck.estPalindrome("KAYAK"));
//	}
//	@Test
//	public void shouldTellAPalindromeStringIsPalindrome2() {
//		assertTrue(palindromeCheck.estPalindrome("KAYYAK"));
//	}
//	
//	@Test
//	public void shouldTellANonPalindromeStringIsNotPalindrome() {
//		assertFalse(palindromeCheck.estPalindrome("ABC"));
//	}
}
