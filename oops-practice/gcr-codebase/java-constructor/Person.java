public class Person {
  int age;
  String name;

  // constructor'
  Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  // copy constructor
  Person(Person per) {
    this.age = per.age;
    this.name = per.name;
  }

  //calling 
  void displayPerson() {
    System.out.println("Name -:" + name);
    System.out.println("Age -:" + age);
  }

  public static void main(String[] args) {
    Person p1 = new Person(29, "Shivam");
    Person p2 = new Person(p1); // copy constructor
    p2.displayPerson();
  }
}