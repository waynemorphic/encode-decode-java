package Models;

import java.util.Locale;

public class Decode {
    private String letters;
    private int shiftKey;
    public static String Alphabets = "abcdefghijklmnopqrstuvwxyz";

    public Decode(String letters, int shiftKey){
        this.letters = letters;
        this.shiftKey = shiftKey;
    }

    public static void main(String[] args){
        Decode decode = new Decode("lqjp", 2);
        System.out.println(decode.decrypt(decode.getLetters(), decode.getShiftKey()));

    }

    public String getLetters() {
        return letters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    public int getShiftKey() {
        return shiftKey;
    }

    public void setShiftKey(int shiftKey) {
        this.shiftKey = shiftKey;
    }

    public String decrypt(String letters, int shiftKey){
        letters = letters.toLowerCase();
        String decoded = "";
        /*
        * - for the decoding method, we follow the following formulae:
        * --- En(X) = (X - n) mod 26
        * - where:
        *       - n is the shift key
        *       - 26 is the number of alphabets
        *       - X is the individual character position
        *       - En is the decrypted character with the applied shift key
        */

        for (int i = 0; i < letters.length(); i++){
            int charPosition = Alphabets.indexOf(letters.charAt(i));
            int keyValue = (charPosition - shiftKey) % 26;

            // check if the key value entered is less than zero
            if (keyValue < 0){
                keyValue = Alphabets.length() + keyValue;
            }

            // replacing the individual character at the supplied key value
            char replaceValue = Alphabets.charAt(keyValue);
            decoded += replaceValue;
        }
        return decoded;
    }
}
