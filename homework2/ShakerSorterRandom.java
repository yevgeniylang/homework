package homework2;

import java.util.Arrays;

public class ShakerSorterRandom {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        //algoritm
        int left = 1;
        int right = array.length - 1;
        do{
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
    }while (left <= right);
        System.out.println();
        for(int i = 0; i<array.length;i++){
            System.out.print(Arrays.toString(array) + " -> ");
            System.out.println(Arrays.toString(array));
        }}}

