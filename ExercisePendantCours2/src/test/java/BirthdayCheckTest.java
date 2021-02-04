
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

public class BirthdayCheckTest {

	@Test
	public void test() {

		LocalDate myBirthDate=LocalDate.of(2021,2,2);
		
		assertTrue(BirthdayChek.isMyBirthday(myBirthDate));
	}
	@Test
	public void test() {

		LocalDate myBirthDate=LocalDate.of(2021,2,2);
		
		assertTrue(BirthdayChek.isMyBirthday(myBirthDate));
	}
}
