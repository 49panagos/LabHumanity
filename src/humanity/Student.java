package humanity;
import java.util.Scanner;

public class Student extends Person {

	private String facultyNumber;
	
	public Student() {
		setFacultyNumber("");
	}
	
	public Student(String firstName, String lastName) {
		super(firstName, lastName);
		setFacultyNumber("");
	}
	
	public Student(String firstName, String lastName, String facultyNumber) {
		super(firstName, lastName);
		setFacultyNumber(facultyNumber);
	}
	
	public void setFacultyNumber(String facultyNumber) {
		if(facultyNumber.length()<=10 && facultyNumber.length()>=5 && facultyNumber.matches("^[\\p{L}0-9]*$")) {
			this.facultyNumber = facultyNumber;
		}
		else {
			this.facultyNumber = facultyNumber;
		}
	}
	public String getFacultyNumber() {
		return facultyNumber;
	}
	
	public String toString() {
		return super.toString()+"\nFaculty Number: {"+getFacultyNumber()+"}";
	}
}
