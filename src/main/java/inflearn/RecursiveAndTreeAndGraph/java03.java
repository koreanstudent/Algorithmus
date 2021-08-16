package inflearn.RecursiveAndTreeAndGraph;

//3. 팩토리얼
// 자연수 N이 입력되면 N!를 구하는 프로그램
//
//입력예제 1
//5
//출력예제 1
//120

public class java03 {
    public int DFS(int n) {

        if(n==1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args){
        java03 T = new java03();
        System.out.println(T.DFS(5));

    }
}
