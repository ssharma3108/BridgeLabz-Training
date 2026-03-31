import java.util.*;

public class ElectionBoothManager {

  // main method
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      // taking age input that run in a loop
      System.out.print("Enter Your age -: ");
      int age = sc.nextInt();
      if (age >= 18) {
        System.out.println("Enter your choice to vote -:");
        System.out.println("press 1 for Candidate A");
        System.out.println("press 2 for Candidate B");
        System.out.println("press 3 for Cadidate C");

        // for taking the user choice
        int choice = sc.nextInt();

        if (choice == 1) {
          System.out.println("Thank You for vote");
          System.out.println("Your vote is successfully added for candidate A");
        } else if (choice == 2) {
          System.out.println("Thank You for vote");
          System.out.println("Your vote is successfully added for candidate B");
        } else if (choice == 3) {
          System.out.println("Thank You for vote");
          System.out.println("Your vote is successfully added for candidate C");
        } else {
          System.out.println("Wrong choice , Try again!!!");
        }
      } else if (age >= 1 && age <= 17) { // for not eligible age
        System.out.println("You are not eligible to vote.");
      } else { // for any illegal action the voting is terminated.................
        System.err.println("Voting Terminated !!!!1");
        System.out.println("Thank You");
        break;
      }
    }

  }
}
