interface Worker {
    void performDuties(); 
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("\n--- Profile ---");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Chef inherits from Person
class Chef extends Person {
    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Primary Job: Cooking food in the kitchen.");
    }
}

// Waiter inherits from Person AND implements Worker interface
class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Primary Job: Serving customers.");
    }

    // Must implement this method because of the Worker interface
    @Override
    public void performDuties() {
        System.out.println("Action: Taking the order and bringing drinks.");
    }
}

public class RestaurantManagement {
    public static void main(String[] args) {
        // Create objects
        Chef c = new Chef("Rahul", 8);
        Waiter w = new Waiter("Aman", 5);

        // Call inherited/overridden methods
        c.displayInfo();

        w.displayInfo();
        w.performDuties(); // Calling the interface method
    }
}