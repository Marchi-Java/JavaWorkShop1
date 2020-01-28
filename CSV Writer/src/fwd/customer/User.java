package fwd.customer;

public class User {

	public String name;
	public String surName;
	public int age;
	private int salary;
	
	public User(String name, String surName, int age, int salary) {
		this.name = name;
		this.surName = surName;
		this.age = age;
		this.salary = salary;
	}
	
	public String toString() {
		String output = "";
		output += "Name : " + this.name + " ";
		output += "SurName : " + this.surName + " ";
		output += "Age : " + this.age;
		output += "Salary : " + this.salary;
		return output;
	}
	
	public static String[] getHeader() {
		String[] header = {"Name","Sur Name", "Age", "Salary"};
		return header;
	}
	
	public String[] getStringValue() {
		String[] values = {this.name, this.surName, this.age +"", this.salary +""};
		return values;
	}
	
	public static void log(User user) {
		System.out.println(user.toString());
	}
	
	public static void log(User[] users) {
		for(int i = 0; i < users.length; i++)
			System.out.println(users[i].toString());
	}

}
