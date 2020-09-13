package homework2;

import java.util.Arrays;

public class BubbleSorterRandom {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10);
        }

        System.out.print(Arrays.toString(arr) + " -> ");
            BubbleSorterAlgoritm.sort(arr);
            System.out.println(Arrays.toString(arr));

            }
        }


