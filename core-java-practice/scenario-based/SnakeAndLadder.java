import java.util.Random;

public class SnakeAndLadder {

    // UC 2: Dice roll (1 to 6)
    static int dice() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }

    static void playSnakeAndLadder() {

        String[] choice = { "No play", "Ladder", "Snake" };
        Random random = new Random();

        int positionA = 0;
        int positionB = 0;

        int diceCountA = 0;
        int diceCountB = 0;

        boolean isPlayerATurn = true;

        System.out.println("Game Started with Player A and Player B\n");

        while (positionA != 100 && positionB != 100) {

            int diceValue = dice();
            String option = choice[random.nextInt(choice.length)];

            if (isPlayerATurn) {
                diceCountA++;
                System.out.println("Player A rolled: " + diceValue + " | Option: " + option);

                int prevPosition = positionA;

                if (option.equals("Ladder")) {
                    if (positionA + diceValue <= 100) {
                        positionA += diceValue;
                    }
                    System.out.println("Player A climbs ladder to: " + positionA);
                    // Player A gets another turn
                }
                else if (option.equals("Snake")) {
                    positionA -= diceValue;
                    if (positionA < 0) positionA = 0;
                    System.out.println("Snake bite! Player A moves to: " + positionA);
                    isPlayerATurn = false;
                }
                else {
                    System.out.println("No Play. Player A stays at: " + positionA);
                    isPlayerATurn = false;
                }

            } else {
                diceCountB++;
                System.out.println("Player B rolled: " + diceValue + " | Option: " + option);

                if (option.equals("Ladder")) {
                    if (positionB + diceValue <= 100) {
                        positionB += diceValue;
                    }
                    System.out.println("Player B climbs ladder to: " + positionB);
                    // Player B gets another turn
                }
                else if (option.equals("Snake")) {
                    positionB -= diceValue;
                    if (positionB < 0) positionB = 0;
                    System.out.println("Snake bite! Player B moves to: " + positionB);
                    isPlayerATurn = true;
                }
                else {
                    System.out.println("No Play. Player B stays at: " + positionB);
                    isPlayerATurn = true;
                }
            }

            System.out.println("----------------------------------");
        }

        // UC 7: Winner declaration
        if (positionA == 100) {
            System.out.println("🎉 Player A WINS!");
            System.out.println("Total dice rolls by Player A: " + diceCountA);
            System.out.println("Total dice rolls by Player B: " + diceCountB);
        } else {
            System.out.println("🎉 Player B WINS!");
            System.out.println("Total dice rolls by Player B: " + diceCountB);
            System.out.println("Total dice rolls by Player A: " + diceCountA);
        }

        System.out.println("\nThank You");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator");
        System.out.println("Players start at position 0\n");

        playSnakeAndLadder();
    }
}
