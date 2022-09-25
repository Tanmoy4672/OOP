/*
 vOWEL AND CONSONANT
 */
package first.print.project;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;
        System.out.print("Enter any letter:");
        letter = input.next().charAt(0); //0=first char //1=second char {array style}
        if (letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                System.out.println("VOWEL");
            } else {
                System.out.println("CONSONANT");
            }
        } else {
            System.out.println("It is not a Alphabet.");
        }
    }

}
