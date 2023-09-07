package week3.view;

import week3.model.Lotto;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LottoView {
    private final Scanner sc;

    public LottoView(InputStream in) {
        this.sc = new Scanner(in);
    }

    // View
    public Integer inputPurchasePrice() {
        System.out.println("구입금액을 입력해 주세요.");
        return sc.nextInt();
    }

    public void purchaseResult(List<Lotto> lottoList) {
        System.out.printf("%s개를 구매했습니다.", lottoList.size());
        for (Lotto lotto : lottoList) {
            System.out.println(lotto.getNumbers());
        }
    }

    public List<Integer> inputWinningNumbers() {
        System.out.println("당첨 번호를 입력해 주세요.");

        String numbers = sc.nextLine();
        List<Integer> numberList = getIntegerNumbers(numbers);

        validateInputWinningNumbers(numberList);
        return numberList;
    }

    public Integer inputBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");
        int inputNumber = sc.nextInt();
        checkLottoNumberRange(inputNumber);
        return inputNumber;
    }

    public void lottoResult(Map<Integer, Integer> result, Double rate) {
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.printf("3개 일치 (5,000원) - %s개\n", result.getOrDefault(3, 0));
        System.out.printf("4개 일치 (5,000원) - %s개\n", result.getOrDefault(4, 0));
        System.out.printf("5개 일치 (5,000원) - %s개\n", result.getOrDefault(5, 0));
        System.out.printf("5개 일치, 보너스 볼 일치 (5,000원) - %s개\n", result.getOrDefault(0, 0));
        System.out.printf("6개 일치 (5,000원) - %s개\n", result.getOrDefault(3, 0));
        System.out.println("총 수익률은 " + rate + "%입니다.");
    }

    public List<Integer> getIntegerNumbers(String numbers) {
        return Arrays.stream(numbers.split(","))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    // Validate
    public void validateInputWinningNumbers(List<Integer> inputNumbers) {
        if (inputNumbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 당첨 번호를 총 6개 입력해야 합니다.");
        }

        for (Integer inputNumber : inputNumbers) {
            checkLottoNumberRange(inputNumber);
        }
    }

    public void checkLottoNumberRange(Integer inputNumber) {
        if (inputNumber < 1 || inputNumber > 45) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
        }
    }
}
