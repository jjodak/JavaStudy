package Stacktest;

import java.util.Stack;

public class Stack2Cls_class {
	
	int[] sta = new int[10];
	
	boolean isEmpty() {
		for(int i = 0; i<sta.length;i++) {
			if (sta[i] != 0) {
				return true;
			}
		}
		return false;
	}
	
	boolean isFull() {
		for(int i = 0; i<sta.length;i++) {
			if(sta[i] !=0) {
				return false;
			}
		}
		return true;
	}
	
	void push(int x) {
		
	}
	
	void pop() {
		
	}
	
	void peek() {
		
	}
}
