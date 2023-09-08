package week3.service;

import week3.model.Lotto;
import week3.model.LottoMatchUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LottoService {

    public static final int MATCH5_BONUS = 0;

    // 로또 결과 계산
    public Map<Integer, Integer> verifyLottoResult(
            List<Lotto> lottoList, Set<Integer> winningNumbers, Integer bonusNumber
    ) {
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (Lotto lotto : lottoList) {
            int count = checkHitCount(winningNumbers, lotto);
            updateResultMapWithHitCount(bonusNumber, resultMap, lotto, count);
        }

        return resultMap;
    }

    private static void updateResultMapWithHitCount(Integer bonusNumber, Map<Integer, Integer> resultMap, Lotto lotto, int count) {
        if (count == 5 && lotto.getNumbers().contains(bonusNumber)) {
            resultMap.put(MATCH5_BONUS, resultMap.getOrDefault(MATCH5_BONUS, 0) + 1);
        } else if (count >= 3) {
            resultMap.put(count, resultMap.getOrDefault(count, 0) + 1);
        }
    }

    private static int checkHitCount(Set<Integer> winningNumbers, Lotto lotto) {
        return (int) lotto.getNumbers().stream()
                .filter(winningNumbers::contains)
                .count();
    }

    // 로또 수익률 계산
    public Double calculateProfitRate(Map<Integer, Integer> result, Integer buy) {
        int sum = 0;

        for (Integer key : result.keySet()) {
            sum += LottoMatchUtils.calculatePrize(key) * result.get(key);
        }

        double profitRate = ((double) (sum - buy) / buy) * 100;

        // 소수점 둘째 자리에서 반올림
        profitRate = Math.round(profitRate * 10) / 10.0;

        return 100 + profitRate;
    }
}
