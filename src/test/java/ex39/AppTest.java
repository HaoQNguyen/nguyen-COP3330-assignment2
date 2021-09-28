package ex39;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void sortList() {

        Map<Integer, String> firstName = new HashMap<>();
        Map<Integer, String> lastName = new HashMap<>();
        Map<Integer, String> position = new HashMap<>();
        Map<Integer, String> separationDate = new HashMap<>();

        App.fillMaps(firstName, lastName, position, separationDate);

        ArrayList<Map<Integer, String>> mapList = new ArrayList<>(4);
        mapList.add(firstName);
        mapList.add(lastName);
        mapList.add(position);
        mapList.add(separationDate);

        mapList = App.sortList(mapList);

        assertEquals("Jacquelyn", mapList.get(0).get(1));
        assertEquals("Jake", mapList.get(0).get(2));
        assertEquals("John", mapList.get(0).get(3));
        assertEquals("Michaela", mapList.get(0).get(4));
        assertEquals("Sally", mapList.get(0).get(5));
        assertEquals("Tou", mapList.get(0).get(6));

    }
}