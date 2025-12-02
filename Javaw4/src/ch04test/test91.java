package ch04test;

import java.util.Scanner;

public class test91
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int collect = (int)(Math.random()*10)+1;
		int tc = 0;
		boolean run = true;
		
		while(run) {
			System.out.println("Input a number between 1 and 10: ");
			String ans = scanner.nextLine();
			int ans1 = Integer.parseInt(ans);
			
			if (ans1 == collect) {
				System.out.println("Bingo!");
				break;
			} else if(ans1 > collect) {
				System.out.println("Down!");
			} else if(ans1 < collect) {
				System.out.println("up!");
			}
			
			tc ++;
			
			if (tc == 3) {
				run = false;
				System.out.println("GameOver");
			}
		}
	}
}
