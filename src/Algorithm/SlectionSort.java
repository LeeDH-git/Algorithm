package Algorithm;

public class SlectionSort {
    public static void main(String[] args) {

        int[] a = {1, 13, 7, 15, 29, 4, 36, 14, 40, 2, 34};
        int b;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    b = a[j];
                    a[j] = a[i];
                    a[i] = b;
                }
            }
        }
        for (int i : a) {
            System.out.println(i);
        }
    }

}
