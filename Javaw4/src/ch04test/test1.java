package ch04test;

import java.util.Scanner;

public class test1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오:");
		String strnum = scanner.nextLine();
		int num = Integer.parseInt(strnum);
		
		if(num%2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		

	}

}
