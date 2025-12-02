package ch04test;

public class test3
{
	public static void main(String[] args)
	{
		int num = (int)(Math.random()*12) + 1;
		
		
		switch(num) {
			case 1,3,5,7,8,10,12 -> {
				System.out.println(num + "월은 31일 입니다.");
			}
			case 4,6,9,11 -> {
				System.out.println(num + "월은 30일 입니다.");
			}
			case 2 ->{
				System.out.println(num + "월은 28일 입니다.");
			}
			default ->{
				System.out.println("해당 월은 없습니다.");
			}
		}

	}

}
