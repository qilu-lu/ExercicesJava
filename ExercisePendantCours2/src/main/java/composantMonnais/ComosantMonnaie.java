package composantMonnais;

import java.util.ArrayList;
import java.util.List;

public class ComosantMonnaie {

	final static int dime = 1;
	final static int nickel = 5;
	final static int pennie = 10;
	static int monnais =100;

	public static void main(String[] args) {
		List<String> list = composer(100);
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println(list.size());
	}

	public static List<String> composer(int i) {
		List<String> list = new ArrayList<>();
		for (int j = 0; j < monnais; j++) {
			for (int j2 = 0; j2 < monnais/5; j2++) {
				for (int k = 0; k < monnais/10; k++) {
					if (10 * k + j2 * 5 + j * 1 == 100) {
						list.add(k + " fois pennis " + j2 + " fois nickel " + j + " fois dime");
					}
				}
			}
		}
		return list;

	}
}