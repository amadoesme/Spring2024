/* Names: Esmeralda Amado, Cristian Hernandez Juan
 * Course: CS2011
 * Section: 09 & 10
 * Description: The user enters a word(s) and the output
 will be in an echo. At first it's loud and then it gets
 less louder and it starts fainting. 
 * Other comments: N/A
 */

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // user inputs one or more words into the program
        System.out.print("Please type in one or more words: ");
        String userWords = input.nextLine();
        
        // this checks if the input is shorter than 3 characters
        // checks if one or more of the last 3 letters is a character
        if (userWords.length() < 3 ||
            !(Character.isLetter(userWords.charAt(userWords.length() - 3))) ||
            !(Character.isLetter(userWords.charAt(userWords.length() - 2))) ||
            !(Character.isLetter(userWords.charAt(userWords.length() - 1)))) {
            System.out.print("Your entry must be at least 3 characters long, and the last three characters must be letters.");
        } 
        else { // echo from louder to less louder and fainted
            System.out.println(userWords.toUpperCase());
            System.out.println(userWords.substring(userWords.length() - 3, userWords.length()).toUpperCase());
            System.out.println(userWords.substring(userWords.length() - 3, userWords.length()).toLowerCase());
            System.out.println(userWords.substring(userWords.length() - 2, userWords.length()).toLowerCase());
            System.out.println(userWords.substring(userWords.length() - 1, userWords.length()).toLowerCase());
        }
        
        input.close(); // closes the program
    }
}


        
