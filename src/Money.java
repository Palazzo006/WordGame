public class Money implements Award {
    private static final double WINNING_AMOUNT = 1000; // Winning amount constant
    private static final double LOSING_AMOUNT = -200;   // Losing amount constant

    @Override
    public int displayWinnings(Players player, boolean isWin) {
        if (isWin) {
            // Declare the winning amount
            System.out.println(player.getFirstName() + " " + player.getLastName() + ", Winner Winner Chicken Dinner! You won $" + WINNING_AMOUNT + "!");
            return (int) WINNING_AMOUNT; // Return positive winning amount
        } else {
            // Declare the losing amount
            System.out.println(player.getFirstName() + " " + player.getLastName() + ", sorry, that is incorrect! You lost $" + Math.abs(LOSING_AMOUNT) + ".");
            return (int) LOSING_AMOUNT; // Return negative losing amount
        }
    }
}
