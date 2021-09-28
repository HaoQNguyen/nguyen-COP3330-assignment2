package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void max() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);

        assertEquals(1000, App.max(list));

    }

    @Test
    void min() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);

        assertEquals(100, App.min(list));
    }

    @Test
    void average() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);

        assertEquals(400, App.average(list));
    }

    @Test
    void standardDeviation() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);

        assertEquals(353.5533905932738, App.standardDeviation(list));
    }
}