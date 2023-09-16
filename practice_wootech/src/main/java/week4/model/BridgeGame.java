package week4.model;

import java.util.List;

public class BridgeGame {

    private final List<String> gameBridge;
    private final Integer totalPlay;
    private Integer totalMove;

    public Integer getTotalPlay() {
        return totalPlay;
    }

    public List<String> getGameBridge() {
        return gameBridge;
    }

    public Integer getTotalMove() {
        return totalMove;
    }

    public BridgeGame(List<String> gameBridge) {
        this.gameBridge = gameBridge;
        this.totalPlay = 0;
        this.totalMove = 1;
    }

    public Boolean move(String selectMove) {
        String selectBridge = gameBridge.get(totalMove);

        if (selectBridge.equals(selectMove)) {
            totalMove++;
            return true;
        }

        return false;
    }

    public void retry() {
    }
}
