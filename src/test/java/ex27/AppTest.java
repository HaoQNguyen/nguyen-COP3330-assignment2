package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void validateFirstName() {

        assertEquals(0, App.validateFirstName("Hao"));

        assertEquals(1, App.validateFirstName("H"));

        assertEquals(2, App.validateFirstName(""));

    }

    @Test
    void validateLastName() {

        assertEquals(0, App.validateLastName("Nguyen"));

        assertEquals(1, App.validateLastName("N"));

        assertEquals(2, App.validateLastName(""));

    }

    @Test
    void validateZipCode() {

        assertEquals(1, App.validateZipCode("1234"));

        assertEquals(1, App.validateZipCode("1234a"));

        assertEquals(0, App.validateZipCode("32817"));

    }

    @Test
    void validateID() {

        assertEquals(1, App.validateID("AA"));

        assertEquals(0, App.validateID("AA-1234"));

        assertEquals(1, App.validateID("1234567"));

    }
}