package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void removeEmployee() {

        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        int count = employees.length;
        String target = "John Smith";
        count = App.removeEmployee(employees, target, count);

        assertEquals(4,count);

    }

}