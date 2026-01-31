package junit_testing.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ListManagerTest {

    ListManager lManager = new ListManager();

    @Test
    public void addTest() {
        List<Integer> list = new ArrayList<>();

        List<Integer> result = lManager.addElement(list, 20);

        assertEquals(1, result.size());
        assertEquals(20, result.get(0));
    }
}
