package week4;

import week4.controller.BridgeController;
import week4.model.BridgeRandomNumberGenerator;

public class Bridge {
    private static final BridgeController bridgeController = new BridgeController(new BridgeRandomNumberGenerator());

    public static void main(String[] args) {
        bridgeController.startMessagePrint();
        bridgeController.playBridgeGame(bridgeController.createBridgeGame());
    }
}
