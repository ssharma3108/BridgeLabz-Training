package futureLogistics;

abstract public class GoodTransport {

  // attributes
  protected String transportId;
  protected String date;
  protected int rating;

  // constructor
  GoodTransport(String transportId, String date, int rating) {
    this.transportId = transportId;
    this.date = date;
    this.rating = rating;
  }

  // making getter
  public String getDate() {
    return date;
  }

  public int getRating() {
    return rating;
  }

  public String getTransportId() {
    return transportId;
  }

  // abstract method
  abstract public String vehicleSelection();

  abstract public float calculateTotalCharge();

}