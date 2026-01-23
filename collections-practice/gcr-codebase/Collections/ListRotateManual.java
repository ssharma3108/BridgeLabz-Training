import java.util.*;

public class ListRotateManual {
    public static <T> List<T> rotate(List<T> list, int k) {
        int n = list.size();
        if (n == 0) return new ArrayList<>();
        k = k % n;  // Handle k > n
        if (k < 0) k += n;  // Handle negative k

        List<T> rotated = new ArrayList<>();
        for (int i = n - k; i < n; i++) {
            rotated.add(list.get(i));
        }
        for (int i = 0; i < n - k; i++) {
            rotated.add(list.get(i));
        }
        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> rotated = rotate(new ArrayList<>(list), 2);
        System.out.println("Rotated: " + rotated);  // [30, 40, 50, 10, 20]
    }
}