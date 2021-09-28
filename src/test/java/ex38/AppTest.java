package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterEvenNumbers() {

        int[] number = {1, 2, 3, 4, 5, 6, 7, 8};
        int count = 4;

        int[] actual = App.filterEvenNumbers(number, count);
        assertEquals(2, actual[0]);
        assertEquals(4, actual[1]);
        assertEquals(6, actual[2]);
        assertEquals(8, actual[3]);

    }
}