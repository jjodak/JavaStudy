package Ch02.Sec01;

public class StringExample
{
	public static void main(String[] args)
	{
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 재웁니다..";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		System.out.print("배웁니다.\n");
		
		// \" "문자 포함
		// \' '문자 포함
		// \\ \문자 포함
		// \t 탭 만큼 띄움
		// \n 줄바꿈
		// \r 캐리지 리턴
	}

}
