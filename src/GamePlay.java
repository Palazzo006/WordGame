public class GamePlay {
    // Declare an array to hold the player objects
    private static final Players[] currentPlayers = new Players[3]; // Mark as final

    public static void main(String[] args) {
        // Loop to create 3 players
        for (int i = 0; i < currentPlayers.length; i++) {
            System.out.println("Player #" + (i + 1) + ", what is your first name?");
            String firstName = System.console().readLine();
            System.out.println("Would you like to enter a last name? Leave blank if not.");
            String lastName = System.console().readLine();
            currentPlayers[i] = new Players(firstName, lastName.isEmpty() ? "" : lastName); // Add players to the array
        }

        Hosts host = new Hosts("Bob", "Barker");
        Turn turn = new Turn();

        boolean playAgain = true;
        while (playAgain) {
            host.randomizeNum();
            boolean guessedCorrectly = false;
            int currentPlayerIndex = 0; // Initialize player index for turn-taking

            while (!guessedCorrectly) {
                // Use the current player for the turn
                guessedCorrectly = turn.takeTurn(currentPlayers[currentPlayerIndex], host);
                currentPlayerIndex = (currentPlayerIndex + 1) % currentPlayers.length; // Cycle through players
            }
            
            System.out.println("Play another game? (y or n)");
            playAgain = System.console().readLine().equalsIgnoreCase("y");
        }
    }
}
