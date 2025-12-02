package javahomework;

import java.util.Scanner;
//확인문제 9
public class homework3 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int student = 0;
		int[] score = null;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택>");
			
			int sel = scanner.nextInt();
			
			if(sel == 1) {
				System.out.print("학생수>");
				student = scanner.nextInt();
				score = new int[student];
			}
			
			else if(sel == 2) {
				for(int i = 0; i < student; i++) {
					System.out.print("score[" + i + "]>");
					score[i] = scanner.nextInt();
				}
			}
			
			else if(sel == 3) {
				for(int i = 0; i < student; i++) {
					System.out.println("score[" + i + "]:" + score[i]);
				}
			}
			
			else if(sel == 4) {
				int sum = 0;
				double avg = 0.0;
				int a = 0;
				
				for(int i =0; i <student; i++) {
					if (score[i] > a) {
						a = score[i];
					}
					sum += score[i];
				}
				
				avg = (double)sum/student;
				
				System.out.println("최고 점수: " + a);
				System.out.println("평균 점수: " + avg);
			}
			
			else if(sel == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
