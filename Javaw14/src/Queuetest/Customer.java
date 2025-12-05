package Queuetest;

public class Customer {
	String name;
	String banking;
	
	public Customer(String name, String banking) {
		this.name=name;
		this.banking=banking;
	}
	
	void showInfo() {
		System.out.println(banking);
	}
}
