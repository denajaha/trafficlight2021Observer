import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficLightCtrlTest {

    @Test
    @DisplayName("First test")
    void testForInstance() {
        TrafficLightCtrl actual = TrafficLightCtrl.getInstance();
        TrafficLightCtrl expected = actual;
        assertEquals(expected, actual);
    }
}
