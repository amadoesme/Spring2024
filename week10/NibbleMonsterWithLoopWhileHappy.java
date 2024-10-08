/* Names: Esmeralda Amado, Maxwell Phung
 * Course: CS2011
 * Section: 09 & 10
 * Description: Nibble monster asks for nibbles
 until the user gives something that is not a 
 nibble. The monster gets sad when it's not a 
 nibble and happy if it is a nibble.
 * Other comments: N/A
 */

import java.util.Scanner;

public class NibbleMonsterWithLoopWhileHappy {
    public static void main(String[] args) {
        Scanner charReader = new Scanner(System.in);
        
        //declaring that myNib has to be a character and creating a boolean
        char myNib;
        boolean isHappy = true;

        do {
            System.out.print("Monster hungry :E\nFeed monster a nibble :o ");
            myNib = charReader.next().charAt(0);

            //if the user inputs these values the user is happy and the program continues
            if ((myNib >= '0' && myNib <= '9') ||
                (myNib >= 'A' && myNib <= 'F') ||
                (myNib >= 'a' && myNib <= 'f')) {
                System.out.println("Monster is happy! It wants more nibbles");
            } 
            else {
                System.out.println("EWWW! :O=" + myNib +" Not a nibble!");
                isHappy = false;
            }
        } 
        //until an invalid input is provided the monster gets unhappy and
        //the program stops
        while (isHappy);
        System.out.println("The monster is no longer happy");
        charReader.close();
    }
}
