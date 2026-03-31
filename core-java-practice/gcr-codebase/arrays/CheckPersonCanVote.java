import java.util.*;

public class CheckPersonCanVote {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // taking input from user
    int[] age = new int[10];

    for (int i = 0; i <= 10; i++) {
      age[i] = sc.nextInt();
    }

    // now check that whether it is eligible for vote or not
    for (int i = 0; i < age.length; i++) {
      if (age[i] >= 18) {
        System.out.println("The person's age is " + age + " and can vote");
      } else {
        System.out.println("The person's age is " + age + " and cannot vote");
      }
    }

  }

}
