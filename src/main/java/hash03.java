import java.util.HashMap;

// getOrDefault() : 찾는 키가 존재하면 해당 키의 값을 반환하고, 없으면 기본값을 반환함

public class hash03 {
	
	public static void main(String[] args) {
		
		String[][] clothes = {{"yellow_hat","headgear"},{"blue_sunglasses", "eyewear"},{"green_turban","headgear"}};
		
		solution(clothes);
	}
	
	 public static int solution(String[][] clothes) {
		  HashMap<String, Integer> hm = new HashMap();
	        int answer = 1;

	        for (int i = 0; i < clothes.length; i++) { // 아무것도 안입은 상태도 개수로 친다.
	            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 1) + 1);
	            System.out.println(hm.values());
	        }

	        for (int i : hm.values()) {
	            answer *= i;
	        }
	        //옷을 하나도 입지 않은 상태를 빼준다.
	        return answer-1;
	    }

}
