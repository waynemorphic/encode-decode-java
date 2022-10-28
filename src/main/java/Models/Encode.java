package Models;

public class Encode {
    private String letters;
    private String cypherLetters;

    public static void main(String[] args){

    }

    // constructor of the private class
    public Encode(String letters, String cypherLetters){
        this.letters = letters;
        this.cypherLetters = cypherLetters;
    }

    // Getter and setter methods
    public String getLetters() {
        return letters;
    }

    public String getCypherLetters() {
        return cypherLetters;
    }

    public void setCypherLetters(String cypherLetters) {
        this.cypherLetters = cypherLetters;
    }

    public void setLetters(String letters) {
        this.letters = letters;
    }

    // Method to encode characters
    public String encoder(String letters, String cypherLetters){
        char[] arrLetters = letters.toCharArray();
        char[] alphs = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] cyphers = {'X','Y','Z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W'};
        for (int i = 0; i < arrLetters.length; i++){

        }
        return cypherLetters;
    }
}
