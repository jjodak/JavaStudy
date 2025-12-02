package ch04test;

import java.util.Scanner;

public class test4
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Input Value : ");
		String iVal_1 = scanner.nextLine();
		int num1 = Integer.parseInt(iVal_1);
		
		System.out.println("Input Value : ");
		String iVal_2 = scanner.nextLine();
		int num2 = Integer.parseInt(iVal_2);
		
		int result = 0;
		
		System.out.println("Input Operator +, -, *, / : ");
		String sOperator = scanner.nextLine();
		
		switch (sOperator) {
		case "+":
			result = num1 + num2;
			System.out.println("Value1 + Value2 = " + result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println("Value1 - Value2 = " + result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println("Value1 x Value2 = " + result);
			break;
		case "/":
			if (num2 !=0 ) {
				result = num1 / num2;
				System.out.println("Value1 / Value2 = " + result);
			}
			else
				System.out.println("Error:divide by zero");
		}
	}

}
