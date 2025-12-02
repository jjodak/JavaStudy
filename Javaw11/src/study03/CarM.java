package study03;

public class CarM {
	private String model;
	private int horsePower;
	
	public CarM(String model, int horsePower) {
		this.model = model;
		setHorsePower(horsePower);
	}
	public void start() {
		System.out.println(model + "시동을 겁니다.");
		run();
	}
	
	public void stop() {
		System.out.println(model + "시동을 끕니다.");
	}
	
	public void run() {
		System.out.println("엔진이 가동중입니다!("+horsePower+" 마력)");
	}
	
	public int getHorsePower() {
		return horsePower;
	}
	
	public void setHorsePower(int horsePower) {
		if(horsePower<0) {
			System.out.println("마력은 0보다 커야 합니다.");
			this.horsePower = 0;
			return;
		}
		this.horsePower = horsePower;
	}
}
