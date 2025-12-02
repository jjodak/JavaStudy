package ch04;

public class _1_8_SwitchExpressionsExample
{
	public static void main(String[] args)
	{
		char grade = 'B';
		
		switch(grade) {
			case 'A','a' -> {
				System.out.println("우수 회원입니다.");
			}
			case 'B','b' -> {
				System.out.println("일반 회원입니다.");
			}
			default -> {
				System.out.println("thssla입니다.");
			}
		}
		
		switch(grade) {
			case 'A','a' -> System.out.println("우수 회원입니다.");
			case 'B','b' -> System.out.println("일반 회원입니다.");
			default -> System.out.println("thssla입니다.");
		}

	}

}
