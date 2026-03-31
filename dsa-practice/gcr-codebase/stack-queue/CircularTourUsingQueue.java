import java.util.*;

class PetrolPump {
    int petrol;
    int distance;

    PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class CircularTourUsingQueue {

    public static int findStartingPoint(PetrolPump[] pumps, int n) {

        Queue<Integer> q = new LinkedList<>();
        int balance = 0;
        int i = 0;

        while (i < 2 * n) { // simulate circular traversal
            int idx = i % n;

            balance += pumps[idx].petrol - pumps[idx].distance;
            q.add(idx);

            // If balance becomes negative, reset
            while (balance < 0 && !q.isEmpty()) {
                int removed = q.poll();
                balance -= (pumps[removed].petrol - pumps[removed].distance);
            }

            // If queue has all pumps → solution found
            if (q.size() == n) {
                return q.peek();
            }

            i++;
        }

        return -1; // no solution
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };

        int start = findStartingPoint(pumps, pumps.length);

        if (start == -1) {
            System.out.println("No circular tour possible");
        } else {
            System.out.println("Start at petrol pump index: " + start);
        }
    }
}
