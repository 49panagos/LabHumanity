package humanity;
import java.util.ArrayList;

public class HumanityMain {

	public static void main(String[] args) {
		ArrayList<Person> stud = new ArrayList<Person>();
		
		Student s = new Student();
		Student s1 = new Student("Perseas", "Nikoloutsopoulos", "ASD235");
		
		Worker w = new 	Worker();
		Worker w1 = new Worker("Dareios", "Persis", 10, 5);
		
		stud.add(s);
		stud.add(s1);
		stud.add(w);
		stud.add(w1);
		
		System.out.println("The people created are: ");
		for(Person p: stud) {
			if((!p.getFirstName().equals(""))&&(!p.getLastName().equals(""))) {
				System.out.println(p + "\n");
			}
		} 
		
		
		
		
		System.out.println("\nThere exist "+ Worker.getI()+" workers in the program.");
	}

}
