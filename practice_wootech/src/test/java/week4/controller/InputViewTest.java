package week4.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week4.view.InputView;

import java.io.ByteArrayInputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputViewTest {

    private final InputView inputView = new InputView();

    @DisplayName("유저가 20 이상의 다리 길이를 입력하면 Exception 발생한다.")
    @Test
    void validateReadBridgeSizeOver() {
        // given

        // when // then
        assertThatThrownBy(() -> inputView.validateReadBridgeSizeOver(21))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 다리의 길이는 3 이상 20 이하의 길이로 입력하여야 합니다.");

    }

    @DisplayName("다리 길이가 Blank 경우 Exception 발생한다.")
    @Test
    void validateReadBridgeIsBlank() {
        // given

        // when // then
        assertThatThrownBy(() -> inputView.validateInputIsNull(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 다리의 길이를 입력하여야 합니다.");
    }

    @DisplayName("유저가 다리 길이를 입력한다.")
    @Test
    void readBridgeSize() {
        // given
        String testData = "7";
        System.setIn(new ByteArrayInputStream(testData.getBytes()));

        // when
        int bridgeSize = inputView.readBridgeSize();

        // then
        assertThat(bridgeSize).isEqualTo(7);
    }

    @DisplayName("유저가 이동할 다리를 입력 받을때 U 또는 D 가 아닌 입력을 받을 경우 Exception 발생한다.")
    @Test
    void validateReadMoving() {
        // given

        // when // then
        assertThatThrownBy(() -> inputView.validateReadMoving("L"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 이동할 다리는 U 또는 D 만 가능합니다.");
    }


}