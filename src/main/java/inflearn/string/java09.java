package inflearn.string;

import java.util.Scanner;

//    9. 숫자만 추출
//        설명
//
//        문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
//
//        만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
//
//        추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
//
//
//        입력
//        첫 줄에 숫자가 썩인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
//
//
//        출력
//        첫 줄에 자연수를 출력합니다.
//
//
//        예시 입력 1
//
//        g0en2T0s8eSoft
//        예시 출력 1
//
//        208

public class java09 {
    public int solution(String str) {
//        int answer =0;
//        for(char x : str.toCharArray()){
//            if(x >=48 && x<=57) answer = answer *10 + (x-48); // x >=48 && x<=57 48~57 사이면 '0' ~ '9' 문자형 숫자 x가 '0'이면 48
//        }
        String answer="";
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) answer+=x;
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args){
        java09 T = new java09();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(T.solution(str));
    }
}
