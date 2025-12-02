package ch04test;

import java.util.Scanner;

public class test92
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		int num = (int)(Math.random()*10)+1;
		int chance = 0 ;
		boolean win = false;
		
		do{
			System.out.println("Input a number between 1 and 10: ");
			String ans = scanner.nextLine();
			int ans1 = Integer.parseInt(ans);
			
			if (ans1 == num) {
				System.out.println("Bingo!");
				win = true;
				break;
			}else if(ans1 > num) {
				System.out.println("Down!");
			}else if(ans1 < num) {
				System.out.println("Up!");
			}
			
			chance ++;
			
			if (chance == 3) {
				System.out.println("GameOver");
			}
			
		} while (chance < 3 && !win);
	}
}
