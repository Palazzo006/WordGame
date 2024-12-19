public class Numbers {
    private static int randomNum;

    public static void generateNumber() {
        randomNum = (int) (Math.random() * 101);
    }

    public static boolean compareNumber(int guess) {
        if (guess == randomNum) {
            System.out.println("Winner Winner, Chicken Dinner!");
            return true;
        } else if (guess > randomNum) {
            System.out.println("I'm sorry. That guess was too high.");
        } else {
            System.out.println("I'm sorry. That guess was too low.");
        }
        return false;
    }
}
