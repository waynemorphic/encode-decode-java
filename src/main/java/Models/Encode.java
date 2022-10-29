package Models;

import java.util.HashMap;
import java.util.Map;

public class Encode {
    private String letters;
    private int shiftKey;
    public static final String Alphabets = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args){
        Encode encode = new Encode("John", 2);
        System.out.println(encode.encrypt(encode.getLetters(), encode.getShiftKey()));

    }

    // constructor of the private class
    public Encode(String letters, int shiftKey){
        this.letters = letters;
        this.shiftKey = shiftKey;
    }

    // Getter and setter methods
    public String getLetters() {
        return letters;
    }

    public int getShiftKey() {
        return shiftKey;
    }

    public void setShiftKey(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    // Method to encode characters
    public String encrypt(String letters, int shiftKey){
        letters = letters.toLowerCase();
        String cipherText = "";

        /*
        * - for encryption, we are using the formula,
        * --- En(X) = (X + n) mod 26
        * - where:
        *       - n is the shift key
        *       - 26 is the number of alphabets
        *       - X is the individual character position
        *       - En is the encrypted character with the applied shift key
        */

        for (int i = 0; i < letters.length(); i++){
            int charPosition = Alphabets.indexOf(letters.charAt(i));
            int keyValue = (shiftKey + charPosition) % 26;
            char replaceValue = Alphabets.charAt(keyValue);
            cipherText += replaceValue;
        }
        return cipherText;
    }
}
