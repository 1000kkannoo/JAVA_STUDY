package week4.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public void validateReadBridgeIsNull(String size) {
        if (size.isBlank()) {
            throw new IllegalArgumentException("[ERROR] 다리의 길이를 입력하여야 합니다.");
        }
    }

    public void validateReadBridgeSizeOver(Integer size) {
        if (size < 3 || size > 20) {
            throw new IllegalArgumentException("[ERROR] 다리의 길이는 3 이상 20 이하의 길이로 입력하여야 합니다.");
        }
    }

    public int readBridgeSize() {
        System.out.println("다리의 길이를 입력해주세요.");
        String strBridgeSize = readLine();
        validateReadBridgeIsNull(strBridgeSize);

        return parseIntBridgeSize(strBridgeSize);
    }

    private int parseIntBridgeSize(String strBridgeSize) {
        int bridgeSize = Integer.parseInt(strBridgeSize);
        validateReadBridgeSizeOver(bridgeSize);
        return bridgeSize;
    }
}
