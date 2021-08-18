package CodingExercise;

/**
 * This class models an person.
 * @author Jillian (Dongjin Zhou)
 * Apply for an internship this summer.
 * 
 */
public class Person {
	 
	
	//The first name of the person.
	private String firstName = new String();
	
	//The last name of the person.
	private String lastName = new String();
	
	//The country of the person come from.
	private String country = new String();
	
	//The age of the person.
	private int age;

	
	/**
	 * Creates a person with a given first name, last name, country and age.  
	 */
	public Person(String theFirstName, String theLastName, String theCountry, int theAge) {
		firstName = theFirstName;
		lastName = theLastName;
		country = theCountry;
		age = theAge;
	}
	
	
	/**
	 * Gets the first name of the person.
	 * @return The first name of the person.
	 */
	public String getFristName(){
		return firstName;	
	}
	
	
	/**
	 * Sets the first name of the person with a given name.
	 */
	public void setFristName(String theFirstName){
		firstName = theFirstName;
	}
	
	
	/**
	 * Gets the last name of the person.
	 * @return The last name of the person.
	 */
	public String getLastName(){
		return lastName;	
	}
	
	
	/**
	 * Sets the last name of the person with a given name.
	 */
	public void setLastName(String theLastName){
		lastName = theLastName;
	}

	
	/**
	 * Gets the country of the person come from.
	 * @return The country of the person come from.
	 */
	public String getCountry(){
		return country;	
	}
	
	
	/**
	 * Sets the country of the person come from with a given country name.
	 */
	public void setCountry(String theCountryName){
		country = theCountryName;
	}
	
	
	/**
	 * Gets the age of the person.
	 * @return The age of the person.
	 */
	public int getAge(){
		return age;	
	}
	
	
	/**
	 * Sets the age of the person with a given age.
	 */
	public void setAge(int theAge){
		age = theAge;
	}
	
	
	/**
	 * rewrite toString() to return all information about a person.
	 * @return All personal information, including first name, last name, country and age.
	 */
	public String toString() {
		return firstName + " " + lastName + ", " + "come form " + country + ", " + "age is " + age + ". ";
	}
}
