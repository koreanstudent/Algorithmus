package inflearn.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

//  4. 모든 아나그램 찾기
//        설명
//
//        S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
//
//        아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
//
//
//        입력
//        첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
//
//        S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
//
//
//        출력
//        S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
//
//
//        예시 입력 1
//
//        bacaAacba
//        abc
//        예시 출력 1
//
//        3

public class java04 {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
        }

        int lt=0;
        for(int rt=k-1; rt<n; rt++){
            map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt])-1);
            if(map.get(arr[lt])==0 ) map.remove(arr[lt]);
            lt++;
        }



        return answer;
    }

    public static void main(String[] args){
        java04 T = new java04();
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        for(int x : T.solution(n,k,arr)) System.out.println(x + " ");



    }
}
