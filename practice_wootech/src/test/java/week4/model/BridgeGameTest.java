package week4.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BridgeGameTest {

    BridgeGame bridgeGame = new BridgeGame(List.of("U", "U", "D"));

    @DisplayName("위 아래에 따라 다리를 건넌후 성공 여부를 확인한다.")
    @Test
    void move() {
        // given

        // when
        Boolean isSuccess = bridgeGame.move("U");

        // then
        assertThat(isSuccess).isTrue();
        assertThat(bridgeGame.getTotalMove()).isEqualTo(2);
    }

    @DisplayName("사용자가 게임을 재시작한다.")
    @Test
    void retry() {
        // given

        // when
        Boolean isRetry = bridgeGame.retry("R");

        // then
        assertThat(isRetry).isTrue();
    }

    @DisplayName("사용자가 게임을 종료한다.")
    @Test
    void notRetry() {
        // given

        // when
        Boolean isRetry = bridgeGame.retry("Q");

        // then
        assertThat(isRetry).isFalse();
    }

}