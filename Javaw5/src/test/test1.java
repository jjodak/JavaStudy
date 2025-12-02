package test;

import java.util.Scanner;

public class test1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int chance = 0;
		int num = (int)(Math.random()*10)+1;
		String input = null;
		boolean run = true;
		
		while(run) {
			System.out.println("1~10까지 숫자를 입력하시오 : ");
			input = sc.nextLine();
			
			chance ++;
			if(input.equals(String.valueOf(num))) {
				System.out.println("Bingo!");
			} else {
				System.out.println("TryAgain");
			}
			if(chance == 3) {
				run = false;
				System.out.println("정답은 : " + num);
			}
			
		}

	}

}
