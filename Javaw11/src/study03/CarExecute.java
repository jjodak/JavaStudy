package study03;

public class CarExecute {

	public static void main(String[] args) {
		CarM car1 = new CarM("소나타", 150);
		Car car2 = new Car("아반떼", 120);
		
		car1.start();
		car2.stop();
		
		car2.start();
		car2.stop();

	}

}
