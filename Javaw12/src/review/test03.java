package review;

public class test03 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		
		for (int i = 0; i < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			lotto[i] = num;
			
			for(int j = 0; j < i;j++) {
				if(lotto[j] == num) {
					lotto[i] = num;
				}
			}
			System.out.println(lotto[i]);
		}
		
	}
}
	

