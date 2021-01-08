package Algorithm.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort2 {
    /* N개의 정수가 입력되면 음의 정수는 앞쪽에 양의 정수는 뒷쪽에 있어야 한다.
     * 또한 양의 정수와 음의 정수의 순서에는 변함이 없어야 함
     * 입력 예제
     * 1 2 3 -3 -2 5 6 -6
     * 출력 예제
     * -3 -2 -6 1 2 3 5 6*/

    public static void main(String[] args) throws IOException {
        System.out.print("배열의 크기를 입력하세요 : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] a = new int[num];

        System.out.println("배열크기 : " + a.length);

        for (int i = 0; i < num; i++) {
            System.out.println("정수를 입력하세요 : ");
            a[i] = Integer.parseInt(br.readLine());
        }
    }
}
