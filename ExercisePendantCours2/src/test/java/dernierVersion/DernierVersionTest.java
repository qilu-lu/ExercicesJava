package dernierVersion;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DernierVersionTest {

	@Test
	public void should_return_dernierversion() {
		String Version1 = "1.0.0";
		String Version2 = "1.1.0";
		String Version3 = "2.0.1";
		List<String> list = new ArrayList<>();

		list.add(Version1);
		list.add(Version2);
		list.add(Version3);

		assertEquals("2.0.1", DernierVersion.dernierVersion(list));
	}

}
