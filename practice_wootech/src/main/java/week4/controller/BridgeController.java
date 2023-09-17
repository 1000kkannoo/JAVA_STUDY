package week4.controller;

import week4.model.BridgeGame;
import week4.model.BridgeMaker;
import week4.model.BridgeRandomNumberGenerator;
import week4.view.InputView;
import week4.view.OutputView;

import java.util.List;

public class BridgeController {

    private final OutputView outputView = new OutputView();
    private final InputView inputView = new InputView();
    private final BridgeMaker bridgeMarker;

    public BridgeController(BridgeRandomNumberGenerator bridgeRandomNumberGenerator) {
        this.bridgeMarker = new BridgeMaker(bridgeRandomNumberGenerator);
    }

    public void startMessagePrint() {
        outputView.printStart();
    }

    public BridgeGame createBridgeGame() {
        int inputSize = inputView.readBridgeSize();
        List<String> gameBridge = bridgeMarker.makeBridge(inputSize);
        return new BridgeGame(gameBridge);
    }

    public void playBridgeGame(BridgeGame bridgeGame) {
        while (true) {
            Boolean isSuccess = bridgeGame.move(inputView.readMoving()); // 이동 후 알맞은 다리인지 여부 확인
            String map = outputView.printMap(bridgeGame, isSuccess); // 현재 자신이 건너온 다리 위치 출력

            if (isRestartRequested(bridgeGame, isSuccess, map)) { // 알맞은 다리를 건너지 않았을때 커맨드가 Q 라면 게임 종료
                break;
            }
            if (isGameClear(bridgeGame, map)) { // 다리를 다 건넜다면 게임종료
                break;
            }
        }
    }

    private boolean isGameClear(BridgeGame bridgeGame, String map) {
        if (bridgeGame.getGameBridge().size() == bridgeGame.getNextMove()) {
            return isGameStop(map, true, bridgeGame);
        }
        return false;
    }

    private boolean isRestartRequested(BridgeGame bridgeGame, Boolean isSuccess, String map) {
        if (!isSuccess) {
            String command = inputView.readGameCommand();
            Boolean retry = bridgeGame.retry(command);
            if (!retry) {
                return isGameStop(map, false, bridgeGame);
            }
        }
        return false;
    }

    private boolean isGameStop(String map, boolean clear, BridgeGame bridgeGame) {
        outputView.printResult(map);
        outputView.printResultMessage(clear, bridgeGame.getTotalPlay());
        return true;
    }
}
