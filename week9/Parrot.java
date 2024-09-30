/* Names: Esmeralda Amado, Cristian Hernandez Juan
 * Course: CS2011
 * Section: 09 & 10
 * Description: A parrot asks for the user to input
 something so he can later repeat it but with an 
 exclamation mark at the end.
 * Other comments: N/A
 */

//import the scanner library
import java.util.Scanner;

public class Parrot{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    // user inputs a word or sentence
    System.out.print("Say something: ");
    String repeatWord = input.nextLine();
    
    // parrot repeats the user input with an 
    // exclamation mark
    System.out.println(repeatWord + "!");
    }
}