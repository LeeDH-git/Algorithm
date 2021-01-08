package Algorithm.Sort;

public class InsertionSort {
    /* N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요 (삽입정렬)
     * 입력예제
     * 11 7 5 6 10 9
     * 출력예제
     * 5 6 7 9 10 11*/
    public static void main(String[] args) {
        /* 삽입정렬은 앞에서부터 차례대로 배열의 두번째 부터 비교를 하며 연산을 한다
         * 첫번째 11과 7을 비교하여 기준값인 7이 11보다 작으므로 7의 자리에 11을 삽입
         * 이제 다음 인덱스인 5가 기준값이 되어 7과 비교 기준값인 5보다 7이 크므로 기준값인 5의 자리에 7을 삽입한다
         * 이런식으로 인덱스가 끝날때까지 비교를 반복한다
         */
        int[] a = {11, 7, 5, 6, 10, 9};

        for (int i = 1; i < a.length; i++) {
            int std = a[i];  // 기준
            int compv  = i - 1;   // 비교할 대상

            while (compv >= 0 && std < a[compv]) {
                a[compv + 1] = a[compv];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
                compv--;
            }
            a[compv + 1] = std;  // 기준값 저장
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
