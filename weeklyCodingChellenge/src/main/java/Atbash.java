//Java: The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.
//
//        Create a function that takes a string and applies the Atbash cipher to it.
//
//        Examples
//        atbash("apple") --> "zkkov"
//
//        atbash("Hello world!") --> "Svool dliow!"
//
//        atbash("Christmas is the 25th of December") --> "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"
//
//        Notes:
//        Capitalisation should be retained.
//        Non-alphabetic characters should not be altered.


import java.util.Scanner;

public class Atbash {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String plainText = scanner.nextLine();
        String cipher = cipherEncryption(plainText);
        System.out.println(cipher);
    }

    private static String cipherEncryption(String plainText) {
        String reversedAlphabet = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        plainText = plainText.toUpperCase();

        String cipherText = "";
        for (int i  = 0; i < plainText.length(); i++) {
            char character = plainText.charAt(i);
            int positionOfCharacter = alphabet.indexOf(character);
            char cipherCharacter = reversedAlphabet.charAt(positionOfCharacter);
            cipherText += cipherCharacter;
        }
        return cipherText.toLowerCase();

    }


}

