package study03;

public class Car {
	private String model;
	private Engine engine;
	
	public Car(String model, int horsePower) {
		this.model = model;
		this.engine = new Engine(horsePower);
	}
	
	public void start() {
		System.out.println(model + "시동을 겁니다.");
		engine.run();
	}
	
	public void stop() {
		System.out.println(model + "시동을 끕니다.");
	}
	private class Engine{
		private int horsePower;
		
		public Engine(int horsePower) {
			this.horsePower = horsePower;
		}
		
		public void run() {
			System.out.println("엔진이 가동중입니다!("+horsePower+" 마력)");
		}
	}
}
