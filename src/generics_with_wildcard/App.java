package generics_with_wildcard;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
	/*
	 * Generics provide type safety as well as flexibility.
	 * They offer limited flexibility using <? extends theClass> 
	 * 										<? super theClass>
	 */
		
		Object myObject = new Object();
		String myVar = "Hello";
		// I can assign myVar to myObject because every class in Java is a child of Object class
		myObject = myVar;

		Employee emp = new Employee();
		Accountant acc = new Accountant();
		// I can assign acc to emp because accountant is an employee
		emp = acc;
		
		
		ArrayList<Employee> employees = new ArrayList<>();
		ArrayList<Accountant> accountants = new ArrayList<>();
		// In generics, it does not work same way. we can not assign accountants to employees.
		//employees = accountants;
		
		
		// <?> --> wildcard almost same as raw type that accepts any type of objects
		ArrayList<?> employees2 = new ArrayList<>();
		ArrayList<Accountant> accountants2 = new ArrayList<>();
		employees2 = accountants2;
		
		// Now this <? extends theClass> becomes useful. It considers only children of the Employee class 
		// It is called UPPER BOUND. Highest type could go is Employee, and all the children (does not matter how low in the hierarchy they are)
		ArrayList<? extends Employee> employees3 = new ArrayList<>();
		ArrayList<Accountant> accountants3 = new ArrayList<>();
		// Now it works because Accountant is a child of the Employee class
		employees3 = accountants3;
		
		
		// Employee or parent of the Employee is allowed
		// It is called LOWER BOUND. 
		ArrayList<? super Employee> employees4 = new ArrayList<>();
		ArrayList<Accountant> accountants4 = new ArrayList<>();
		// Now it does not work, because it does not allowed lower than the Employee class
		//employees4 = accountants4;
		
		
		
		
		ArrayList<Employee> employees5 = new ArrayList<>();
		employees5.add(new Employee());
		makeEmployeeWork(employees5);
		
		ArrayList<Accountant> accountants5 = new ArrayList<>();
		accountants5.add(new Accountant());
		makeEmployeeWork(accountants5);
		

	}
	
	public static void makeEmployeeWork(List<? extends Employee> employees) {   //any child of Employee class
		for(Employee emp : employees) {
			emp.work();
		}
	}

}
