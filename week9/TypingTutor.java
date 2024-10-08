/* Names: Esmeralda Amado, Cristian Hernandez Juan 
 * Course: CS2011
 * Section: 09 & 10
 * Description: The program randomly generates a sequence
 of 4 letters and the user has to copy it. The user will have
 to copy the letters and the program will let them know if 
 they copied it correctly.
 * Other comments: N/A
 */

import java.util.Scanner;

public class TypingTutor{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        // this is how we randomly generate the letters for user to copy
        char ch1 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
        char ch2 = (char)('A' + (Math.random() * ('Z' - 'A' + 1)));
        char ch3 = (char)('A' + (Math.random() * ('Z' - 'A' + 1)));
        char ch4 = (char)('a' + (Math.random() * ('z' - 'a' + 1)));
        
        // connects the letter into one whole string
        String word = "" + ch1 + ch2 + ch3 + ch4;
        
        // output of the string so user can copy
        System.out.println("Type in the following: " + word);
        String wordToFollow = input.nextLine();
        
        // depending on what the user wrote the program will let 
        // them know how they did
        if(wordToFollow.equals(word)){
            System.out.print("You got it!");
        }
        else if(wordToFollow.equalsIgnoreCase(word)){
            System.out.print("Almost right, but mind the case next time.");
        }
        else{
           System.out.print("Wrong.");
        }
    }
}