package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void magic8Ball() {

        assertEquals("Yes.", App.magic8Ball(0));

        assertEquals("No.", App.magic8Ball(1));

        assertEquals("Maybe.", App.magic8Ball(2));

        assertEquals("Ask again later.", App.magic8Ball(3));


    }
}