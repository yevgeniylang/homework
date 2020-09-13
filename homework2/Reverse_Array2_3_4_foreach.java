package homework2;

import java.util.Scanner;

public class Reverse_Array2_3_4_foreach {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
      System.out.print("Введите размер массива: ");
      int num = scan.nextInt();
        int[] array = new int [num];
        System.out.println("Введите данные массива: ");
        for (int i = num; i>0; i--) {
            array[i-1] = scan.nextInt();
        }
        System.out.println("Введеные значения массива: ");
        for (int element : array) {
            System.out.println(element);}

        }
    }





