package week4.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public void validateInputIsNull(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException("[ERROR] 다리의 길이를 입력하여야 합니다.");
        }
    }

    public void validateReadBridgeSizeOver(Integer size) {
        if (size < 3 || size > 20) {
            throw new IllegalArgumentException("[ERROR] 다리의 길이는 3 이상 20 이하의 길이로 입력하여야 합니다.");
        }
    }

    private int parseIntBridgeSize(String strBridgeSize) {
        int bridgeSize = Integer.parseInt(strBridgeSize);
        validateReadBridgeSizeOver(bridgeSize);
        return bridgeSize;
    }

    public void validateReadMoving(String move) {
        if (!move.equals("U") && !move.equals("D")) {
            throw new IllegalArgumentException("[ERROR] 이동할 다리는 U 또는 D 만 가능합니다.");
        }
    }

    public void validateReadGameCommand(String command) {
        if (!command.equals("R") && !command.equals("Q")) {
            throw new IllegalArgumentException("[ERROR] 커맨드는 Q 또는 R 만 가능합니다.");
        }
    }

    public int readBridgeSize() {
        System.out.println("다리의 길이를 입력해주세요.");
        String strBridgeSize = readLine();
        validateInputIsNull(strBridgeSize);

        return parseIntBridgeSize(strBridgeSize);
    }

    public String readMoving() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        String move = readLine();
        validateInputIsNull(move);
        validateReadMoving(move);

        return move;
    }
}
