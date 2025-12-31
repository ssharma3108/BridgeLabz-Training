
public class Circle {
  int radius;

  // calculate the area and circumference
  void displayAreaAndCircumference(int radius) {
    this.radius = radius;

    double area = 3.14 * radius * radius;
    double circumference = 2 * 3.14 * radius;
    System.out.println("Area -:" + area);
    System.out.println("Circumference -:" + circumference);
  }

  // calling from the main method
  public static void main(String[] args) {
    Circle c = new Circle();

    c.displayAreaAndCircumference(5);
  }

}
