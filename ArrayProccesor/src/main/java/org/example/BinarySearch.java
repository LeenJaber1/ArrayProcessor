package org.example;

public class BinarySearch implements Search {
    public int search(int[] arr, int target){
        int index=0;
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target)
                index = m;



            if (arr[m] < target)
                l = m + 1;


            else
                r = m - 1;
        }

        return index;
    }
}
