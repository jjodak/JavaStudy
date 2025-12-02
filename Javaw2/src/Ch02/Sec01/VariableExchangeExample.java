package Ch02.Sec01;
// 변수 스왑핑
public class VariableExchangeExample
{
	public static void main(String[] args)
	{
		int x = 3;
		int y = 5;
		
		System.out.println("x : " + x + ", y : " + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x : " + x + ", y : " + y);

	}

}
