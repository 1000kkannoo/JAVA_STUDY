package week3.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class LottoViewTest {

    private final LottoView lottoView = new LottoView(System.in);

    @DisplayName("String 으로 입력받은 번호를 List<Integer>로 변환한다.")
    @Test
    void getIntegerNumbers() {
        // given

        // when
        List<Integer> integerNumbers = lottoView.getIntegerNumbers("1,2,3,4,5,6");

        // then
        assertThat(integerNumbers)
                .hasSize(6)
                .contains(1, 2, 3, 4, 5, 6);
    }

    @DisplayName("사용자가 로또 당첨 번호를 6자리를 입력하지 않은 경우 Exception 발생한다.")
    @Test
    void validateInputWinningNumbers() {
        // given

        // when // then
        assertThatThrownBy(() -> lottoView.validateInputWinningNumbers(List.of(1, 2, 3, 4, 5)))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 당첨 번호를 총 6개 입력해야 합니다.");
    }

    @DisplayName("사용자가 1 ~ 45 범위의 숫자를 입력하지 않은 경우 Exception 발생한다.")
    @Test
    void checkLottoNumberRangeWithZero() {
        // given

        // when // then
        assertThatThrownBy(() -> lottoView.checkLottoNumberRange(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
    }

    @DisplayName("사용자가 1 ~ 45 범위의 숫자를 입력하지 않은 경우 Exception 발생한다.")
    @Test
    void checkLottoNumberRangeWithMax() {
        // given

        // when // then
        assertThatThrownBy(() -> lottoView.checkLottoNumberRange(46))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 로또 번호는 1부터 45 사이의 숫자여야 합니다.");
    }
}