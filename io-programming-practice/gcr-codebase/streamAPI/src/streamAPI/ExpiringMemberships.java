package streamAPI;

import java.time.LocalDate;
import java.util.*;

class GymMember {
    int id;
    String nameString;
    LocalDate expiryDate;

    GymMember(int id, String nameString, LocalDate expiryDate) {
        this.id = id;
        this.nameString = nameString;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return id + " " + nameString + " " + expiryDate;
    }
}

public class ExpiringMemberships {
    public static void main(String[] args) {

        List<GymMember> members = Arrays.asList(
            new GymMember(1, "Rahul", LocalDate.of(2026, 2, 20)),
            new GymMember(2, "Neha",  LocalDate.of(2026, 2, 10)),
            new GymMember(3, "Aman",  LocalDate.of(2026, 3, 25)),
            new GymMember(4, "Pooja", LocalDate.of(2026, 2, 15)),
            new GymMember(5, "Karan", LocalDate.of(2026, 4, 1))
        );

        LocalDate todayDate = LocalDate.of(2026, 2, 4);
        LocalDate next30Days = todayDate.plusDays(30);

        members.stream()
               .filter(m ->
                   (m.expiryDate.isAfter(todayDate) ||
                    m.expiryDate.isEqual(todayDate))
                   &&
                   m.expiryDate.isBefore(next30Days)
               )
               .forEach(System.out::println);
    }
}
