package Page08;

import java.util.Stack;

public class BaseStackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("스택내용: "+stack);
		
		System.out.println("peek: "+stack.peek());
		
		System.out.println("pop: "+stack.pop());
		
		System.out.println("pop: "+stack.pop());
		
		System.out.println("스택이 비었나요? : "+stack.isEmpty());
		
		System.out.println("스택내용: "+stack);
		
	}

}
