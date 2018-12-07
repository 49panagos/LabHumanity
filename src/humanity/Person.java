package humanity;
import java.io.*;
import java.util.Scanner;

public class Person {

	protected String firstName;
	protected String lastName;
	
	public Person() {
		//Scanner sc = new Scanner(System.in);
		System.out.println("You had to input a first name and a last name respectively which you did not.\n ");
		
		setFirstName("");
		setLastName("");
	}
	
	public Person(String firstName, String lastName) {
		setFirstName(firstName);
		setLastName(lastName);
	}
	

	
	public void setFirstName(String firstName) {
		if(firstName.length()>2) {
			if(Character.isUpperCase(firstName.charAt(0))) {
				this.firstName = firstName;
			}
			else {
				StringBuilder sb = new StringBuilder(firstName);
				sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
				this.firstName = sb.toString();
			}
		}
		else {
			this.firstName = "";
		}
//		
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		if(lastName.length()>3) {
			if(Character.isUpperCase(lastName.charAt(0))) {
				this.lastName = lastName;
			}
			else {
				StringBuilder sb = new StringBuilder(lastName);
				sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
				this.lastName = sb.toString();
			}
		}
		else {
/* I tried to run the belowmentioned code in the comments but it throws a NoSuchElementException which I was not sure how to handle.
 * So, eventually, even if the object with the prohibited lastName input is created, I am just not showing it to the screen. The same things said apply
 *  for the respective part in setFirstName method for the firstName input. Maybe the problem has to do with the method nextLine().*/
			
			
//			System.out.println("The last name should be more than 3 in length. Please give a proper input: ");
//			Scanner scsc = new Scanner(System.in);
//			lastName = scsc.nextLine();
//			scsc.close();
			
			this.lastName = "";
		}
		
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return "First Name: {"+getFirstName()+"}\nLastName: {"+ getLastName()+"}";
	}
}
