package CodingExercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * JUnit class. Use to test Person class.
 * @author Jillian (Dongjin Zhou)
 * Apply for an internship this summer.
 * 
 */

class PersonTest {

    Person p1 = new Person("p1's first name", "p1's last name", "p1's country", 5);

	@Test
	final void testGetFristName() {
		assertEquals("p1's first name", p1.getFristName());
	}

	@Test
	final void testSetFristName() {
		p1.setFristName("p1's new first name");
		assertEquals("p1's new first name", p1.getFristName());
	}

	@Test
	final void testGetLastName() {
		assertEquals("p1's last name", p1.getLastName());
	}

	@Test
	final void testSetLastName() {
		p1.setLastName("p1's new last name");
		assertEquals("p1's new last name", p1.getLastName());
	}

	@Test
	final void testGetCountry() {
		assertEquals("p1's country", p1.getCountry());
	}

	@Test
	final void testSetCountry() {
		p1.setCountry("p1's new country");
		assertEquals("p1's new country", p1.getCountry());
	}

	@Test
	final void testGetAge() {
		assertEquals(5, p1.getAge());
	}

	@Test
	final void testSetAge() {
		p1.setAge(10);
		assertEquals(10, p1.getAge());
	}

}
