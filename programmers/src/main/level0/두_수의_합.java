package main.level0;

import java.math.BigInteger;

public class 두_수의_합 {
    public static void main(String[] args) {
        System.out.println(solution("18446744073709551615", "287346502836570928366"));
    }

    public static String solution(String a, String b) {
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        return num1.add(num2).toString();
    }
}