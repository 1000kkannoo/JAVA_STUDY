package week2.view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week2.model.Number;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BaseBallViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    BaseBallView baseBallView = new BaseBallView(System.in);

    private BaseBallView setInputBaseBallView(String input) {
        return new BaseBallView(new ByteArrayInputStream(input.getBytes()));
    }

    @DisplayName("사용자가 숫자를 입력한다.")
    @Test
    void inputMyNumber() {
        // given

        // when
        String input = "123\n";

        BaseBallView inputBaseBallView = setInputBaseBallView(input);

        Number number = inputBaseBallView.inputMyNumber();

        // then
        assertThat(number.getNum()).isEqualTo("123");
    }

    @DisplayName("입력받은 값이 숫자가 아닌 경우 IllegalArgumentException 이 발생한다.")
    @Test
    void validateNumericInput() {
        // given

        // when // then
        assertThatThrownBy(() -> baseBallView.validateNumericInput("35r"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자를 입력해야 합니다.");
    }

    @DisplayName("입력받은 값이 길이가 3이 아닌 경우 IllegalArgumentException 이 발생한다.")
    @Test
    void validateNumericLength() {
        // given

        // when // then
        assertThatThrownBy(() -> baseBallView.validateNumericLength("3333"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자의 길이는 3 이여야합니다.");
    }

    @DisplayName("입력받은 숫자가 전부 다르지 않은 경우 IllegalArgumentException 이 발생한다.")
    @Test
    void validateDifferentNumber() {
        // given

        // when // then
        assertThatThrownBy(() -> baseBallView.validateDifferentNumber("122"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("숫자는 전부 다른 숫자여야 합니다.");
    }

    @DisplayName("사용자가 3스트라이크로 게임이 종료된다.")
    @Test
    void adviceResultWith3Strike() {
        // given
        String expectedOutput = "3스트라이크\n" +
                "3개의 숫자를 모두 맞히셨습니다! 게임 종료\n";

        // when
        boolean isStop = baseBallView.adviceResult(3, 0);

        // then
        assertThat(isStop).isTrue();
        assertEquals(expectedOutput, outContent.toString());
    }

    @DisplayName("사용자가 숫자를 아무것도 맞히지 못했다.")
    @Test
    void adviceResultWithNothing() {
        // given
        String expectedOutput = "낫싱\n";

        // when
        boolean isStop = baseBallView.adviceResult(0, 0);

        // then
        assertThat(isStop).isFalse();
        assertEquals(expectedOutput, outContent.toString());
    }

    @DisplayName("사용자가 볼만 있는 경우")
    @Test
    void adviceResultWithOnlyBoll() {
        // given
        String expectedOutput = "2볼 \n";

        // when
        boolean isStop = baseBallView.adviceResult(0, 2);

        // then
        assertThat(isStop).isFalse();
        assertEquals(expectedOutput, outContent.toString());
    }

    @DisplayName("사용자가 스트라이크만 있는 경우")
    @Test
    void adviceResultWithOnlyStrike() {
        // given
        String expectedOutput = "1스트라이크\n";

        // when
        boolean isStop = baseBallView.adviceResult(1, 0);

        // then
        assertThat(isStop).isFalse();
        assertEquals(expectedOutput, outContent.toString());
    }

    @DisplayName("사용자가 스트라이크, 볼 둘다 있는 경우")
    @Test
    void adviceResultWithBollAndStrike() {
        // given
        String expectedOutput = "2볼 1스트라이크\n";

        // when
        boolean isStop = baseBallView.adviceResult(1, 2);

        // then
        assertThat(isStop).isFalse();
        assertEquals(expectedOutput, outContent.toString());
    }

    @DisplayName("게임이 끝나고 재시작을 한다.")
    @Test
    void isContinueWithRestart() {
        // given
        String input = "1\n";
        BaseBallView inputBaseBallView = setInputBaseBallView(input);

        // when
        Boolean isContinue = inputBaseBallView.isContinue();

        // then
        assertThat(isContinue).isTrue();
    }

    @DisplayName("게임을 종료한다.")
    @Test
    void isContinueWithEnd() {
        // given
        String input = "2\n";
        BaseBallView inputBaseBallView = setInputBaseBallView(input);

        // when
        Boolean isContinue = inputBaseBallView.isContinue();

        // then
        assertThat(isContinue).isEqualTo(false);
    }
}