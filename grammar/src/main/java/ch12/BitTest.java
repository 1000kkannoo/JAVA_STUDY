package ch12;

public class BitTest {

    public static void main(String[] args) {
        int num1 = 5;   // 00000101
        int num2 = 10;  // 00001010

        System.out.println(num1 | num2); // 15
        System.out.println(num1 & num2); // 0
        System.out.println(num1 ^ num2); // 15

        System.out.println(num1 <<= 2); // 20
        System.out.println(num1); // 5
    }
}
