public interface GuessingGame {

        void setAnswer(String ans);
        void guess(String s);
        String getOutput();
        boolean isWon();
        boolean isLost();
}
