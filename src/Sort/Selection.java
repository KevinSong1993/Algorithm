package Sort;

import java.util.Arrays;

public class Selection {

    private static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++){
            int min = i;
            //讲a[i]和a[i+1..N]中最小元素交换
            for(int j = i + 1; j < N; j++){
                if (less(a[j],a[min])){
                    min = j;
                }
            }
            exch(a, i, min);
            System.out.println(Arrays.toString(a));
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
