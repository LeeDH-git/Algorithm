package Algorithm.Sort;

public class BubbleSort {
    /* N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
     * 입력 예제
     * 13 23 11 7 5 15
     * 출력 예제
     * 5 7 11 13 15 23 */

    public static void bubblesort(int[] arr) {
        /* 배열을 순차탐색하여 i, i+1번째 요소를 비교하여 큰 것을 뒤로 이동
         * 위 과정이 1번 처리되는 경우 가장 큰 수가 배열 마지막에 위치 함
         * 다음 탐색 부터는 마지막 요소는 안해도 됨 (그래서 내부에 있는 for문은 arr.length - i 까지만 탐색) */

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = new int[]{13, 23, 11, 7, 5, 15};
        BubbleSort.bubblesort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
