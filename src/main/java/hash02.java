// startsWith() 함수는 대상 문자열이 특정 문자 또는 문자열로 시작하는지 체크하는 함수이다.

//String startsWithT = "자바 코딩 테스트 ";
//System.out.println( startsWithT.startsWith("자바") );  // true

//System.out.println( startsWithT.startsWith("자바 ") );// true

//System.out.println( startsWithT.startsWith("자") );// true

//System.out.println( startsWithT.startsWith(" 자") );// false
public class hash02 {
	
	public static void main(String[] args) {
		
		String[] phoneBook = {"119", "97674223", "1195524421"};
		
		solution(phoneBook);
	}
	
	 public static boolean solution(String[] phoneBook) {
	        for(int i=0; i<phoneBook.length-1; i++) {
	            for(int j=i+1; j<phoneBook.length; j++) {
	                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
	                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
	            }
	        }
	        return true;
	    }

}
