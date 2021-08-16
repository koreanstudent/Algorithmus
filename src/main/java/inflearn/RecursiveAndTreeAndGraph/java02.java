package inflearn.RecursiveAndTreeAndGraph;

//2. 재귀함수 -> 이진수 출력
// 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램 작성
//
//입력예제 1
//11
//출력예제 1
//1101

public class java02 {
    public void DFS(int n) {
        if(n==0) return;
        else{
            DFS(n/2);
            System.out.println(n%2+ " ");
        }
    }

    public static void main(String[] args){
        java02 T = new java02();
        T.DFS(11);

    }
}
