package futureLogistics;

import java.util.Scanner;

public class UserInterface {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Utility utility = new Utility();

    System.out.println("Enter the Goods Transport details");
    String input = sc.nextLine();

    String transportId = input.split(":")[0];

    // validate transport id
    if (!utility.validateTransportId(transportId)) {
      return;
    }

    // parse details
    GoodTransport goodsTransport = utility.parseDetails(input);

    // identify type
    String type = utility.findObjectType(goodsTransport);

    // common output
    System.out.println("\nTransporter id : " + goodsTransport.getTransportId());
    System.out.println("Date of transport : " + goodsTransport.getTransportDate());
    System.out.println("Rating of the transport : " + goodsTransport.getTransportRating());

    if (type.equals("BrickTransport")) {

      BrickTransport bt = (BrickTransport) goodsTransport;

      System.out.println("Quantity of bricks : " + bt.getBrickQuantity());
      System.out.println("Brick price : " + bt.getBrickPrice());
      System.out.println("Vehicle for transport : " + bt.vehicleSelection());
      System.out.println("Total charge : " + bt.calculateTotalCharge());

    } else if (type.equals("TimberTransport")) {

      TimberTransport tt = (TimberTransport) goodsTransport;

      System.out.println("Type of the timber : " + tt.getTimberType());
      System.out.println("Timber price per kilo : " + tt.getTimberPrice());
      System.out.println("Vehicle for transport : " + tt.vehicleSelection());
      System.out.println("Total charge : " + tt.calculateTotalCharge());
    }

    sc.close();
  }
}
