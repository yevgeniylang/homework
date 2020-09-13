package homework2;

import java.util.Scanner;

public class Cycle1_3 {
    public static void main(String[] args) {
        System.out.println("Возведение одного числа в стпень другого");
        System.out.print("Введите возводимое число = ");
        Scanner scan1 = new Scanner(System.in);
        double num1 = scan1.nextDouble();

        System.out.print("Введите степень возводимого числа = ");
        Scanner scan2 = new Scanner(System.in);
        int num2 = scan2.nextInt();

        System.out.println(Math.pow(num1, num2));
    }
}



