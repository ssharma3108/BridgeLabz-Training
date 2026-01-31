package junit_testing.junit;

import java.util.List;

public class ListManager {

    public List<Integer> addElement(List<Integer> list, int element) {
        list.add(element);
        return list;
    }

    public List<Integer> removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element)); // remove by value
        return list;
    }

    public int getSize(List<Integer> list) {
        return list.size();
    }
}
