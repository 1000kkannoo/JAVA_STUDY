package week4.model;

import java.util.ArrayList;
import java.util.List;

public class BridgeMarker {
    private final BridgeNumberGenerator bridgeNumberGenerator;

    public BridgeMarker(BridgeNumberGenerator bridgeNumberGenerator) {
        this.bridgeNumberGenerator = bridgeNumberGenerator;
    }

    public List<String> makeBridge(int size) {
        List<String> bridge = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            addSuccessBridge(bridge, bridgeNumberGenerator.generate());
        }

        return bridge;
    }

    private static void addSuccessBridge(List<String> bridge, int random) {
        if (random == 0) {
            bridge.add("U");
        } else {
            bridge.add("D");
        }
    }
}
