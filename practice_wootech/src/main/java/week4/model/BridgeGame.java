package week4.model;

import java.util.List;

public class BridgeGame {

    private final List<String> gameBridge;
    private Integer totalPlay;
    private Integer nextMove;

    public Integer getTotalPlay() {
        return totalPlay;
    }

    public List<String> getGameBridge() {
        return gameBridge;
    }

    public Integer getNextMove() {
        return nextMove;
    }

    public BridgeGame(List<String> gameBridge) {
        this.gameBridge = gameBridge;
        this.totalPlay = 0;
        this.nextMove = 0;
    }

    public Boolean move(String selectMove) {
        String selectBridge = gameBridge.get(this.nextMove);
        this.nextMove++;
        return selectBridge.equals(selectMove);
    }

    public Boolean retry(String selectRetry) {
        if (selectRetry.equals("R")) {
            this.totalPlay++;
            this.nextMove--;
            return true;
        } else {
            return false;
        }
    }
}
