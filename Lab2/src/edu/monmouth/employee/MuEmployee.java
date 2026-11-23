package edu.monmouth.employee;

public class MuEmployee {
	private int age;    
    private String name;
    public MuEmployee(int age, String name) throws EmployeeException {
    	setAge(age);
    	setName(name);
    }
    
    public void setAge(int age) throws EmployeeException {
    	if (age < EmployeeConstants.MINAGE) {
    		throw new EmployeeException(age + " must be >= " + EmployeeConstants.MINAGE);
    	}
        this.age=age;    
    }  
    
    public int getAge(){
        return this.age;    
    }
    
    public void setName(String name) throws EmployeeException {
    	if (name == null || name.length() < EmployeeConstants.MINNAME) {
    		throw new EmployeeException("name cannot be numm and must contain " + EmployeeConstants.MINNAME + " letters");
    	}
        this.name=name;    
    }
    
    public String getName(){   
        return this.name;    
    }
    
    @Override
    public boolean equals(Object otherEmployee) {
    	// placeholder
    	if (otherEmployee == null) {
    		return false;
    	}
    	if (!(otherEmployee instanceof MuEmployee)) {
    		return false;
    	}
    	MuEmployee oe = (MuEmployee)otherEmployee;
    	return(oe.age == this.age && oe.getName().equals(name));
    }
    	
    @Override
    public String toString() {
    	return age + " " + name;
    }
    
}

