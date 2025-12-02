package Ch02.Sec01;

import java.util.Scanner;

public class review
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력: ");
		String strX = scanner.nextLine();
		
		System.out.print("y 값 입력: ");
		String strY = scanner.nextLine();
		
		System.out.println("x 값: " + strX);
		System.out.println("y 값: " + strY);
		
		System.out.println("x 값과 y 값 스와핑------");
		
		String temp = strX;
		strX = strY;
		strY = temp;
		
		System.out.println("x 값: " + strX);
		System.out.println("y 값: " + strY);
	}

}
