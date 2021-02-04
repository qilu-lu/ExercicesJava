package composantMonnais;

public class ReverseString {

	public static String reverse(String value) {
		if(value!=null) {
		StringBuilder str=new StringBuilder();
		str.append(value);
		str.reverse();
		return str.toString();
	}
	else {
		throw new IllegalArgumentException("null");
		
	}
	}
	
}
