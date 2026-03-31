import java.util.*;

public class RockPaperScissor {

  static int totalMatchPlayed = 0;
  static int userWins = 0;
  static int computerWins = 0;
  static int draws = 0;

  // taking computer choice as input
  static int computerChoice(String[] choices) {
    Random random = new Random();
    return random.nextInt(choices.length);
  }

  static void winner(int user, int computer) {

    if (user == computer) {
      System.out.println("Match Draw");
      draws++;
    }
    // Computer wins
    else if ((user == 0 && computer == 1) ||
        (user == 1 && computer == 2) ||
        (user == 2 && computer == 0)) {
      System.out.println("Computer Wins");
      computerWins++;
    }
    // User wins
    else {
      System.out.println("User Wins");
      userWins++;
    }

    totalMatchPlayed++;
  }

  // calculate the winning percentage

  static void printWinningPercentage() {
    System.out.println("\n----- Game Stats -----");
    System.out.println("Total Matches Played: " + totalMatchPlayed);

    System.out.printf("User Winning Percentage: %.2f%%\n",
        (userWins * 100.0) / totalMatchPlayed);

    System.out.printf("Computer Winning Percentage: %.2f%%\n",
        (computerWins * 100.0) / totalMatchPlayed);

    System.out.printf("Draw Percentage: %.2f%%\n",
        (draws * 100.0) / totalMatchPlayed);
  }

  // taking input from the user
  public static void main(String[] args) {

    String[] choices = { "Rock", "Paper", "Scissor" };
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
    int user = sc.nextInt();

    int computer = computerChoice(choices);

    System.out.println("User chose: " + choices[user]);
    System.out.println("Computer chose: " + choices[computer]);

    winner(user, computer);
    printWinningPercentage();

    System.out.println("Thank you for playing");
  }
}
