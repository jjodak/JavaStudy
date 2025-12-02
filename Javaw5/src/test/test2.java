package test;

public class test2
{
	public static void main(String[] args)
	{
		String sTot ="10Point,23Point,33Point,45Point,55Point,67Point";
		
		String[] tokens =sTot.split(",");
		
		int icnt = tokens.length;
		int isum = 0;
		float favg = 0f;
		
		for(int i=0;i<icnt;i++) {
			isum += Integer.parseInt(tokens[i].replace("Point", ""));
		}
		
		favg = isum / icnt;
		
		System.out.println("1.TotCnt : " + icnt);
		System.out.println("2.SumValue : " + isum);
		System.out.println("3.Average : " + favg );
	}

}
