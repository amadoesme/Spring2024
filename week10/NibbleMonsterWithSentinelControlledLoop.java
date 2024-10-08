/* Names: Esmeralda Amado, Maxwell Phung
 * Course: CS2011
 * Section: 09 & 10
 * Description: Nibble monster asks for nibbles
 until the user enters 'Q' or 'q' the program stops.
 * Other comments: N/A
 */

import java.util.Scanner;

public class NibbleMonsterWithSentinelControlledLoop {
    public static void main(String[] args) {
        Scanner charReader = new Scanner(System.in);

        //declaring that myNib has to be a character and create a boolean
        char myNib;
        boolean isHappy = true;

        do {
            System.out.print("Monster hungry :E\nFeed monster a nibble :o ");
            myNib = charReader.next().charAt(0);

            //if the user inputs valid nibble values, the monster is happy
            if ((myNib >= '0' && myNib <= '9') ||
                (myNib >= 'A' && myNib <= 'F') ||
                (myNib >= 'a' && myNib <= 'f')) {
                System.out.println("Monster is happy! It wants more nibbles");
            }
            //if the user inputs 'Q' or 'q', the program will stop
            else if (myNib == 'Q' || myNib == 'q') {
                System.out.println("EWWWW! :O=" + myNib);
                isHappy = false;
            } 
            else {
                System.out.println("EWWWW! :O=" + myNib);
            }
        }
        //the program stops if the user gives the monster 'Q' or 'q'
        while (isHappy);

        System.out.println("Bye quitter.");
        charReader.close();
    }
}
