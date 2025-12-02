package review;

import java.util.Scanner;

public class review1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int num = (int)(Math.random()*20+1);
		int chance = 0;
		
		while(run) {
			System.out.println("Input a number between 1 and 20.");
			int input = Integer.parseInt(sc.nextLine());
			
			chance ++;
			if(input > num) {
				System.out.println("Down!");
			}else if(input < num){
				System.out.println("Up!");
			}else if(input == num) {
				System.out.println("Bingo!");
				run = false;
			}
			if (chance == 3) {
				run = false;
			}
		}
	}

}
