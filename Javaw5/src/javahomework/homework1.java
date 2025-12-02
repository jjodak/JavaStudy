package javahomework;
//확인문제 7

public class homework1
{
	public static void main(String[] args)
	{
		int[] array = {1,5,3,8,2};
		int a = 0;
		for(int i = 0; i <array.length; i++) {
			if (array[i] > a) {
				a = array[i];
			}
		}
		System.out.println(a);
	}
}
