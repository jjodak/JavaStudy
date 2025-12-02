package review;

import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int count = 0;
		int iGuessNo = (int)(Math.random()*45)+1;
		
		while(run) {
			System.out.print("1~45사이 숫자를 입력하세요.");
			String sans = scanner.nextLine();
			int ans = Integer.parseInt(sans);
			
			if (ans>iGuessNo) {
				System.out.println("Down!");
			}else if (ans<iGuessNo) {
				System.out.println("Up!");
			}else if (ans == iGuessNo) {
				System.out.println("Right!");
				run = false;
			}
			count ++;
			
		}
		System.out.println(count + "번 만에 정답!");
	}
}
