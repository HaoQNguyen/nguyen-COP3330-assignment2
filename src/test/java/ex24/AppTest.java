package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void isAnagram() {

        assertEquals(1 , App.isAnagram("Hao", "hoa"));

        assertEquals(0, App.isAnagram("nguyen", "ng u yen"));

        assertEquals(0, App.isAnagram("ba", "abc"));

    }

    @Test
    void main() {
    }
}