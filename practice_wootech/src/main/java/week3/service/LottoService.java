package week3.service;

import week3.model.Lotto;
import week3.model.LottoMatchConstants;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LottoService {

    public Double calculateProfitRate(Map<Integer, Integer> result, Integer buy) {
        int sum = 0;

        for (Integer key : result.keySet()) {
            sum += LottoMatchConstants.calculatePrize(key) * result.get(key);
        }

        double profitRate = ((double) (sum - buy) / buy) * 100;

        // 소수점 둘째 자리에서 반올림
        profitRate = Math.round(profitRate * 10) / 10.0;

        return 100 + profitRate;
    }

    public Map<Integer, Integer> verifyLottoResult(
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
                    resultMap.put(count, resultMap.getOrDefault(count, 0) + 1);
                }
            }
        }

        return resultMap;
    }
}
