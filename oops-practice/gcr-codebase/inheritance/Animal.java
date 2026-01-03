public class Animal {
  String name;
  int age;

  // method
  void makeSound() {
    System.out.println("Animal Make sound");
  }

  // dog class
  class Dog extends Animal {

    void makeSound() {
      System.out.println("Dog -> Bark");
    }
  }

  // cat class
  class Cat extends Animal {

    void makeSound() {
      System.out.println("Cat -> Meow");
    }
  }

  // Bird class
  class Bird extends Animal {
    void makeSound() {
      System.out.println("Bird -> Chirping");
    }
  }

  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.makeSound();

    // now calling the child classes
    Animal.Dog dog = animal.new Dog();
    dog.makeSound();

    Animal.Cat cat = animal.new Cat();
    cat.makeSound();

    Animal.Bird bird = animal.new Bird();
    bird.makeSound();

  }
}
