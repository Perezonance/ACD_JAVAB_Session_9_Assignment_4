package assignment_4;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class EmpMain {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		
		ts.add(new Employee("Jim", "Tech Lead", 50000.00));
		ts.add(new Employee("Jim", "Sr. Developer", 50000.00));
		ts.add(new Employee("Mark", "Project Manager", 80000.00));
		ts.add(new Employee("Alex", "Tech Lead", 50000.00));
		
		System.out.println(ts.toString());
	}
}
