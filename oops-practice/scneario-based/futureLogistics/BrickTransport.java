package futureLogistics;

public class BrickTransport extends GoodTransport {

  // private attributes
  private float brickSize;
  private int brickQuantity;
  private float brickPrice;

  // constructor (ORDER FIXED)
  public BrickTransport(String transportId, String transportDate, int transportRating,
      float brickSize, int brickQuantity, float brickPrice) {
    super(transportId, transportDate, transportRating);
    this.brickSize = brickSize;
    this.brickQuantity = brickQuantity;
    this.brickPrice = brickPrice;
  }

  // making getter and setter
  public float getBrickPrice() {
    return brickPrice;
  }

  public int getBrickQuantity() {
    return brickQuantity;
  }

  public float getBrickSize() {
    return brickSize;
  }

  public void setBrickPrice(float brickPrice) {
    this.brickPrice = brickPrice;
  }

  public void setBrickQuantity(int brickQuantity) {
    this.brickQuantity = brickQuantity;
  }

  public void setBrickSize(float brickSize) {
    this.brickSize = brickSize;
  }

  @Override
  public String vehicleSelection() {
    if (brickQuantity < 300) {
      return "Truck";
    } else if (brickQuantity >= 300 && brickQuantity <= 500) {
      return "Lorry";
    } else {
      return "MonsterLorry";
    }
  }

  @Override
  public float calculateTotalCharge() {

    float price = brickPrice * brickQuantity;
    float tax = price * 0.3F;

    float discount = 0;

    if (getRating() == 5) {
      discount = 0.20F;
    } else if (getRating() == 3 || getRating() == 4) {
      discount = 0.10F;
    } else if (getRating() == 2 || getRating() == 1) {
      discount = 0;
    }

    float totalDiscount = price * discount / 100;

    int vehiclePrice = 0;

    if (vehicleSelection().equalsIgnoreCase("Truck")) {
      vehiclePrice = 1000;
    } else if (vehicleSelection().equalsIgnoreCase("Lorry")) {
      vehiclePrice = 1700;
    } else if (vehicleSelection().equalsIgnoreCase("MonsterLorry")) {
      vehiclePrice = 3000;
    }

    float totalCharge = ((price) + vehiclePrice + tax) - discount;

    return totalCharge;

  }

}
