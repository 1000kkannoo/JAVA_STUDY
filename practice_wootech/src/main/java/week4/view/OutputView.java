package week4.view;

import week4.model.BridgeGame;

public class OutputView {

    private final static String SUCCESS_BRIDGE = " O ";
    private final static String FAIL_BRIDGE = " X ";
    private final static String SPACE_BRIDGE = "   ";
    public static final String UP = "U";

    public void printStart() {
        System.out.println("다리 건너기 게임을 시작합니다.");
    }

    public String printMap(BridgeGame bridgeGame, Boolean isSuccess) {
        StringBuilder upBridge = new StringBuilder().append("[");
        StringBuilder downBridge = new StringBuilder().append("[");

        appendMapStatus(bridgeGame, isSuccess, upBridge, downBridge);

        String map = upBridge.append("]\n").append(downBridge).append("]\n").toString();
        System.out.print(map);

        return map;
    }

    private static void appendMapStatus(BridgeGame bridgeGame, Boolean isSuccess, StringBuilder upBridge, StringBuilder downBridge) {
        for (int i = 0; i < bridgeGame.getNextMove(); i++) {
            String control = bridgeGame.getGameBridge().get(i);

            if (i == bridgeGame.getNextMove() - 1) {  // 마지막 인덱스인 경우 성공여부에 따른 결과 등록
                appendBridgeBasedOnStatus(isSuccess, upBridge, downBridge, control);
            } else { // 아닌 경우 전부 O로 등록
                appendSuccessBridge(upBridge, downBridge, control);
                upBridge.append("|");
                downBridge.append("|");
            }
        }
    }

    private static void appendBridgeBasedOnStatus(
            Boolean isSuccess, StringBuilder upBridge, StringBuilder downBridge, String control
    ) {
        if (isSuccess) {
            appendSuccessBridge(upBridge, downBridge, control);
        } else {
            appendFailBridge(upBridge, downBridge, control);
        }
    }

    private static void appendFailBridge(StringBuilder upBridge, StringBuilder downBridge, String control) {
        if (control.equals(UP)) {
            upBridge.append(SPACE_BRIDGE);
            downBridge.append(FAIL_BRIDGE);
        } else {
            upBridge.append(FAIL_BRIDGE);
            downBridge.append(SPACE_BRIDGE);
        }
    }

    private static void appendSuccessBridge(StringBuilder upBridge, StringBuilder downBridge, String control) {
        if (control.equals("U")) {
            upBridge.append(SUCCESS_BRIDGE);
            downBridge.append(SPACE_BRIDGE);
        } else {
            upBridge.append(SPACE_BRIDGE);
            downBridge.append(SUCCESS_BRIDGE);
        }
    }

    public void printResult() {
    }

    public void printResultMessage(Boolean clear, Integer totalPlay) {
        String message = getResultMessage(clear);

        System.out.printf("게임 성공 여부: %s\n", message);
        System.out.printf("총 시도한 횟수: %s\n", totalPlay);
    }

    private static String getResultMessage(Boolean clear) {
        String message;
        if (clear) {
            message = "성공";
        } else {
            message = "실패";
        }
        return message;
    }

}
