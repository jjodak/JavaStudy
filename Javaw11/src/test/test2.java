package test;//숫자 야구

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int[] arr1 = new int[3];
		boolean run = true;
		int time = 1;
		
		//문제 생성
		for(int i = 0; i < 3; i++) {
			while(true) {
				int num = (int)(Math.random()*10);
				if(i==0 && num ==0) continue;
				boolean dup = false;
				for (int j = 0; j < i; j++) {
					if (arr1[j] == num) dup = true;
				}
				if (!dup) {
					arr1[i]= num;
					break;
				}
			}
		System.out.print(arr1[i]);
		}
		
		
		while(run) {
			System.out.println("input Number (ex:123):");
			String Sans = scanner.nextLine();
			
			//입력 받은 스트링값 분해
			int[] guess = new int[3];
			for(int i = 0; i<3; i++)
				guess[i]=Sans.charAt(i)-'0';
			
			//같은 숫자 3개인 경우 판별
			if (guess[0] == guess[1]||guess[1] == guess[2]||guess[0] == guess[1]) {
				System.out.println("Warrning : same nuber is not allowed...!!");
				continue;
			}
			
			//스트라이크 볼 판별
			int strike=0, ball =0;
			for(int i = 0; i<3;i++) {
				for(int j =0; j<3;j++) {
					if(arr1[i]==guess[j]) {
						if(i==j) strike++;
						else ball++;
					}
				}
			}
			
			//정답 판별
			if (strike == 3) {
				System.out.println("You Win!!");
				run = false;
				break;
			}
			
			//스트라이크 볼 출력
			System.out.println("["+time+"]"+" Result:"+strike+"S, "+ball+"B");
			
			//게임 종료
			if (Sans.equals("q") || Sans.equals("Q")) {
				System.out.println("Game Over!");
				run = false;
				break;
			}
			
			time ++;
		}
		
		
	  }
}
