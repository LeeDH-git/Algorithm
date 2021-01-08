package Algorithm.Sort;

public class InsertionSort {
    /* N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요 (삽입정렬)
     * 입력예제
     * 11 7 5 6 10 9
     * 출력예제
     * 5 6 7 9 10 11*/
    public static void main(String[] args) {
        int[] a = {11, 7, 5, 6, 10, 9};

        for (int i = 1; i < a.length; i++) {
            int standard = a[i];  // 기준
            int aux = i - 1;   // 비교할 대상

            while (aux >= 0 && standard < a[aux]) {
                a[aux + 1] = a[aux];   // 비교대상이 큰 경우 오른쪽으로 밀어냄
                aux--;
            }
            a[aux + 1] = standard;  // 기준값 저장
        }

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

}
