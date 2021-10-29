import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String number = String.valueOf(x);
        String[] temp = new String[number.length()];
        String[] tempReverse = new String[number.length()];
        for(int i = 0; i < number.length(); i++){
            temp[i] = String.valueOf(number.charAt(i));
            tempReverse[number.length()-i-1] = String.valueOf(number.charAt(i));
        }
        for(int i = 0; i < numberf.length(); i++){
            if(!temp[i].equals(tempReverse[i])){
                return false;
            }
        }
        return true;
    }
}
