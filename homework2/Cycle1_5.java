package homework2;

import java.util.Scanner;

public class Cycle1_5 {
    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            String s = "";
            for (int y = 1; y < 10; y++) {
                s += (Integer.toString(y) + "*" + Integer.toString(x) + "=" + Integer.toString(y * x)+"\t");
            }
                System.out.println(s);

        }
    }}



