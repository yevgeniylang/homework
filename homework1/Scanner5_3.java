package homework1;

import java.util.Objects;
import java.util.Scanner;

public class Scanner5_3 {
    public static void main(String[] args) {
        System.out.println("Введите имя ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
    //    System.out.println("Вы ввели " + name);

        String anastasiaya = "Анастасия";
        String vasya = "Вася";


        switch (name) {
            case "Вася" :
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
            break;
            case "Анастасия":
            System.out.println("Я тебя так долго ждал");
                break;
            default:
            System.out.println("Добрый день, а вы кто?");

        }
    }}

