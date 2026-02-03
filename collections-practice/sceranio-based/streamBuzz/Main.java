package streamBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    CreatorStats creator = new CreatorStats();
    Program p = new Program();

    Program.engagementBoard = new ArrayList<>();

    while (true) {
      System.out.print("1. Register Creator\r\n" + //
          "2. Show Top Posts\r\n" + //
          "3. Calculate Average Likes\r\n" + //
          "4. Exit");

      int choice = sc.nextInt();

      if (choice == 1) {
        System.out.print("Enter the Creator Name -: ");
        String name = sc.next();
        System.out.println("Enter weekly likes (Week 1 to 4) : ");
        double[] likes = new double[4];

        for (int i = 0; i < likes.length; i++) {
          likes[i] = sc.nextDouble();
        }

        creator.CreatorName = name;
        creator.WeeklyLikes = likes;

        p.registerCreator(creator);

        System.out.println("Creator registered successfully");

      } else if (choice == 2) {
        System.out.print("Enter the threshold -: ");
        int t = sc.nextInt();
        p.getTopCounts(Program.engagementBoard, t);
      } else if (choice == 3) {
        System.out.println("Overall average weekly Likes -: " + p.calculateAverageLikes());
      } else if (choice == 4) {
        System.out.println("Logging off - Keep Creating with StreamBuzz!");
        break;
      }

    }

  }
}
