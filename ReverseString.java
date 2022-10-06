import java.lang.*;
import java.io.*;
import java.util.*;
 
class ReverseString {
    public static void main(String[] args)
    {
        String str = "Hacktoberfast2021";
 
        System.out.println(reverseStr(str));
    }

    public static String reverseStr(String input) {
        
        byte[] byteArray = input.getBytes();
 
        byte[] byteResult = new byte[byteArray.length];
 

        for (int i = 0; i < byteArray.length; i++)
            byteResult[i] = byteArray[byteArray.length - i - 1];
 
        return new String(byteResult);

    }
}
