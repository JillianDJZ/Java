package CodingExercise;
import java.util.*;

/**
 * This class models a list with a lot of people..
 * @author Jillian (Dongjin Zhou)
 * Apply for an internship this summer.
 * 
 */
public class PeopleList {
	 
	
	//The list of people.
	private ArrayList<Person> peopleList = new ArrayList<Person>();
	
	
	/**
	 * Creates a list of people with a given list.  
	 */
	public PeopleList() {
		peopleList = new ArrayList<Person>();
	}
	
	
	/**
	 * Get the list.
	 * @return The list.
	 */
	public ArrayList<Person> getPeopleList(){
		return peopleList;
	}
	
	
	/**
	 * Add a person to the list.  
	 */
	public void addPerson(Person p) {
		peopleList.add(p);
	}
	
	
	/**
	 * Count the average age of all the people in a given list.
	 * @return The average age.
	 */
	private double countAverageAge (ArrayList<Person> personList) {
		int sum = 0;
		for (Person p : personList) {
			sum += p.getAge();
		}
		double average = (double) sum / personList.size();
		return average;
	}
	
	
	/**
	 *Get the oldest person.
	 * @return The oldest person.
	 */
	public Person getOldestPerson() {
		Person oldestOne = new Person("", "", "",0);
		for (Person person : peopleList) {
			if (person.getAge() > oldestOne.getAge()) {oldestOne = person;}
		}	 
		return oldestOne;
	}
	
	
	/**
	 *Get the youngest person in a given list.
	 * @return The youngest person.
	 */
	private Person getYoungestPerson(ArrayList<Person> peopleList) {
		Person youngestOne = new Person("", "", "",200);
		for (Person person : peopleList) {
			if (person.getAge() < youngestOne.getAge()) {youngestOne = person;}
		}	 
		return youngestOne;
	}
	
	
	/**
	 *Get the average age of all the people in the list.
	 * @return The average age.
	 */
	public double getAverageAge() {
		return countAverageAge(peopleList);
	}
	
	
	/**
	 *Put people on different lists by country.
	 * @return  these lists by country.
	 */
	private ArrayList<ArrayList<Person>> getCountryLists(){
		ArrayList<ArrayList<Person>> countrys = new ArrayList<ArrayList<Person>>();
		ArrayList<String> catalogue = new ArrayList<String> ();
		for (Person person : peopleList) {
			String country = person.getCountry();
			if (catalogue.contains(country)) 
				{
					int index = catalogue.indexOf(country);
					countrys.get(index).add(person);
				}
			else 
				{
					 catalogue.add(country);
					 ArrayList<Person> newCountry = new ArrayList<Person>();
					 newCountry.add(person);
					 countrys.add(newCountry);
				}
		}
		return countrys;
	}
	
	
	/**
	 *Get the average age of people in each country.
	 * @return One map contains countries and average ages.
	 */
	public Map<String, Double> getAveragePerCountry() {
		ArrayList<ArrayList<Person>> countrys = getCountryLists();
		Map<String, Double> map = new HashMap<String, Double>();
		for(ArrayList<Person> country : countrys) {
			map.put(country.get(0).getCountry(), countAverageAge(country));
			}
		return map;
	}
	
	
	
	/**
	 *Get the youngest person per country.
	 *@return A list contains the youngest people in each country.
	 */
	public ArrayList<Person> getYoungestOnePerCountry() {
		ArrayList<ArrayList<Person>> countrys = getCountryLists();
		ArrayList<Person> result = new ArrayList<Person>();
		for(ArrayList<Person> country : countrys) 
		{
			result.add(getYoungestPerson(country));
		}
		return result;
	}
	
	
	/**
	 *Get the number of people of different ages in a given country.
	 *@return A list contains number of people in each age group.
	 */
	public int[] getNumOfPeopleAgeRanges(String countryName) {
		ArrayList<ArrayList<Person>> countrys = getCountryLists();
		int[] countList = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		for(ArrayList<Person> country : countrys) {
			if (country.get(0).getCountry().equals(countryName)) {
				// The (index * 10) is the lower bound of the age range.
				for (Person p : country) 
					{int index = p.getAge() / 10;
					countList[index] += 1;}
				break;
			}
		}
		return countList;
	}
}
