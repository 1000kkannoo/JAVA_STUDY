package week2.service;

import week2.model.Number;

import static week2.model.NumberConstants.MAX_DIGITS;

public class BaseBallService {

    public Integer countStrike(Number computerNumber, Number myNumber) {
        String computerNum = computerNumber.getNum();
        String myNum = myNumber.getNum();
        int strike = 0;

        for (int i = 0; i < MAX_DIGITS; i++) {
            if (computerNum.charAt(i) == myNum.charAt(i)) {
                strike++;
            }
        }

        return strike;
    }

    public Integer countBoll(Number computerNumber, Number myNumber) {
        String computerNum = computerNumber.getNum();
        String myNum = myNumber.getNum();
        int boll = 0;

        String[] split = myNum.split("");
        for (int i = 0; i < MAX_DIGITS; i++) {
            if (computerNum.charAt(i) != myNum.charAt(i) && computerNum.contains(split[i])) {
                boll++;
            }
        }

        return boll;
    }
}
