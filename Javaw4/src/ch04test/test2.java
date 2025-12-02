package ch04test;

import java.util.Scanner;

public class test2
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input Value :");
		String strnum1 = scanner.nextLine();
		int num1 = Integer.parseInt(strnum1);
		
		System.out.println("Input Value :");
		String strnum2 = scanner.nextLine();
		int num2 = Integer.parseInt(strnum2);
		
		if (num1 > num2) {
			System.out.println(num2 + "<" + num1);
		} else if (num1 < num2) {
			System.out.println(num1 + "<" + num2);
		} else {
			System.out.println(num1 + "==" + num2);
		}
	}

}
