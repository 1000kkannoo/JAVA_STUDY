package week2.view;

import week2.model.Number;

import java.util.*;

public class BaseBallView {

    public void gameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public Boolean isContinue() {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            Scanner sc = new Scanner(System.in);
            String toggleContinue = sc.nextLine();

        return toggleContinue.equals("1");
    }

    public boolean adviceResult(Integer strike, Integer boll) {
        if (strike == 3) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        } else if (strike == 0 && boll == 0) {
            System.out.println("낫싱");
            return false;
        } else {
            String resultStrike = "";
            String resultBoll = "";

            if (boll != 0) {
                resultBoll = String.format("%s볼 ", boll);
            }
            if (strike != 0) {
                resultStrike = String.format("%s스트라이크", strike);
            }

            System.out.printf("%s%s\n", resultBoll, resultStrike);
            return false;
        }
    }

    public Number inputMyNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        validateNumericInput(number);
        validateNumericLength(number);
        validateDifferentNumber(number);

        return new Number(number);
    }

    public void validateNumericInput(String number) {
        if (number.matches("\\d+") == false) {
            throw new IllegalArgumentException("숫자를 입력해야 합니다.");
        }
    }

    public void validateNumericLength(String number) {
        if (number.length() != 3) {
            throw new IllegalArgumentException("숫자의 길이는 3 이여야합니다.");
        }
    }

    public void validateDifferentNumber(String number) {
        Set<Character> digits = new HashSet<>();

        for (char c : number.toCharArray()) {
            digits.add(c);
        }

        // Set 을 통해 중복제거 된 길이와 기존 String 의 길이 비교
        if (digits.size() != number.length()) {
            throw new IllegalArgumentException("숫자는 전부 다른 숫자여야 합니다.");
        }
    }
}
