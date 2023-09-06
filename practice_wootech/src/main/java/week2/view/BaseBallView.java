package week2.view;

import week2.model.Number;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BaseBallView {

    public static final int ALL_STRIKE = 3;
    public static final int NO_STRIKE = 0;
    public static final int NO_BOLL = 0;
    public static final String GAME_START = "1";
    public static final String GAME_STOP = "2";
    public static final Integer NUMBER_LENGTH = 3;

    private final Scanner scanner;

    public BaseBallView(InputStream in) {
        this.scanner = new Scanner(in);
    }

    public void gameStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public boolean isContinue() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String toggleContinue = scanner.nextLine();

        if (toggleContinue.equals(GAME_START)) {
            return true;
        } else if (toggleContinue.equals(GAME_STOP)) {
            return false;
        }

        throw new IllegalArgumentException("1 또는 2만 입력해야 합니다.");
    }

    public boolean adviceResult(Integer strike, Integer boll) {
        if (strike == ALL_STRIKE) {
            return processAllStrike();
        } else if (strike == NO_STRIKE && boll == NO_BOLL) {
            return processNothing();
        } else {
            return processStrikeAndBoll(strike, boll);
        }
    }

    private static boolean processStrikeAndBoll(Integer strike, Integer boll) {
        String resultStrike = "";
        String resultBoll = "";

        if (boll != NO_BOLL) {
            resultBoll = String.format("%s볼 ", boll);
        }
        if (strike != NO_STRIKE) {
            resultStrike = String.format("%s스트라이크", strike);
        }

        System.out.printf("%s%s\n", resultBoll, resultStrike);
        return false;
    }

    private static boolean processNothing() {
        System.out.println("낫싱");
        return false;
    }

    private static boolean processAllStrike() {
        System.out.println("3스트라이크");
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        return true;
    }

    public Number inputMyNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String number = scanner.nextLine();

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
        if (number.length() != NUMBER_LENGTH) {
            throw new IllegalArgumentException("숫자의 길이는 3 이여야합니다.");
        }
    }

    public void validateDifferentNumber(String number) {
        Set<Character> digits = new HashSet<>();

        for (char c : number.toCharArray()) {
            digits.add(c);
        }

        // Set 을 통해 중복제거 된 길이와 기존 String 의 길이 비교
        if (digits.size() != NUMBER_LENGTH) {
            throw new IllegalArgumentException("숫자는 전부 다른 숫자여야 합니다.");
        }
    }
}
