package Ch02.Sec01;

public class FloatDoubleExample
{
	public static void main(String[] args)
	{										   //float는 변수값 뒤에 반드시 F,f 를 붙여서 명확히 한다
		 float var1 = 0.1234567890123456789f;  //float는 소수점 7자리까지, 그 이후자리는 근사치로 보여짐
		 double var2 = 0.1234567890123456789;  //double는 소수점 15자리까지
		 System.out.println("var1: " + var1);
		 System.out.println("var2: " + var2);
		 
		 double var3 = 3e6;
		 float var4 = 3e6F;
		 double var5 = 2e-3;
		 System.out.println("var3: " + var3);
		 System.out.println("var4: " + var4);
		 System.out.println("var5: " + var5);

	}

}
