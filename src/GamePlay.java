public class GamePlay {
    public static void main(String[] args) {
        System.out.println("What is your first name?");
        String firstName = System.console().readLine();
        System.out.println("Would you like to enter a last name? Leave blank if not.");
        String lastName = System.console().readLine();

        Players player = new Players(firstName, lastName.isEmpty() ? "" : lastName);
        Hosts host = new Hosts("Bob", "Barker");
        Turn turn = new Turn();

        boolean playAgain = true;
        while (playAgain) {
            host.randomizeNum();
            boolean guessedCorrectly = false;
            while (!guessedCorrectly) {
                guessedCorrectly = turn.takeTurn(player, host);
            }
            System.out.println("Play another game? (y or n)");
            playAgain = System.console().readLine().equalsIgnoreCase("y");
        }
    }
}
