package ch06.test;

public class MultipleTable {
	
	MultipleTable(int num){
		System.out.println("["+num+"단]");
		for(int i =0; i<10;i++) {
			System.out.println(num + " * " + i + " = "+ num*i);
		}
	}
	void ShowMultipleTable(int num){
		System.out.println("["+num+"단]");
		for(int i =0; i<10;i++) {
			System.out.println(num + " * " + i + " = "+num*i);
		}
	}
}
