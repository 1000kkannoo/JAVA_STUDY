package week4.model;

import java.util.List;

public class BridgeGame {

    private final List<String> gameBridge;
    private Integer totalPlay;
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
        String selectBridge = gameBridge.get(this.totalMove);

        if (selectBridge.equals(selectMove)) {
            this.totalMove++;
            return true;
        }

        return false;
    }

    public Boolean retry(String selectRetry) {
        if (selectRetry.equals("R")) {
            this.totalPlay++;
            return true;
        } else {
            return false;
        }
    }
}
