package homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Array2_1_4_foreach {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
      System.out.print("Введите размер массива: ");
      int num = scan.nextInt();
        int[] array = new int [num];
        System.out.println("Введите данные массива: ");
        for (int i = 0; i<num; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Введеные значения массива: ");
        for (int element : array) {
            System.out.println(element);}
            System.out.println("Второй элемент массива: " + array[1]);
        }
    }





