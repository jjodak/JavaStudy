package test;

public class test3
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[10];
		for(int i =0; i<arr1.length;i++) {
			arr1[i] = (int)(Math.random()*10)+1;
			System.out.print(arr1[i] + " ");
			
		}
		System.out.println();
		for(int i =0; i<arr1.length;i++) {
			if(arr1[i]==7) {
			System.out.println("7 is " + (i+1) + "th Number.");
			}

		}
	
	}
	
}
