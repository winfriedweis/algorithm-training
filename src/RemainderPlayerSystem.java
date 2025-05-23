// Task Description:
// There are players numbered 0, 1, 2, and 3.
// The player who goes first is determined by calculating the remainder of 63 divided by 4 (63 % 4).
// The resulting remainder value directly corresponds to the player's number who will start.

public class RemainderPlayerSystem {

    class Solution {

        // Method to determine player number
        public int findStartingPlayer(int[] currentPlayers, int dividend, int divisor) {
            if (divisor == 0) {
                System.err.println("Error: Divisor for modulo operation cannot be zero.");
                return -1;
            }

            int playerNumber = dividend % divisor;

            for (int i = 0; i < currentPlayers.length; i++) {
                if (currentPlayers[i] == playerNumber) {
                    return currentPlayers[i]; // Found the player
                }
            }

            System.err.println("Error: Calculated player " + playerNumber + " not found in the list.");
            return -1; // Player not found
        }
    }

    public static void main(String[] args) {
        // Create an instance of the outer class to create an instance of the inner class
        RemainderPlayerSystem outerSystem = new RemainderPlayerSystem();
        Solution solution = outerSystem.new Solution();

        int[] players = {0, 1, 2, 3};
        int numberToDivide = 63;
        int divisorForModulo = 4;

        int startingPlayer = solution.findStartingPlayer(players, numberToDivide, divisorForModulo);

        if (startingPlayer >= 0) {
            System.out.println("The dividend is: " + numberToDivide);
            System.out.println("The divisor is: " + divisorForModulo);
            System.out.println("The remainder is: " + (numberToDivide % divisorForModulo));
            System.out.println("Player " + startingPlayer + " will go first.");
        } else {
            System.out.println("Could not determine the starting player due to an error.");
        }
    }
}