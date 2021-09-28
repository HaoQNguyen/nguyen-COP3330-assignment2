package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void targetHRCalc() {

        assertEquals(138, App.targetHRCalc(65, 22, 55));

        assertEquals(145, App.targetHRCalc(65, 22, 60));

        assertEquals(151, App.targetHRCalc(65, 22, 65));

        assertEquals(178, App.targetHRCalc(65, 22, 85));

        assertEquals(185, App.targetHRCalc(65, 22, 90));

        assertEquals(191, App.targetHRCalc(65, 22, 95));

    }
}