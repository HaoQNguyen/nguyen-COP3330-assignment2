package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordValidator() {

        assertEquals(0, App.passwordValidator("111"));

        assertEquals(1, App.passwordValidator("aaa"));

        assertEquals(1, App.passwordValidator("123456789"));

        assertEquals(1, App.passwordValidator("@@"));

        assertEquals(2, App.passwordValidator("abc123"));

        assertEquals(2, App.passwordValidator("aaaaaaaaa"));

        assertEquals(2, App.passwordValidator("@@@@@@@@@"));

        assertEquals(3, App.passwordValidator("abcde1234"));

        assertEquals(4, App.passwordValidator("abc@@@123"));

    }

    @Test
    void main() {
    }
}