package Search;

import java.util.Arrays;

public class BinarySearch {

    public static int rank(int key,int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            }
            else if (key > a[mid]) {
                lo = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = {6,7,9,2,1,8,4,3,2};
        Arrays.sort(whitelist);
        int[] test = {1,2,3,4,5};
        for (int key : test) {
            if (rank(key, whitelist) < 0) {
                System.out.println(key);
            }
        }
    }
}
