package week2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Number {
    public static final int MAX_DIGITS = 3;
    public static final List<Integer> ALL_DIGITS = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

    private final String num;

    public Number(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public static Number createRandNumber() {
        List<Integer> numbers = new ArrayList<>(ALL_DIGITS);
        Collections.shuffle(numbers);

        StringBuilder computerNumber = new StringBuilder();
        for (int i = 0; i < MAX_DIGITS; i++) {
            computerNumber.append(numbers.get(i));
        }

        return new Number(computerNumber.toString());
    }

    public Integer checkStrike(Number myNumber) {
        String myNum = myNumber.getNum();
        int strike = 0;

        for (int i = 0; i < MAX_DIGITS; i++) {
            if (num.charAt(i) == myNum.charAt(i)) {
                strike++;
            }
        }

        return strike;
    }

    public Integer checkBoll(Number myNumber) {
        String myNum = myNumber.getNum();
        int boll = 0;

        String[] split = myNum.split("");
        for (int i = 0; i < MAX_DIGITS; i++) {
            if (num.charAt(i) != myNum.charAt(i) && num.contains(split[i])) {
                boll++;
            }
        }

        return boll;
    }
}
