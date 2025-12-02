package ch04test;

public class test5
{
	public static void main(String[] args)
	{
		
		for (int m=2; m<=9; m++) {
			if(m ==7 )
				continue;
				System.out.println("*** " + m + "단 ***");
				for (int n=1; n<=9; n++) {
					System.out.println(m + " X " + n + " = " + (m*n));
				}
			}
		
		/*
		for (int m=2; m<=9; m++) {
			if(m !=7 )
			{
				System.out.println("*** " + m + "단 ***");
				for (int n=1; n<=9; n++) {
					System.out.println(m + " X " + n + " = " + (m*n));
				}
			}
		}
		*/
	}
}
