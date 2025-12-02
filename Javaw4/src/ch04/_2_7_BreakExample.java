package ch04;

public class _2_7_BreakExample
{
	public static void main(String[] args)
	{
		int count = 0;
		while(true) {
			int num = (int)(Math.random()*6) + 1;
			
			System.out.println(num);
			count += 1;
			if(num == 6) {
				break;
			}
		}
		System.out.println("6까지" + count + "번 걸렸습니다.");
		System.out.println("프로그램 종료");
	}

}
