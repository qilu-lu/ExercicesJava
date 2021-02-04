package composantMonnais;


/**
 * Class used to check if a given string is a "palindrome" Palindrome string =>
 * word that can be read from left to right as same as from right to left
 */
public class PalindromeCheck {

	public boolean estPalindrome(String value) {
		if(value==null) {
			return false;
		}

		else {
			for (int i = 0; i < (value.length())/2+1; i++) {
			if(value.charAt(i)==value.charAt(value.length()-i-1)){
				
				return true;
			}
			return false;
		}
		
		return false;
	}}
}
