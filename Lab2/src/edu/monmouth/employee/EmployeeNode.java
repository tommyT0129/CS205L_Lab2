package edu.monmouth.employee;

public class EmployeeNode {
		private MuEmployee info;
		private EmployeeNode next, previous;
	  
	  public EmployeeNode(MuEmployee info) {
	    this.info = info;
	    next = previous = null;
	  }
	 
	  public void setInfo(MuEmployee info) {
	    this.info = info;
	  }

	  public MuEmployee getInfo() {
	    return info;
	  }

	  public void setPrevious(EmployeeNode link) {
		    this.previous = link;
	  }

	 public EmployeeNode getPrevious() {
		    return previous;
	 }
		  
	  public void setNext(EmployeeNode link) {
	    this.next = link;
	  }

	  public EmployeeNode getNext() {
	    return next;
	  }
	  
	  @Override 
	  public String toString() {
		  return info.toString();
	  }

}
