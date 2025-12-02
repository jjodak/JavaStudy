package Calculator_test;

public class Calculator {
	public static void main(String[] args) {
		Operation op = new Operation();
		
		op.add(1,3);
		op.subtract(5,7);
		op.multiply(8,7);
		op.divide(9,3);
	}
}
