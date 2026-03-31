package functionalInterface;

import java.io.Serializable;

// Marker interface
class UserData implements Serializable {

    private int id;
    private String name;

    public UserData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("User ID: " + id + ", Name: " + name);
    }
}

public class BackupSystem {
    public static void main(String[] args) {

        UserData user = new UserData(101, "Shivam");

        if (user instanceof Serializable) {
            System.out.println("Object is eligible for backup (Serializable)");
        } else {
            System.out.println("Object cannot be backed up");
        }
    }
}
