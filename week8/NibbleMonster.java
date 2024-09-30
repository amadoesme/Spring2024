/* Names: Esmeralda Amado, Arturo Garcia
 * Course: CS2011
 * Section: 09 & 10
 * Description: A monster requests nibbles and depending what
 the user inputs the monster will display a message.
 * Other comments: N/A
 */

//importing the scanner library
import java.util.Scanner;

public class NibbleMonster {
    public static void main(String[] args) {
        Scanner charReader = new Scanner(System.in);
        
        System.out.println("Monster hungry :E \n" 
                           + "Feed monster a nibble :o ");
        char myNib = charReader.next().charAt(0);
        

        if (myNib >= '0' && myNib <= '9') {
            System.out.println("Nibble monster likes!");
        } 
        else if (myNib >= 'A' && myNib <= 'F') {
            //bonus question, special nibble
            if (myNib == 'C') { 
                System.out.println("WOOO, I love the letter " 
                                   + myNib  
                                   + ", thank you human!");
                return; //program stops here if user inputs C
            } 
            System.out.println("Delish!");
        } 
        else if (myNib >= 'a' && myNib <= 'f') {
            System.out.println("Yummeh!");
        } 
        else {
            System.out.println("NO!");
        }
    }
}
