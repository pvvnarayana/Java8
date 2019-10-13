package com.tm.model;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    //this is overridden to print the user-friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]";
    }
    
    @Override
    public int hashCode() {
    	return this.id;
    }
    
    @Override
    public boolean equals(Object obj) {
    	return this.getId()==((Employee)obj).getId();
    }
    
    @Override
    public int compareTo(Employee o) {
    	return this.getName().compareTo(o.getName());
    }
    
    public static class AgeComparator implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return (o1.getAge()-(o2.getAge()));
		}
    	
    }

}