package dernierVersion;

import java.util.ArrayList;
import java.util.List;

public class DernierVersion {

	public static String dernierVersion(List<String> list) {

		String s = "";
		for (String string : list) {
			if (string.compareTo(s) > 0) {
				s = string;
			}
		}

		return s;
	}

}
