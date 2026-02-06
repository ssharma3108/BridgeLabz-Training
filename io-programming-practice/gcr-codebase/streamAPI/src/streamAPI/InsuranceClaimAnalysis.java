package streamAPI;

import java.util.*;
import java.util.stream.Collectors;

class Claim {
    int id;
    String typeString;
    double amount;

    public Claim(int id, String typeString, double amount) {
        this.id = id;
        this.typeString = typeString;
        this.amount = amount;
    }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim(101, "Health", 50000),
            new Claim(102, "Vehicle", 20000),
            new Claim(103, "Health", 30000),
            new Claim(104, "Life", 100000),
            new Claim(105, "Vehicle", 25000),
            new Claim(106, "Health", 40000)
        );

        Map<String, Double> averageByType =
            claims.stream()
                  .collect(Collectors.groupingBy(
                      c -> c.typeString,
                      Collectors.averagingDouble(c -> c.amount)
                  ));

        averageByType.forEach((type, avg) ->
            System.out.println(type + " → " + avg)
        );
    }
}
