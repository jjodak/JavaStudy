package ch03;

import java.util.Scanner;

public class _1_1_w2review1
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("input Val1 : ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("input Val2 : ");
		int y = 0;
		y = scanner.nextInt();
		//숫자만 입력하는 경우 string으로 받아서 int로 변환하는 것이 아닌 위와 같이 한번에 int로 받을 수 있음.
		
		int result = x + y;
		System.out.print("iVal_1 + iVal_2 = " + result);
		
	}

}
