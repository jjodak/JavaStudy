package page24;

public class CheckedExecute {
	public static void main(String[] args) {
		CheckedExample ex = new CheckedExample();
		
		try{
			ex.doWork(-5);
		}catch(CheckedException e) {
			System.out.println("Excepti: " +e.getMessage());
		}
	}
}
