package ex40;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void searchList() {

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

        String target = "Jac";
        ArrayList<Map<Integer, String>> resultList = App.searchList(mapList, target);

        assertEquals("Jake", resultList.get(0).get(1));
        assertEquals("Jacquelyn", resultList.get(0).get(2));

    }
}