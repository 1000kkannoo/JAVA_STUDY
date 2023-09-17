package week4.view;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import week4.model.BridgeGame;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OutputViewTest {
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

    OutputView outputView = new OutputView();

    @DisplayName("유저가 다리를 건넌 현황을 출력한다.")
    @Test
    void printMap() {
        // given
        BridgeGame bridgeGame = new BridgeGame(List.of("U", "D", "D", "U"));
        bridgeGame.move("U");
        bridgeGame.move("D");
        bridgeGame.move("D");
        Boolean move = bridgeGame.move("U");

        // when
        String printMap = outputView.printMap(bridgeGame, move);

        // then
        String expectedOutput =
                "[ O |   |   | O ]\n" +
                        "[   | O | O |   ]\n";
        assertEquals(expectedOutput, outContent.toString());
        assertEquals(printMap, outContent.toString());
    }

    @DisplayName("유저가 다리를 건넌 현황을 출력할때 잘못 건넌 경우를 출력한다.")
    @Test
    void printMapWithFail() {
        // given
        BridgeGame bridgeGame = new BridgeGame(List.of("U", "D", "D", "U"));
        bridgeGame.move("U");
        bridgeGame.move("D");
        bridgeGame.move("D");
        Boolean move = bridgeGame.move("D");

        // when
        outputView.printMap(bridgeGame, move);

        // then
        String expectedOutput =
                "[ O |   |   |   ]\n" +
                        "[   | O | O | X ]\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @DisplayName("유저가 다리를 건넌 현황을 출력한다.")
    @Test
    void printMapWithOne() {
        // given
        BridgeGame bridgeGame = new BridgeGame(List.of("U", "D", "D", "U"));
        Boolean move = bridgeGame.move("U");

        // when
        outputView.printMap(bridgeGame, move);

        // then
        String expectedOutput =
                "[ O ]\n" +
                        "[   ]\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @DisplayName("유저가 다리를 건넌 현황을 출력한다.")
    @Test
    void printMapWithOneFail() {
        // given
        BridgeGame bridgeGame = new BridgeGame(List.of("U", "D", "D", "U"));
        Boolean move = bridgeGame.move("D");

        // when
        outputView.printMap(bridgeGame, move);

        // then
        String expectedOutput =
                "[   ]\n" +
                        "[ X ]\n";
        assertEquals(expectedOutput, outContent.toString());
    }
}