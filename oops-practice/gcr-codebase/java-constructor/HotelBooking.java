public class HotelBooking {

  String name;
  String roomType;
  int nights;

  // default constructor
  HotelBooking() {
    name = "shivam";
    roomType = "AC";
    nights = 5;
  }

  // parameterized constructor
  HotelBooking(String name, String roomType, int nights) {
    this.name = name;
    this.roomType = roomType;
    this.nights = nights;
  }

  // copy constructor
  HotelBooking(HotelBooking hb) {
    this.name = hb.name;
    this.roomType = hb.roomType;
    this.nights = hb.nights;
  }

  // calling
  void displayBooking() {
    System.out.println("Name -:" + name);
    System.out.println("RoomType-:" + roomType);
    System.out.println("Nights -:" + nights);
  }

  public static void main(String[] args) {
    HotelBooking hDefault = new HotelBooking();
    HotelBooking h1 = new HotelBooking("sarthak", "AC", 5);
    HotelBooking h2 = new HotelBooking(h1);

    hDefault.displayBooking(); // for default
    h1.displayBooking(); // for parameter
    h2.displayBooking(); // for copy

  }

}
