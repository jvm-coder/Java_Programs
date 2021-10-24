public class WordMatch implements GuessingGame {
    private String answer ;
    private int match;
    private boolean fact = false;

    public WordMatch() {
        this.match = 0;
    }

    @Override
    public void setAnswer(String ans) {
        answer = ans.toLowerCase();
    }

    @Override
    public void guess(String s) {
        String tmp = s.toLowerCase();
        match =0;
        if(s.length()!= answer.length()){
            fact = true;
        }
        else {
            for (int i = 0; i < answer.length(); i++) {
                if (answer.charAt(i) == tmp.charAt(i)) {
                    match++;
                }
            }
        }
    }

    @Override
    public String getOutput() {
        if(fact == true){
            fact =false;
            return "Length not match";
        }
        else if(match == answer.length()){
            return "";
        }
        else {
            return "Match " + match;
        }
    }

    @Override
    public boolean isWon() {
        if(match == answer.length()){
            return true;
        }
        return false;
    }

    @Override
    public boolean isLost() {
        return false;
    }
}
