package week3.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week3.model.Lotto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class LottoServiceTest {

    private final LottoService lottoService = new LottoService();

    @DisplayName("사용자가 로또 당첨 여부가 Map 형태로 생성된다.")
    @Test
    void verifyLottoResult() {
        // given
        Lotto lotto1 = new Lotto(List.of(1, 2, 3, 33, 35, 45));
        Lotto lotto2 = new Lotto(List.of(1, 2, 3, 33, 35, 45));
        Lotto lotto3 = new Lotto(List.of(1, 33, 34, 35, 40, 42));
        Lotto lotto4 = new Lotto(List.of(33, 34, 35, 40, 42, 45));

        List<Lotto> lottoList = List.of(lotto1, lotto2, lotto3, lotto4);

        List<Integer> winningNumbers = List.of(1, 33, 34, 35, 40, 42);

        // when
        Map<Integer, Integer> resultMap = lottoService.verifyLottoResult(lottoList, winningNumbers, 45);

        // then
        assertThat(resultMap)
                .hasSize(3)
                .containsEntry(3, 2)
                .containsEntry(0, 1)
                .containsEntry(6, 1);
    }

    @DisplayName("로또 8장을 구매하고 3개 일치 하나만 있을 경우의 수익률을 계산한다.")
    @Test
    void calculateProfitRate() {
        // given
        Map<Integer, Integer> resultMap = new HashMap<>();
        resultMap.put(3, 1);

        // when
        Double result = lottoService.calculateProfitRate(resultMap, 8000);

        // then
        assertThat(result).isEqualTo(62.5);
    }

    @DisplayName("로또 10장을 구매하고 3개 일치 두개만 있을 경우의 수익률을 계산한다.")
    @Test
    void calculateProfitRate2() {
        // given
        Map<Integer, Integer> resultMap = new HashMap<>();
        resultMap.put(3, 2);

        // when
        Double result = lottoService.calculateProfitRate(resultMap, 10000);

        // then
        assertThat(result).isEqualTo(100.0);
    }

    @DisplayName("로또 10장을 구매하고 3개 일치 네개만 있을 경우의 수익률을 계산한다.")
    @Test
    void calculateProfitRate3() {
        // given
        Map<Integer, Integer> resultMap = new HashMap<>();
        resultMap.put(3, 4);

        // when
        Double result = lottoService.calculateProfitRate(resultMap, 10000);

        // then
        assertThat(result).isEqualTo(200.0);
    }
}