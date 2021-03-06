package inflearn.array;

import java.util.Scanner;

//  4. 피보나치 수열
//        설명
//
//        1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
//
//        2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
//
//
//        입력
//        첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
//
//
//        출력
//        첫 줄에 피보나치 수열을 출력합니다.
//
//
//        예시 입력 1
//
//        10
//        예시 출력 1
//
//        1 1 2 3 5 8 13 21 34 55

public class java04 {
    // 배열없이 코딩
//    public void solution(int n){
//        int a=1, b=1, c;
//        for(int i=2; i<n; i++){
//            c= a+b;
//            a=b;
//            b=c;
//        }
//        return answer;
//    }
    public int[] solution(int n) {
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;

        for(int i =2; i<n; i++){
            answer[i] = answer[i-2] + answer[i - 1];
        }

        return answer;
    }

    public static void main(String[] args){
        java04 T = new java04();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int x :T.solution(n)) System.out.println(x +" ");


    }
}
