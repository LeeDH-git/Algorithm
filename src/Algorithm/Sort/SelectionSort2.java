package Algorithm.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort2 {
    /* 3등의 성적은? N명의 수학성적이 주어지면 그 중 3등을 한 수학 성적을 출력하는 프로그램을 작성하세요.
     * 입력 예제: 80 96 75 82 96 92 100 */

    public static void main(String[] args) throws IOException {

        System.out.print("학생수를 입력하세요 : ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] a = new int[num];

        System.out.println("학생수 : " + a.length + "명");

        for (int i = 0; i < num; i++) {
            System.out.println("점수를 입력하세요 : ");
            a[i] = Integer.parseInt(br.readLine());
        }

        int b, cnt = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    b = a[j];
                    a[j] = a[i];
                    a[i] = b;
                }
            }
        }

        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] != a[i])
                cnt++;
            if (cnt == 2) {
                System.out.println("3등 : " + a[i]);
                break;
            }

        }
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
