package sorting;

public class BubbleSort {

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void sort(Comparable a[]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < (a.length - i); j++) {
                if (less(a[j], a[j - 1])) {
                    exch(a, j, j - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer v[] = {45, 23, 34, 6, 3, 9};
        BubbleSort.sort(v);

        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }

}
