package homeWork3;

public class CalcualtorWithOperator {
    public double plus(double a, double b){ return a + b; }

    public double minus(double a, double b){
        return a - b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double add(double a, double b) {
        return a * b;
    }

    public double abs(double a){
        return a > 0 ? a: -a;
    }

    public double power(double a, int b) {
        double result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }

        return result;
    }
}
