package Queuetest;
import java.util.Queue;
import java.util.LinkedList;

public class BankQueue {
	
	Queue<Customer> queue = new LinkedList<>();
	
	void addCustomer(Customer c) {
		queue.add(c);
		System.out.println("Register Customer: " + c);
	}

	void nextCustomer() {
		System.out.println("Next Customer: " + queue.poll());
	}
}
