package study01;

public class AExample {

	public static void main(String[] args) {
		
		A a = new A();
		a.method();
		
		A.B b = a.new B();
		b.ShowBstr();
	}

}
