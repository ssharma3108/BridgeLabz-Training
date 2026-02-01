package futureLogistics;

public class TimberTransport extends GoodTransport {

  // attributes
  private float timeberLength;
  private float timerRadius;
  private String timberType;
  private float timberPrice;

  // constructor
  public TimberTransport(String transportId, String transportDate, int transportRating,
      float timberLength, float timberRadius,
      String timberType, float timberPrice) {
    super(transportId, transportDate, transportRating);
    this.timerRadius = timberLength;
    this.timerRadius = timberRadius;
    this.timberType = timberType;
    this.timberPrice = timberPrice;
  }

  // getter
  public float getTimberPrice() {
    return timberPrice;
  }

  public String getTimberType() {
    return timberType;
  }

  public float getTimeberLength() {
    return timeberLength;
  }

  public float getTimerRadius() {
    return timerRadius;
  }

  // calculate area for vehicle selection
  double area = 2 * 3.147 * timerRadius * timeberLength;

  // vehicle selection
  @Override
  public String vehicleSelection() {
    if (area <= 250) {
      return "Truck";
    } else if (area > 250 && area <= 400) {
      return "Lorry";
    } else if (area > 400) {
      return "MonsterLorry";
    }

    return "No vehicle";
  }

  // calculate charge
  @Override
  public float calculateTotalCharge() {

    float amount = 0;

    if (timberType.equalsIgnoreCase("Premium")) {
      amount = 0.25F;
    } else if (timberType.equalsIgnoreCase("NonPremium")) {
      amount = 0.15F;
    }

    float volume = 3.147F * timeberLength * timerRadius * timerRadius;

    float price = volume * timberPrice * amount;

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
