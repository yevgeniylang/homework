package homework2;

import java.util.Scanner;

public class Array2_1_3_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Введите размер массива: ");
        int num = scan.nextInt();
        int [] array = new int[num];
        System.out.println("Введите данные массива: ");
        for (int i = 0; i<num; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Введеные значения массива: ");
        for (int i = 0; i<num; i++) {
            System.out.println(" "+array[i]);}
            System.out.println("Второй элемент массива: " + array[1]);
        }

        }



