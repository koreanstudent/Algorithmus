package inflearn.RecursiveAndTreeAndGraph;

import java.util.Scanner;

//1. 재귀함수
// 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성
//
//입력예제 1
//3
//출력예제 1
//1 2 3

public class java01 {
    public void DFS(int n) {
        if(n==0) return;
        else{
            DFS(n-1);
            System.out.println(n+ " ");
        }
    }

    public static void main(String[] args){
        java01 T = new java01();
        T.DFS(3);


    }
}
