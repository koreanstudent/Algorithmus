public class gymSuit {

	public static void main(String[] args) {
		int n = 5; // 전체 학생 수
		int[] lost = {2,4}; // 체육복을 도난당한 학생들의 번호
		int[] reserve = {1,3,5}; // 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
		
		System.out.println(solution(n,lost,reserve));
		
		// result = 5
		

	}
	
	 public static int solution(int n, int[] lost, int[] reserve) {

		 int answer = 0;
		 answer= n;
		
		 for(int i = 0; i <lost.length; i++) {
			 boolean rent = false; // 여분이 있는지 없는지 체크
			 int j = 0;
			 while(!rent) {
				 if(j == reserve.length) // reserve마지막까지 돌면 while 나오기
					 break;
				 if(lost[i] == reserve[j]) {
					 reserve[j] = -1;
					 rent =true;
				 }else if (lost[i] - reserve[j] == 1) {
					 reserve[j] = -1;
					 rent = true;
				 }else if(lost[i] - reserve[j] == -1) {
					 reserve[j] = -1;
					 rent = true;
				 } else {
					  j++;
				 }
			 }
			 if(!rent) { // 여분이 있어 true로 바꿨다면 수행하지 않지만 아닐경우엔 수행
				 answer--;
			 }
		 }
	     return answer;
	 }
	        

}
