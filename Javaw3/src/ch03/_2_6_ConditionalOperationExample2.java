package ch03;

public class _2_6_ConditionalOperationExample2
{
	public static void main(String[] args)
	{
	int num = 10;
	String result = (num > 0) ? "양수" : ((num < 0) ? "음수" : "0");
	
	System.out.println("양수 음수: " + result);
	System.out.println("짝수 확인 : " + ((num % 2 == 0 ) ? "짝수" : "홀수"));
	}
}
