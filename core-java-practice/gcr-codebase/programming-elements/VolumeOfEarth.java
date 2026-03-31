public class VolumeOfEarth {
  public static void main(String[] args) {
    double radius = 6378;

    // calculate volume in km
    double volumeKm = (4.0 / 3.0) * 3.14 * Math.pow(radius, 3);

    // now calculate volume in Miles
    double volumeMiles = volumeKm * Math.pow(0.621371, 3);

    System.out.println("The volume of earth in cubic kilometers is " + volumeKm +
        " and cubic miles is " + volumeMiles);

  }

}
