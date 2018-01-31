package Sort;

import java.util.Arrays;

public class Shell {

    private static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N/3){
            h = h * 3 + 1;
        }
        while (h >= 1){
            for (int i = h; i < N; i++){
                for (int j = i; j >= h && less(a[j],a[j-h]); j = j - h){
                    exch(a, j, j-h);
                    System.out.println(Arrays.toString(a));
                }
            }
            h = h/3;
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (Comparable A : a) {
            System.out.print(A + " ");
        }
        System.out.println();
    }

    private static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++){
            if (less(a[i],a[i-1])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = {"bed","bug","all","yet","dad","yes","zoo"};
        sort(a);
        show(a);
    }
}
