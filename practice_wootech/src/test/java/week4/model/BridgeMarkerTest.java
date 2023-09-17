package week4.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BridgeMarkerTest {

    private final BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
    private final BridgeMaker bridgeMarker = new BridgeMaker(bridgeNumberGenerator);

    @DisplayName("사이즈에 맞추어 랜덤한 다리를 생성한다.")
    @Test
    void makeBridge() {
        // given

        // when
        List<String> bridge = bridgeMarker.makeBridge(5);

        // then
        assertThat(bridge)
                .hasSize(5)
                .allSatisfy(var -> assertThat(var).isIn("U", "D"));
    }
}