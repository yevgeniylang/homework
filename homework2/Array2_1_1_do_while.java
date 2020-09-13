package homework2;

import java.util.Scanner;

public class Array2_1_1_do_while {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Введите размер массива: ");
        int num = scan.nextInt();
        int [] array = new int[num];
        System.out.println("Введите данные массива: ");
        for (int i = 0; i<num; i++) {
            array[i] = scan.nextInt();
        }

        int i = 0;
        String text = "Введеные значения массива: ";
        do{
            text = text + array[i]+ " ";
            i++;
        }
        while (i  < array.length);

            System.out.println(text);
        System.out.println("Второй элемент массива: " + array[1]);
        }}



