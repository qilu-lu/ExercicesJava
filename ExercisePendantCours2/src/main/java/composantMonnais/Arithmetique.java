package composantMonnais;

public class Arithmetique {

	public static int arithmetique(Operation string, int i, int j) {
		// TODO Auto-generated method stub
		int total = 0;
		Operation s = string;
		switch (s) {
		case PLUS:
			total = i + j;
			break;
		case MOINS:
			total = i - j;
			break;
		case FOIS:
			total = i * j;
			break;
		case DIVISE:
			total = i / j;
			break;
		default:
			throw new IllegalArgumentException("string");
		}
		return total;
	}
}
