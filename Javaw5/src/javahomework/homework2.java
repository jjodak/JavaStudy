package javahomework;
//확인문제 8
public class homework2
{
	public static void main(String[] args)
	{
		int[][] array = {
			{95,86},
			{83,92,96},
			{78,83,93,87}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int tl = 0;
		
		for(int i =0; i<array.length; i++) {
			for(int j = 0; j<array[i].length;j++) {
				sum += array[i][j];
			}
			tl += array[i].length;
		}
		
		avg = (double)sum/tl;
		
		System.out.println("합:" + sum);
		System.out.println("평균:" + avg);
	}
}
