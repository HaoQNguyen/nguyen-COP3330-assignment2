package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void pickWinner() {

        ArrayList<String> list = new ArrayList<>();

        list.add("Homer");
        list.add("Bart");
        list.add("Maggie");
        list.add("Lisa");
        list.add("Moe");

        assertEquals("Homer", App.pickWinner(list, 0));
        assertEquals("Bart", App.pickWinner(list, 1));
        assertEquals("Maggie", App.pickWinner(list, 2));
        assertEquals("Lisa", App.pickWinner(list, 3));
        assertEquals("Moe", App.pickWinner(list, 4));

    }
}