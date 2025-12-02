package page24;

public class CheckedExample {
	public void doWork(int value) throws CheckedException{
		if(value<0) {
			throw new CheckedException("It is not allowed...");
			
		}
		System.out.println("Success : "+ value);
	}
}
