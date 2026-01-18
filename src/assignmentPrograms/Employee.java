package assignmentPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{

	
	String name;
	
	String address;
	
	double salary;

	public Employee(String name, String address, double salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	
	@Override
	public int compareTo(Employee emp) {
		
		return this.name.compareTo(emp.name);
	}
	
    public static void main(String[] args) {
		
    	Employee emp1=new Employee("Sachin", "Bangalore",40000 );
    	
    	Employee emp2=new Employee("Rahul", "Chennai", 30000);
    	
    	Employee emp3=new Employee("Dhoni", "Ranchi", 42000);
    	
    	Employee emp4=new Employee("ABD", "Africa", 35000);
    	
    	List<Employee> list=new ArrayList<Employee>();
    	
    	list.add(emp1);
    	
    	list.add(emp2);
    	
    	list.add(emp3);
    	
    	list.add(emp4);
    	
    	Collections.sort(list);
    	
    	System.out.println("Name\t Address \t Salary");
    	
    	System.out.println("-----\t--------\t---------");
    	
    	for(int i=0;i<list.size();i++)
    	{
    		System.out.println(list.get(i).name+"\t"+list.get(i).address+"\t\t\t"+list.get(i).salary);
    	}
    	
	}
}
