package ch04test;

public class test7
{
	public static void main(String[] args)
	{
		for (int i = 1; i<=10; i++) {
			for (int k = 1; k<= 10-i; k++) {
				System.out.print(" ");
			}
			for ( int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

