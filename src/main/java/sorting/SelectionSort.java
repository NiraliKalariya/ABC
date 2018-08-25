package sorting;

public class SelectionSort {
    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void sort(Comparable a[]) {

        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    public static void main(String[] args) {
        Integer[] v = {10, 5, 6, 90, 7};
        SelectionSort.sort(v);
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }

        String a[] = {"Peter", "Raj", "Alex", "Alax"};
        SelectionSort.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
