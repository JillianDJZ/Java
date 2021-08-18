package CodingExercise;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * This is a class that read a file and print out the oldest person in the file, average age, etc..
 * @author Jillian (Dongjin Zhou)
 * Apply for an internship this summer.
 * 
 */


public class Main {
	
	
	/**
	 * Read the file and store the data in a PeopleList.
	 * @return PeopleList.
	 */
	private static PeopleList readFile(String fileName) {
		PeopleList pList = new PeopleList();
		try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String str;
            while ((str = in.readLine())!= null) 
            	{ 
            		String[] strarray=str.split("\"");
            		int age = Integer.parseInt(strarray[14].substring(1, strarray[14].length()-1));
            		Person p = new Person(strarray[3], strarray[7], strarray[11], age);
            		pList.addPerson(p);		
            	}
        } 
		catch (IOException e) {}
		return pList;
	}

	
	/**
	 * Read a file and print out the key information needed.
	 */
	public static void main(String[] args) {
		PeopleList pList = readFile("data.ndjson");
		
		System.out.println("1.The oldest person:");
		System.out.println(pList.getOldestPerson());
		
		System.out.println(String.format("\n2.Average age: %.2f", pList.getAverageAge()));
		
		System.out.println("\n3.Youngest person per country:");
		ArrayList<Person> youngest =pList.getYoungestOnePerCountry();
		for (Person p: youngest) 
			{System.out.println(p);}
		
		System.out.println("\n4.Average age per country:");
		Set<Entry<String, Double>> ms = pList.getAveragePerCountry().entrySet();
		for (Map.Entry entry : ms) 
			{
			System.out.print(String.format("%s -- %.2f\n",entry.getKey(),entry.getValue()));
			}
		
		System.out.println("\n5.For New Zealand count of people per age ranges:");
		int[] countList = pList.getNumOfPeopleAgeRanges("New Zealand");
		for(int i = 0; i < countList.length; i++) 
		{if (countList[i]> 0) 
			{System.out.println(String.format("%d <= x < %d  :  %d", i*10, i*10+10, countList[i]));}
		}
	    System.out.println("All other age ranges are zero.");
	    }
}
