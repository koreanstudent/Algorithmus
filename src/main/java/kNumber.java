import java.util.ArrayList;
import java.util.Collections;

public class kNumber {

	public static void main(String[] args) {

		int[] array = {1,5,2,6,3,7,4};
		int[][]   commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		System.out.println(solution(array,commands));
		
		// result = {5,6,3}
		

	}
	
	 public static int[] solution(int[] array, int[][] commands) {

		 ArrayList<Integer> arr = new ArrayList<>();
		 int[] answer = new int[commands.length];
		 
		 for (int i = 0; i< commands.length; i++) {
			 for(int j = commands[i][0] - 1; j < commands[i][1]; j++) {
				 arr.add(array[i]);
			 }
			 Collections.sort(arr);
			 answer[i] = arr.get(commands[i][2] - 1);
			 arr.clear();
		 }
	        
		 
	     return answer;
	 }
	        

}
