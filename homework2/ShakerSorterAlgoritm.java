package homework2;

import java.util.Arrays;

public class ShakerSorterAlgoritm {
    public static void sort(int[] array) {

        int left = 1;
        int right = array.length - 1;
        for (int i = right; i >= left; i--) {
            if (array[i - 1] > array[i]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
        }
        left++;
        for (int i = left; i <= right; i++) {
            if (array[i - 1] > array[i]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
        }
        right--;

        }}

