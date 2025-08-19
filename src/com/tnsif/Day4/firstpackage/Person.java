// Program to demonstrate private data members, Constructors and getter and setter methods 
package com.tnsif.Day4.firstpackage;

public class Person {
	
	// private data members (data hiding)
	private String personName;
	private int personAge;
	private String personCity;
	
	// getter and setter for Name
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	// getter and setter for Age
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	// getter and setter for City
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}

	// Default constructor
	public Person() {
		System.out.println("Default Constructor");
	}
	
	// Parameterized constructor
	public Person(String personName, int personAge, String personCity) {
		System.out.println("Parameterized Constructor");
		this.personName = personName;
		this.personAge = personAge;
		this.personCity = personCity;
	}
}

