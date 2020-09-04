package homework1;

import java.util.Objects;
import java.util.Scanner;

public class Scanner5_2 {
    public static void main(String[] args) {
        System.out.println("Введите имя ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
    //    System.out.println("Вы ввели " + name);

        String anastasiaya = "Анастасия";


        if (Objects.equals("Вася", name)) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }else if
        (Objects.equals("Анастасия", name)) {
            System.out.println("Я тебя так долго ждал");
        }else{
            System.out.println("Добрый день, а вы кто?");
        }
    }}

