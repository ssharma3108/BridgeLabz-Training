package jsonData;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

 class User {
    private String name;
    private String email;
    private int age;

    // Default constructor (required by Jackson)
    public User() {}

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }
}


public class ReadJSON {
    public static void main(String[] args) throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        User user = objectMapper.readValue(
                new File("src/jsondata/data.json"),
                User.class
        );

        System.out.println(user.getName() + " " + user.getEmail());
    }
}
