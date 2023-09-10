package week4.view;

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
}
