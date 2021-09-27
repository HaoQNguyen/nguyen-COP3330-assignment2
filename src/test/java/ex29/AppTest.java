package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calcYear() {

        assertEquals(18, App.calcYear(4));

    }
}