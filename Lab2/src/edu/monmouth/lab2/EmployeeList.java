package edu.monmouth.lab2;

import edu.monmouth.employee.*;

public class EmployeeList {
	private EmployeeNode head; 

	public EmployeeList() {
		head = null;
	}

	public void add(MuEmployee element) {
		EmployeeNode employeeNode = new EmployeeNode(element);

		if (head == null) {
			head = employeeNode;
		}
		else {
			employeeNode.setNext(head);
			head.setPrevious(employeeNode);

			head = employeeNode;
		}
	}
	
	public boolean find(MuEmployee employee) {
		EmployeeNode employeeNode = head;
		
		while (employeeNode != null) {
			if (employeeNode.getInfo().equals(employee)) {
				return true;
			}
			
			employeeNode = employeeNode.getNext();
		}
	   	return false;
	}
	
	
	public String printReverse() {
		StringBuilder result = new StringBuilder();
		EmployeeNode employeeNode = head;
		
		if (employeeNode == null) {
			result.append("Empty");
		}
		else {
			while (employeeNode.getNext() != null) {
				employeeNode = employeeNode.getNext();
			}
			
			while (employeeNode != null) {
				result.append(employeeNode.toString() + " ");

				employeeNode = employeeNode.getPrevious();
			}
		}
		
		return result.toString();
		
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		EmployeeNode employeeNode = head;

		if (employeeNode == null) {
			result.append("Empty");
		}
		else {
			while (employeeNode != null) {
				result.append(employeeNode.toString() + " ");

				employeeNode = employeeNode.getNext();
			}
		}
		return result.toString();
	}
}