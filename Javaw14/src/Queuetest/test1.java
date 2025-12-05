package Queuetest;
import java.util.Queue;
import java.util.LinkedList;
public class test1 {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		q.add("철수");
		q.add("경수");
		q.add("정수");
		
		System.out.println("Next : " + q.poll());
		System.out.println("Next : " + q.poll());
		System.out.println("Next : " + q.poll());
		System.out.println("End!!");
	}
}
