package inflearn.stackAndQueue;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

//  1. 올바른 괄호
//        설명
//
//        괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
//
//        (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
//
//
//        입력
//        첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
//
//
//        출력
//        첫 번째 줄에 YES, NO를 출력한다.
//
//
//        예시 입력 1
//
//        (()(()))(()
//        예시 출력 1
//
//        NO

public class java01 {
    public String solution( String s) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args){
        java01 T = new java01();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(T.solution( str));


    }
}
