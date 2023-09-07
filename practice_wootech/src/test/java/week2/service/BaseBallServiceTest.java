package week2.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week2.model.Number;

import static org.assertj.core.api.Assertions.assertThat;

class BaseBallServiceTest {

    private final BaseBallService baseBallService = new BaseBallService();

    @DisplayName("유저가 자신이 입력한 숫자가 몇 strike 인지 확인한다.")
    @Test
    void checkStrike() {
        // given
        Number computerNumber = new Number("534");
        Number myNumber = new Number("134");

        // when
        Integer strike = baseBallService.countStrike(computerNumber, myNumber);

        // then
        assertThat(strike).isEqualTo(2);
    }

    @DisplayName("유저가 자신이 입력한 숫자가 몇 boll 인지 확인한다.")
    @Test
    void checkBoll() {
        // given
        Number computerNumber = new Number("534");
        Number myNumber = new Number("523");

        // when
        Integer boll = baseBallService.countBoll(computerNumber, myNumber);

        // then
        assertThat(boll).isEqualTo(1);
    }
}