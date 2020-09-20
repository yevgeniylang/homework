package homeWork3;

public class CalculatorMain {
    public static void main(String[] args) {
        CalcualtorWithOperator calc = new CalcualtorWithOperator();
        CalcualtorWithMathCopy calc2 = new CalcualtorWithMathCopy();
        CalcualtorWithMathExtends calc3 = new CalcualtorWithMathExtends();



//CalcualtorWithOperator calc = new CalcualtorWithOperator();

        double calcWO1 = calc.div(28,5);

        double calcWO2 = calc.power(calcWO1,2);

        double calcWO3 = calc.add(15,7);

        double calcWO4 = calc.plus(calcWO3, calcWO2);

        double calcWO5 = calc.plus(4.1, calcWO4);

        System.out.println("CalcualtorWithOperator = " + calcWO5);

        double calcWO6 = calc.div(calcWO5, 0);
        System.out.println("CalcualtorWithOperator /0 = "+calcWO6);//на нуль делить нельзя.

        double calcWO7 = calc.div(calcWO5, 0.0d);
        System.out.println("CalcualtorWithOperator /0.0d = "+calcWO7);//на нуль делить нельзя.
        System.out.println();


//CalcualtorWithMathCopy calc2 = new CalcualtorWithMathCopy();
        double calcWMC1 = calc2.div(28,5);

        double calcWMC2 = calc2.power(calcWMC1,2);

        double calcWMC3 = calc2.add(15,7);

        double calcWMC4 = calc2.plus(calcWMC3, calcWMC2);

        double calcWMC5 = calc2.plus(4.1, calcWMC4);

        System.out.println("CalcualtorWithMathCopy = "+calcWMC5);

        double calcWMC6 = calc2.div(calcWMC5, 0);
        System.out.println("CalcualtorWithMathCopy  /0 = " +calcWMC6);//на нуль делить нельзя.

        double calcWMC7 = calc2.div(calcWMC5, 0.0d);
        System.out.println("CalcualtorWithMathCopy  /0.0d = "+calcWMC7);//на нуль делить нельзя.
        System.out.println();

//CalcualtorWithMathExtends calc3 = new CalcualtorWithMathExtends();

        double calcWME1 = calc3.div(28,5);

        double calcWME2 = calc3.power(calcWME1,2);

        double calcWME3 = calc3.add(15,7);

        double calcWME4 = calc3.plus(calcWME3, calcWME2);

        double calcWME5 = calc3.plus(4.1, calcWME4);

        System.out.println("CalcualtorWithMathExtends = "+calcWME5);

        double calcWME6 = calc3.div(calcWME5, 0);
        System.out.println("CalcualtorWithMathExtends  /0 = " +calcWME6);//на нуль делить нельзя.

        double calcWME7 = calc3.div(calcWME5, 0.0d);
        System.out.println("CalcualtorWithMathExtends  /0.0d = "+calcWME7);//на нуль делить нельзя.


    }
}
