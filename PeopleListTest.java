package CodingExercise;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit class. Use to test PeopleList class.
 * @author Jillian (Dongjin Zhou)
 * Apply for an internship this summer.
 * 
 */

import java.util.ArrayList;

import org.junit.jupiter.api.Test;



class PeopleListTest {
	
	
	PeopleList pList = new PeopleList();

	@Test
	final void testAddPerson() {
		Person p1 = new Person("p1's first name", "p1's last name", "p1's country", 5);
		pList.addPerson(p1);
		String name = pList.getPeopleList().get(0).getFristName();
		assertEquals("p1's first name", name);
	}

	
	@Test
	final void testGetOldestPerson() {
		Person p2 = new Person("p2's first name", "p2's last name", "p2's country", 10);
		Person p3 = new Person("p3's first name", "p3's last name", "p3's country", 36);
		pList.addPerson(p2);
		pList.addPerson(p3);
		assertTrue(pList.getOldestPerson() == p3);
	}

	
	@Test
	final void testGetAverageAge() {
		Person p4 = new Person("p4's first name", "p4's last name", "p4's country", 10);
		Person p5 = new Person("p5's first name", "p5's last name", "p5's country", 40);
		pList.addPerson(p4);
		pList.addPerson(p5);
		assertTrue(pList.getAverageAge() == 25);
	}

	
	@Test
	final void testGetAveragePerCountry() {
		Person p6 = new Person("p6's first name", "p6's last name", "country1", 10);
		Person p7 = new Person("p7's first name", "p7's last name", "country2", 10);
		Person p8 = new Person("p8's first name", "p8's last name", "country2", 50);
		pList.addPerson(p6);
		pList.addPerson(p7);
		pList.addPerson(p8);
		assertTrue(pList.getAveragePerCountry().get("country2")==30);
	}
	

	@Test
	final void testGetYoungestOnePerCountry() {
		Person p6 = new Person("p6's first name", "p6's last name", "country1", 10);
		Person p7 = new Person("p7's first name", "p7's last name", "country2", 10);
		Person p8 = new Person("p8's first name", "p8's last name", "country2", 50);
		pList.addPerson(p6);
		pList.addPerson(p7);
		pList.addPerson(p8);
		assertTrue(pList.getYoungestOnePerCountry().get(1)== p7);
	}

	
	@Test
	final void testGetNumOfPeopleAgeRanges() {
		Person p6 = new Person("p6's first name", "p6's last name", "country1", 10);
		Person p7 = new Person("p7's first name", "p7's last name", "country2", 10);
		Person p8 = new Person("p8's first name", "p8's last name", "country2", 50);
		pList.addPerson(p6);
		pList.addPerson(p7);
		pList.addPerson(p8);
		int[] check = {0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0};
		int[] country2 = pList.getNumOfPeopleAgeRanges("country2");
		for (int i=0; i<check.length; i++) {
		    assertEquals(check[i], country2[i]);}
	}

}
