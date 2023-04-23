package ch11;

public class CalculatorTest {

    public static void main(String[] args) {
        // 형변환 가능
        Calc calc2 = new CompleteCalc();
        CompleteCalc calc = new CompleteCalc();

        int num1 = 10;
        int num2  = 2;

        System.out.println(num1 + "+" + num2 + "=" + calc.add(num1,num2));
        System.out.println(num1 + "-" + num2 + "=" + calc.substract(num1,num2));
        System.out.println(num1 + "*" + num2 + "=" + calc.times(num1,num2));
        System.out.println(num1 + "/" + num2 + "=" + calc.divide(num1,num2));

        System.out.println("=================");

        System.out.println(num1 + "+" + num2 + "=" + calc2.add(num1,num2));
        System.out.println(num1 + "-" + num2 + "=" + calc2.substract(num1,num2));
        System.out.println(num1 + "*" + num2 + "=" + calc2.times(num1,num2));
        System.out.println(num1 + "/" + num2 + "=" + calc2.divide(num1,num2));
    }
}
