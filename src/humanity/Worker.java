package humanity;
import java.util.Scanner;

public class Worker extends Person {
	
	private static int i;
	private double weekSalary;
	private int hoursPerDay;
	
	public Worker() {
		
	}
	
	public Worker(String firstName, String lastName) {
		super(firstName, lastName);
		
		if((!this.getFirstName().equals(""))&&(!this.getLastName().equals("")))
			i++;
	}
	
	public Worker(String firstName, String lastName, double weekSalary, int hoursPerDay) {
		super(firstName, lastName);
		setWeekSalary(weekSalary);
		setHoursPerDay(hoursPerDay);
		
		if((!this.getFirstName().equals(""))&&(!this.getLastName().equals("")))
			i++;
	}
	
	public void setWeekSalary(double weekSalary) {
		if(weekSalary>10) {
			this.weekSalary = weekSalary;
		}
		else {
			System.out.println("The weekly salary should be more than 10 for the worker. Please give a proper input: ");
			Scanner sc = new Scanner(System.in);
			setWeekSalary(sc.nextDouble());
			sc.close();
		}
	}
	public double getWeekSalary() {
		return weekSalary;
	}
	
	public void setHoursPerDay(int hoursPerDay) {
		if(hoursPerDay>=1 && hoursPerDay<=12) {
			this.hoursPerDay = hoursPerDay;
		}
		else {
			System.out.println("The hours per day should be more than or equal to 1, and less than or equal to 12 for the worker. Please give a proper input: ");
			Scanner sc = new Scanner(System.in);
			setHoursPerDay(sc.nextInt());
			sc.close();
		}
	}
	public int getHoursPerDay() {
		return hoursPerDay;
	}
	
	public static int getI() {
		return i;
	}
	
	
	public double calculateMoneyPerHour() {
		return weekSalary/(hoursPerDay*5);
	}
	
	public String toString() {
		return super.toString()+"\nWeek Salary: {"+ String.format("%.2f", getWeekSalary()) +"}\nHours Per Day: {"+
		getHoursPerDay()+"}\nSalary per hour: {"+ String.format("%.2f",calculateMoneyPerHour()) +"}";
	}
}
