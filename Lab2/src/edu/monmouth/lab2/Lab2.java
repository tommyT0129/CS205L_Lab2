package edu.monmouth.lab2;

import edu.monmouth.employee.*;

public class Lab2 {
	public static void main(String[] args) {
		MuEmployee employee0 = null;
        MuEmployee employee1 = null;
        MuEmployee employee2 = null;
        MuEmployee employee3 = null;
        MuEmployee findMeToo = null;
        MuEmployee findMe = null;
        
		try {
	         employee0 = new MuEmployee(40, "Joe");
	         employee1 = new MuEmployee(31, "Mark");
	         employee2 = new MuEmployee(23, "Sandy");
	         employee3 = new MuEmployee(21, "Sarah");
	         findMeToo = new MuEmployee(40, "Joe");
	         findMe = new MuEmployee(23, "Sandy");
		} catch(EmployeeException e) {
			System.err.println("Cannot create employee " + e);
		}
		// create an EmployeeList
		EmployeeList list = new EmployeeList();
		
		System.out.println("list prior to populating:\n" + list);
		
		// add MuEmployee objects to the list
		list.add(employee0);
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		// print the list
		System.out.println("List after adding 3 employees:\n" + list);
		
		System.out.println("List in reverse:\n" + list.printReverse());
		
		System.out.println("Searching for " + findMe + " " + list.find(findMe));
		
		System.out.println("Searching for " + findMeToo + " " + list.find(findMeToo));
	}
}
