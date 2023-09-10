package week4.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week4.view.InputView;

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
        assertThatThrownBy(() -> inputView.validateReadBridgeIsNull(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 다리의 길이를 입력하여야 합니다.");
    }

}