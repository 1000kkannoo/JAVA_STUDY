package week2.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Number {
    private final String num;

    public Number(String num) {
        this.num = num;
    }

    public String getNum() {
        return num;
    }

    public static Number createRandNumber() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Collections.shuffle(numbers);

        StringBuilder computerNumber = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            computerNumber.append(numbers.get(i));
        }

        return new Number(computerNumber.toString());
    }

    public Integer checkStrike(Number myNumber) {
        String myNum = myNumber.getNum();
        int strike = 0;

        for (int i = 0; i < num.length(); i++) {
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
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != myNum.charAt(i) && num.contains(split[i])) {
                boll++;
            }
        }

        return boll;
    }
}
