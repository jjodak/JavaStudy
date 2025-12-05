package test1;
import java.util.ArrayList;
public class test1 {
	public static void main(String[] args) {
		Cat c = new Cat("나비",10);
		Dog d = new Dog("바둑이",11);
		Horse h = new Horse("적토마",5);
		
		int a = 4;
		int b = 5;
		
		d.eat();
		d.bark();
		d.run();
		c.eat();
		c.bark();
		h.run();
		h.bite();
		
		Dog[] doglist = new Dog[5];
		
		for(int i = 0; i < doglist.length;i++) {
			doglist[i] = new Dog("멍멍이" + (i+1),5);
		}
		for(int i = 0; i < doglist.length;i++) {
			doglist[i].bark();
		}
		
		
		
		ArrayList<Dog> DogList = new ArrayList<>();
		
		DogList.add(new Dog("바둑이",3));
		DogList.add(new Dog("돌돌이",3));
		DogList.add(new Dog("멍멍이",3));
		
		
		for(Dog dog : DogList) {
			dog.bark();
		}
	}
}
