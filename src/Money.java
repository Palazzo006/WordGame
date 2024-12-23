public class Money implements Award {
    private static final double WINNING_AMOUNT = 1000;
    private static final double LOSING_AMOUNT = -200;

    @Override
    public int displayWinnings(Players player, boolean isWin) {
        if (isWin) {
            System.out.println(player.getFirstName() + " " + player.getLastName() + ", Winner Winner, Chicken Dinner!");
            return (int) WINNING_AMOUNT;
        } else {
            System.out.println(player.getFirstName() + " " + player.getLastName() + ", sorry, that is incorrect! You lost $" + Math.abs(LOSING_AMOUNT));
            return (int) LOSING_AMOUNT;
        }
    }
}
