package Stacktest;

import java.util.Scanner;
import java.util.Stack;

public class stacktest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		Stack<String> stack = new Stack<>();
		String s = null;
		
		while(true) {
			System.out.println("문자 입력");
			String inputs = sc.nextLine();
			
			if (inputs.equals("q")) {
				break;				
			}
			
			s += inputs;
			
			stack.push(s);
		}
		
		System.out.println("---------------------------");
		System.out.println("inputs");
		System.out.println("---------------------------");
		
		while(true) {
			if(stack.isEmpty()) {
				break;
			}else {
				System.out.println(stack);
			}
			
		}
		 
	}
	
}
