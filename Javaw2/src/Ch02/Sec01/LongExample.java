package Ch02.Sec01;

public class LongExample
{
	public static void main(String[] args)
	{
		long var1 = 10;
		long var2 = 20;
		//long var3 = 1000000000000; Error -> The literal 1000000000000 of type int is out of range 
		long var4= 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}

}
