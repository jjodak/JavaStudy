package ch04test;

import java.util.Scanner;

public class test9
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.증속 | 2.감속 | 3.중지");
			System.out.println("--------------------------");
			
			System.out.println("선택: ");
			String select = scanner.nextLine();
			int select1 = Integer.parseInt(select);
			
			if (select1 == 1) {
				speed += 1;
				System.out.println("현재 속도=" + speed);
			} else if (select1 == 2) {
				speed -= 1;
				System.out.println("현재 속도=" + speed);
			} else if (select1 == 3) { 
				run = false;	
				}
		}
		System.out.println("프로그램 종료");
	}

}
