package javahomework;
//문자열 연습문제2
public class homework4 {
	public static void main(String[] args)
	{
		String sStudent1 = "math:85, calc:93, science:71";
		String sStudent2 = "calc:71, math:88, science:92";
		
		String[] tokens1 = sStudent1.split(",");
		String[] tokens2 = sStudent2.split(",");
		
		int totmath = 0;
		int totcalc = 0;
		int totscience = 0;
		
		for(int i=0;i<tokens1.length;i++) {
			totmath += Integer.parseInt(tokens1[i].replace("Point", ""));
		}
	}
}
