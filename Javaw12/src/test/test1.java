package test;

import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오: ");
		String snum = scanner.nextLine();
		
		try {
			int num = Integer.parseInt(snum);
		} catch(NumberFormatException e){
			System.out.println("It is not a Number!!");
		}
		
		
	}
}
