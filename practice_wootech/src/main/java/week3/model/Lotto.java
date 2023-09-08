package week3.model;

import java.util.*;

import static week3.model.LottoConstants.*;

public class Lotto {

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public static Double calculateProfitRate(Map<Integer, Integer> result, Integer buy) {
        int sum = 0;

        for (Integer key : result.keySet()) {
            sum += LottoMatchConstants.calculatePrize(key) * result.get(key);
        }

        double profitRate = ((double) (sum - buy) / buy) * 100;

        // 소수점 둘째 자리에서 반올림
        profitRate = Math.round(profitRate * 10) / 10.0;

        return 100 + profitRate;
    }

    public static List<Lotto> createLottoList(Integer price) {
        price /= 1000;

        List<Lotto> LottoList = new ArrayList<>();
        while (price --> 0) {
            LottoList.add(createLotto());
        }

        return LottoList;
    }

    public static Lotto createLotto() {
        List<Integer> settingNumbers = new ArrayList<>();
        for (int i = LOTTO_MIN; i <= LOTTO_MAX; i++) {
            settingNumbers.add(i);
        }
        Collections.shuffle(settingNumbers);

        List<Integer> randNumbers = settingNumbers.subList(0, LOTTO_COUNT);
        randNumbers.sort(Comparator.naturalOrder());

        return new Lotto(randNumbers);
    }

    public static Map<Integer, Integer> verifyLottoResult(
            List<Lotto> lottoList, List<Integer> winningNumbers, Integer bonusNumber
    ) {
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (Lotto lotto : lottoList) {
            int count = 0;
            for (Integer number : lotto.getNumbers()) {
                if (winningNumbers.contains(number)) {
                    count++;
                }
            }

            if (count == 5 && lotto.getNumbers().contains(bonusNumber)) {
                resultMap.put(0, resultMap.getOrDefault(0, 0) + 1);
            } else {
                if (count >= 3) {
                    System.out.println(count);
                    resultMap.put(count, resultMap.getOrDefault(count, 0) + 1);
                }
            }
        }

        return resultMap;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }
}
