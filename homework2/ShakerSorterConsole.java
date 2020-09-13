package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class ShakerSorterConsole {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Введите размер массива: ");
        int num = scan.nextInt();
        int [] array = new int[num];
        System.out.println("Введите данные массива: ");
        for (int i = 0; i<num; i++) {
            array[i] = scan.nextInt();
        }

        System.out.print(Arrays.toString(array) + " -> ");
        ShakerSorterAlgoritm.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
