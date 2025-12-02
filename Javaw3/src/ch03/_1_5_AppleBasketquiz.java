package ch03;

public class _1_5_AppleBasketquiz
{
	public static void main(String[] args)
	{
		int apple = 123;
		int bs1 = apple / 10;
		int bs2 = apple % 10;
		
		if(bs2 > 0)
			System.out.println("바구니 개수는: " + ++bs1);
		else
			System.out.println("바구니 개수는: " + bs1);
	}

}
