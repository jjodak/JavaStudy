package study06;

public class BankExample {
	public static void main(String[] args) {
		Bank.Account acc1 = new Bank.Account("홍길동", 10000);
		Bank.Account acc2 = new Bank.Account("이영희", 5000);
		
		acc1.showInfo();
		acc2.showInfo();
		
		acc1.deposit(3000);
		acc2.withdraw(2000);
		
		acc1.showInfo();
		acc2.showInfo();
	}
}
