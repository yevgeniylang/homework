package homework2;

public class Cycle1_1 {
    public static void main(String[] args){
    int number = Integer.parseInt(args[0]);
        if (number < 0) {
            System.out.println("Число не может быть отрицательным");
        }else {
            String result = "";
            String separator = "*";
            int fact = 1;
            for (int x = 1; x <= number; x++) {
                fact = fact * x;
                result = x + separator + result;
            }
            System.out.println("Факториал " + number + " = " + result + " = " + fact);
        }}}



