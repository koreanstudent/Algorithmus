import java.util.HashMap;
import java.util.Map;


/*
 * getOrDefault() -> 찾는 키가 존재하면 해당 키의 값을 반환하고, 없으면 기본값을 반환함.
 * hash.getOrDefault(arg라는 키, arg키가 존재하면 해당 값/없으면 0) 그리고 +1
 * 완주한 선수 completion을 map에 추가할 때 1씩 빼주고, 해당하는 키 값이 0이 아닐 때 완주하지 못한 선수이므로
 * 해당 key를 return하여 출력
*/


public class hash01 {
	private static String[] participant = {"leo", "kiki", "eden"};
	private static String[] completion  = {"eden", "kiki"};
	
	public static String main(String[] args) {
		Map<String, Integer> hash = new HashMap<>();
		
		for (String arg : participant) {
			hash.put(arg, hash.getOrDefault(arg, 0) + 1);
		}
		for (String arg : completion) {
			hash.put(arg, hash.get(arg) - 1);
		}
		for (String key : hash.keySet()) {
			if(hash.get(key) != 0) {
				return key;
			}
		}
		return null;
	}

}
