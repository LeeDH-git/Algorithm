package Algorithm.Sort;

public class BubbleSort {
    /* N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
     * 입력 예제
     * 13 23 11 7 5 15
     * 출력 예제
     * 5 7 11 13 15 23 */
    public static void main(String[] args) {
        /* 배열을 순차탐색하여 i, i+1번째 요소를 비교하여 큰 것을 뒤로 이동
         * 위 과정이 처음 처리될때 가장 큰 수가 배열 마지막에 오도록 정렬이 됨
         * 따라서 그 다음 탐색 부터는 마지막은 비교를 안해도 됨
         * 그러므로 내부에 있는 for문은 a.length - i 까지만 탐색한다. */
        int[] a = {13, 23, 11, 7, 5, 15};
        int b;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    b = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = b;
                }
            }
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
