package Models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Models.Decode;
import Models.Encode;

public class App {
    public static void main(String[] args){
        System.out.println("====================================================");
        System.out.println("Welcome to Caesar Cipher");
        System.out.println("====================================================");

        try{
            System.out.println("To encrypt text, enter 1. To decrypt text, enter 2");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String choice = bufferedReader.readLine();
            int choiceNum = Integer.parseInt(choice);

            if (choiceNum == 1){
                System.out.println("====================================================");
                System.out.println("Enter text to receive encrypted text");
                String inputText1 = bufferedReader.readLine();
                System.out.println("====================================================");

                System.out.println("Enter shift value (Integer)");
                String shiftVal1 = bufferedReader.readLine();
                int shiftNum1 = Integer.parseInt(shiftVal1);

                Encode encode = new Encode(inputText1, shiftNum1);
                System.out.println("====================================================");
                System.out.println("Your encrypted text is -->" + encode.encrypt(encode.getLetters(), encode.getShiftKey()));
                System.out.println("====================================================");
            }
            else if (choiceNum == 2){
                System.out.println("====================================================");
                System.out.println("Enter text to receive decrypted text");
                String inputText2 = bufferedReader.readLine();
                System.out.println("====================================================");

                System.out.println("Enter shift value (Integer)");
                String shiftVal2 = bufferedReader.readLine();
                int shiftNum2 = Integer.parseInt(shiftVal2);

                Decode decode = new Decode(inputText2,shiftNum2);
                System.out.println("====================================================");
                System.out.println("Your decrypted text is -->"  + decode.decrypt(decode.getLetters(),decode.getShiftKey()));
                System.out.println("====================================================");
            }
            else{
                throw new IllegalArgumentException("Expected a number 1 or 2");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
