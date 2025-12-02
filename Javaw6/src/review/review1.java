package review;

public class review1 {

	public static void main(String[] args) {
		
		int [] array = new int[10];
		int count = 0;
		boolean run = true;
		
		while(run) {
			
			if(count == 10) {
				run = false;
			}
			
			for(int i = 0; i <array.length; i++) {
				int num = (int)(Math.random()*10)+1;
		
				array[i] = num;
				count += 1;
			}
	
		}
		for(int i = 0; i <array.length; i++) {
			System.out.println(array[i]);
	}
	
	}
}