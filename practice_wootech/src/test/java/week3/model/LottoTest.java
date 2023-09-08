package week3.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LottoTest {

    @DisplayName("1 ~ 45로 구성된 6자리 로또가 생성된다.")
    @Test
    void createLotto() {
        // given

        // when
        Lotto lotto = Lotto.createLotto();
        List<Integer> lottoNumbers = lotto.getNumbers();

        // then
        assertThat(lottoNumbers)
                .hasSize(6)
                .allMatch(number -> number >= 1 && number <= 45);
    }

    @DisplayName("6000원이면 로또가 6개 생성된다.")
    @Test
    void createLottoList() {
        // given

        // when
        List<Lotto> lottoList = Lotto.createLottoList(6000);

        // then
        assertThat(lottoList)
                .hasSize(6);
    }
}