package study01;

public class A {
	class B{
		String sBStr = "";
		
		B(){
			this.sBStr = "Null";
		}
		
		B(String sBStr){
			this.sBStr = sBStr;
		}
		
		void ShowBstr() {
			System.out.println("sBStr : " + sBStr);
		}
	}
	
	B field = new B();
	
	A(){
		B b = new B();
		b.ShowBstr();
	}
	
	void method() {
		B b = new B("method");
		b.ShowBstr();
	}
}
