package Queuetest;
import java.util.Queue;
import java.util.LinkedList;

public class BankMainEexc {
	public static void main(String[] args) {
		BankQueue bk = new BankQueue();
		
		Customer c1 = new Customer("홍길동","예금");
		Customer c2 = new Customer("김철수","출금");
		Customer c3 = new Customer("강감찬","적금가입");
		
		bk.addCustomer(c1);
		bk.addCustomer(c2);
		bk.addCustomer(c3);
		
		
		
		
	}
}
