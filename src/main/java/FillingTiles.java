// 백준 알고리즘 2133
// 3×N 크기의 벽을 2×1, 1×2 크기의 타일로 채우는 경우의 수를 구해보자.
// Input  첫째 줄에 N(1 ≤ N ≤ 30)이 주어진다.
// Output 첫째 줄에 경우의 수를 출력한다.

import java.util.Scanner;

public class FillingTiles {

    static int[] arr = new int[31];  // dp 값 저장을 위한 배열
    static int result;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // 입력

        System.out.print(dp(N));  // 출력

    }

    public static int dp(int x) {

        if (x == 0) return 1;   // 3x0 에 타일을 채울 수 있는 경우의 수는 1개 (아무것도 놓지 않는 경우) / 이 경우를 빼면 런터임 에러가 발생함.
        if (x == 1) return 0;     // 3x1 에 타일을 채울 수 있는 경우는 0개
        if (x == 2) return 3;   // 3x2 에 타일을 채울 수 있는 경우는 3개
        if (arr[x] != 0) return arr[x];

        result = 3 * dp(x - 2);

        for (int i = 3; x >= i; ++i) {    // x-4 , x-6 , x-8 , ~~~ 0 에서 각각 2개의 경우의 수가 추가로 발생된다. 위에서 x가 0일때의 return 설정을 하지 않으면 여기서 에러발생.
            if(i % 2 ==0){
                result += 2 * dp(x - i);
            }
        }
		return arr[x]=result;
    }

}
