package week2.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static week2.model.NumberConstants.*;

public class Number {
    private final String num;

    public Number(String num) {
        this.num = num;
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

    public String getNum() {
        return num;
    }
}
