package test1;

public class Cat extends Animal implements AnimalDoing{

	Cat(String name, int age) {
		super(name, age);
	}
	
	public void eat() {
		System.out.println(name + " eat food.");
	}
	public void bark() {
		System.out.println(name + " bark 야옹");
	}
	public void walk() {
		System.out.println(name + " walk");
	}
	public void sit() {
		System.out.println(name + " sit");
	}
	public void run() {
		System.out.println(name + " run");
	}
	public void bite() {
		System.out.println(name + " bite");
	}
}
