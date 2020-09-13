package homework2;

import java.util.Arrays;

public class ShakerSorter {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5, 6},
                {1, 1, 1, 1},
                {9, 1, 5, 99, 9, 9},
                {},
        };
        for (int[] num : arr) {
            System.out.print(Arrays.toString(num) + " -> ");
            ShakerSorterAlgoritm.sort(num);
            System.out.println(Arrays.toString(num));
        }
    }
}
