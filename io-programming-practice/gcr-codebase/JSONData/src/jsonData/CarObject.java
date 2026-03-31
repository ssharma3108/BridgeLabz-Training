package jsonData;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    public int id;
    public String name;

    Car(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class CarObject {
    public static void main(String[] args) throws Exception {

        Car car = new Car(1, "BMW");

        ObjectMapper mapper = new ObjectMapper();
        String userDataString = mapper.writeValueAsString(car);

        System.out.println(userDataString);
    }
}
