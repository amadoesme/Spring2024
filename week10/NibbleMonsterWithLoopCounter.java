/* Names: Esmeralda Amado, Maxwell Phung
 * Course: CS2011
 * Section: 09 & 10
 * Description: Nibble monster ask's how many
 snacks the user has and the monster answers
 if they like the snack or not. Once the user
 gives all the snacks to the monster the program
 ends.
 * Other comments: N/A
 */

import java.util.Scanner;

public class NibbleMonsterWithLoopCounter {
    public static void main(String[] args) {
        Scanner charReader = new Scanner(System.in);
        
        //the user inputs the number of snacks it has for the monster
        System.out.print("How many snacks do you have for the nibble monster: ");
        int snacks = charReader.nextInt();
        
        //after the user tells the monster the number of snacks
        //the monster asks for them to start feeding him
        while (snacks > 0) {
            System.out.println("Monster hungry :E \n" 
                               + "Feed monster a nibble :o ");
            char myNib = charReader.next().charAt(0);
            
            //options that the user can feed the monster
            if (myNib >= '0' && myNib <= '9') {
                System.out.println("Nibble monster likes!");
            } 
            else if (myNib >= 'A' && myNib <= 'F') {
                System.out.println("Delish!");
            } 
            else if (myNib >= 'a' && myNib <= 'f') {
                System.out.println("Yummeh!");
            } 
            else {
                System.out.println("NO!");
            }
            snacks--; //this decrements the snacks count
        }
        charReader.close(); //closing the scanner after the loop
    }
}

