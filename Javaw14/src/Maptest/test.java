package Maptest;
import java.util.HashMap;
import java.util.Map;
public class test {
	public static void main(String[] args) {
		Map<String, Integer> scoreMap = new HashMap<>();
		int sum = 0;
		
		scoreMap.put("홍길동", 90);
		scoreMap.put("배철수", 85);
		scoreMap.put("강호동", 95);
		
		System.out.println("홍길동 점수: " + scoreMap.get("홍길동"));
		System.out.println("배철수 exist?" + scoreMap.containsKey("배철수"));
		
		if(scoreMap.containsKey("배철수")) {
			scoreMap.remove("배철수");
		}
		
		System.out.println("모든 학생 목록: ");
		for(String name : scoreMap.keySet()) {
			System.out.println(name+"->"+scoreMap.get(name));
			sum += scoreMap.get(name);
		}
		
		
		
		
		
		System.out.println("총 학생 수 : " +scoreMap.size() + " 평균 : " + (sum/scoreMap.size()));
		
	}
}
