public class Hangman implements GuessingGame{
    private String target;
    private int life ;
    private char[] answer ;

    private boolean fact=false;
    public Hangman() {
        life = 6;
    }




    @Override
    public void setAnswer(String ans) {

        target = ans.toLowerCase();
        answer = new char[target.length()];
        for (int i = 0; i <target.length() ; i++) {
            answer[i]='_';
        }



    }

    @Override
    public void guess(String s) {
        String tmp = s.toLowerCase();
        boolean isCorrect = false;
        if (s.length() > 1) {
            fact = true;
        } else {
            for (int i = 0; i < target.length(); i++) {

                if (target.charAt(i) == tmp.charAt(0)) {
                    answer[i] = tmp.charAt(0);
                    isCorrect = true;
                }
            }
            if (isCorrect == false) life--;
        }
    }

    @Override
    public String getOutput() {
        if(fact == true){
            fact = false;
            return "One character only";
        }
        String temp="";
        for (int i = 0; i <target.length() ; i++) {
            temp += answer[i]+" ";
        }
        return temp;


    }

    @Override
    public boolean isWon() {
        for(int i =0;i<this.target.length();i++){
            if(this.target.charAt(i) != this.answer[i]){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isLost() {
        if(this.life <= 0){
            return true;
        }
        return false;
    }
}
